package es.salesianos.edu.webpages;

import java.awt.Container; 
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.RequiredTextField;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.spring.injection.annot.SpringBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.apache.wicket.markup.html.basic.Label;

import es.salesianos.edu.models.Book;
import es.salesianos.edu.repository.RepositoryBooks;
import es.salesianos.edu.service.ServiceBook;

public class ListBookPage extends WebPage{
	private static final long serialVersionUID = -1935854748907274886L;

	@SpringBean
	ServiceBook service;
	
	@Autowired
	RepositoryBooks repository;
	
	private List<Book> listBooks=Collections.emptyList();
	
	public ListBookPage(){
		initC();
	}
	
	public void initC(){
		addViewListForm();
	}
	
	public void addViewListForm(){
		Book book = new Book();
		listBooks=service.addListBook();
		ListView<Book> books = new ListView<Book>("team-group",listBooks){
			@Override
			protected void populateItem(ListItem item){
				Book book = (Book) item.getModelObject();
				item.add(new Label("bookName",book.getTitle()));
				item.add(new Label("bookAuthor",book.getAuthor()));
			}

		};
		add(books);
	}
}
