package es.salesianos.edu.repository;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.Logger;

import es.salesianos.edu.connection.DataBase;
import es.salesianos.edu.models.Author;


@org.springframework.stereotype.Repository
public class RepositoryAuthor{

	 private DataBase db = new DataBase();

	public DataBase getDb() {
		return db;
	}

	public void setDb(DataBase db) {
		this.db = db;
	}
	
	public boolean insertAuthor (Author author) {
		db.getAuthor().add(author);
		return true;
	}
	
	public List<Author> listAuthor() {
		
		return db.getAuthor();
	}

	
}
