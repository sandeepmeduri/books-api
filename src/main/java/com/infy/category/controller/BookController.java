package com.infy.category.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.infy.category.CurrencyConversion;
import com.infy.category.entity.Book;
import com.infy.category.repository.BookRepository;

@RestController
public class BookController {
	
	private BookRepository repository;
	
	@Autowired
	private static Environment environment;
	
	@Autowired
	public BookController(BookRepository repository) {
		this.repository = repository;
	}
	
	public static Double convertCurrency(String from, String to, Double price) {

		Map<String, String> uriVariables = new HashMap<>();
		uriVariables.put("from", from);
		uriVariables.put("to", to);

		ResponseEntity<CurrencyConversion> responseEntity = new RestTemplate().getForEntity(
				"http://localhost:8982/api/currency-exchange/from/{from}/to/{to}", CurrencyConversion.class, uriVariables);

		CurrencyConversion response = responseEntity.getBody();
		
		return response.getConversion();
	}

	@GetMapping("/api/books")
	public List<Book> getUserOrder() {
		List<Book> books = (List<Book>) repository.findAll();
		books.stream().forEach(p -> {
			p.setPriceInEUR(p.getPrice()/convertCurrency("EUR","INR",p.getPrice()));
			p.setPriceInUsd(p.getPrice()/convertCurrency("USD","INR",p.getPrice()));
		});
		return books;
	}

}
