package com.infy.category.repository;

import org.springframework.data.repository.CrudRepository;

import com.infy.category.entity.Book;

public interface BookRepository extends CrudRepository<Book, Integer>{

}
