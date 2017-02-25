package es.salesianos.edu.repository;

import java.util.List;

import es.salesianos.edu.connection.DataBase;
import es.salesianos.edu.models.Book;

@org.springframework.stereotype.Repository
public class RepositoryBooks {

	private DataBase db = new DataBase();

	public DataBase getDb() {
		return db;
	}

	public void setDb(DataBase db) {
		this.db = db;
	}
	public boolean insertBook(Book book){
		db.getBooks().add(book);
		return true;
	}
	public List<Book> listBook(){
		
		return db.getBooks();
	}
	
	
}
