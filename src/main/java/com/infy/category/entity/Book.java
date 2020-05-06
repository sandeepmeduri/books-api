package com.infy.category.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="books")
public class Book {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@NotNull
	private String title;
	
	@NotNull
	private String author;
	
	@Transient
	private Double price = 25.0;
	
	@Transient
	private Double priceInEUR = 0.0;
	
	@Transient
	private Double priceInUsd = 0.0;
	
	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getPriceInEUR() {
		return priceInEUR;
	}

	public void setPriceInEUR(Double priceInEUR) {
		this.priceInEUR = priceInEUR;
	}

	public Double getPriceInUsd() {
		return priceInUsd;
	}

	public void setPriceInUsd(Double priceInUsd) {
		this.priceInUsd = priceInUsd;
	}

	public Book() {
		
	}

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", priceInEUR=\" + priceInEUR + \"]";
	}
	
}
