package es.salesianos.edu.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import es.salesianos.edu.models.Author;
import es.salesianos.edu.repository.RepositoryAuthor;
@Component
public class ServiceAuthor {
	
	@Autowired
	RepositoryAuthor repository;
		
	public boolean insert(Author author) {
		repository.insertAuthor(author);
		
		return true;
	}
	
	public boolean show() {
		
		return true;
	}
	
	public List<Author> addListAuthor() {
		return repository.getDb().getAuthor();
	}
}
