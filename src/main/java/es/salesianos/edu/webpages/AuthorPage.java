package es.salesianos.edu.webpages;


import java.util.ArrayList;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.RequiredTextField;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.spring.injection.annot.SpringBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.apache.wicket.markup.html.basic.Label;

import es.salesianos.edu.models.Author;
import es.salesianos.edu.repository.RepositoryAuthor;
import es.salesianos.edu.service.ServiceAuthor;

public class AuthorPage extends WebPage{
	
	private static final long serialVersionUID = -1935854748907274886L;
	
	@SpringBean 
	ServiceAuthor serviceTeam;
	
	@Autowired
	RepositoryAuthor repository;
	
	public AuthorPage() {
		
		Form form = new Form("formInsertAuthor", new CompoundPropertyModel(new Author())) {
				
			@Override
			protected void onSubmit() {
				super.onSubmit();
				Author newAuthor = new Author();
				//casteo para que sepa que es un team. con el getModelObject accedo al valor que haya en los inputs
				newAuthor.setName(((Author) getModelObject()).getName());
				newAuthor.setFechaNacimiento(((Author)getModelObject()).getFechaNacimiento());
				serviceTeam.insert(newAuthor);
				//addViewList();
			}
		};
		
		form.add(new Label("nameBookLabel", "Nombre del libro"));
		form.add(new Label("fechaNacBookLabel","Fecha de nacimiento"));
		form.add(new RequiredTextField("name"));
		form.add(new RequiredTextField("fechaNacimiento"));
		
		add(form);
		
	}
	
	
}
