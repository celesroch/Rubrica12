package es.salesianos.edu.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import es.salesianos.edu.models.Book;
import es.salesianos.edu.repository.RepositoryBooks;

@Component
public class ServiceBook {
	@Autowired
	RepositoryBooks repository;
	
	public boolean insert(Book book){
		repository.insertBook(book);
		return true;
	}
	public boolean show(){
		
		return true;
	}
	
	public List<Book> addListBook(){
		
		return repository.getDb().getBooks();
	}
	
}
