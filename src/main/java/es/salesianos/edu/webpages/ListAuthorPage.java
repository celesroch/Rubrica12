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

import es.salesianos.edu.models.Author;
import es.salesianos.edu.repository.RepositoryAuthor;
import es.salesianos.edu.service.ServiceAuthor;

public class ListAuthorPage extends WebPage{
	
	private static final long serialVersionUID = -1935854748907274886L;
	
	@SpringBean
	ServiceAuthor service;
	
	@Autowired
	RepositoryAuthor repository;

	private List<Author> listAuthors = Collections.emptyList();
	

	public ListAuthorPage() {
		initC();
	}
	
	
	public void initC(){
		//addFormList();
		addViewListForm();
	}
	
	
	
	
	
	public void addViewListForm() {
		Author author = new Author();
		listAuthors = service.addListAuthor();
		ListView<Author> teams = new ListView<Author>("team-group", listAuthors) {
			@Override
			protected void populateItem(ListItem item) {
				Author team = (Author) item.getModelObject();
				item.add(new Label("name", team.getName()));
				item.add(new Label("fechaNacimiento", team.getFechaNacimiento()));
			}
		};
		add(teams);
	}
}
