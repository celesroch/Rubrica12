package es.salesianos.edu.connection;


import java.util.ArrayList;

import es.salesianos.edu.models.Book;
import es.salesianos.edu.models.Author;

public class DataBase {

	private ArrayList<Author> author = new ArrayList<Author>();

	
	
	public ArrayList<Author> getAuthor() {
		return author;
	}

	public void setAuthor(ArrayList<Author> author) {
		this.author = author;
	}

	private ArrayList<Book> books = new ArrayList<Book>();

	public ArrayList<Book> getBooks() {
		return books;
	}

	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}
	

}
