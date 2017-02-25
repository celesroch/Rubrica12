package es.salesianos.edu.webpages;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.RequiredTextField;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.spring.injection.annot.SpringBean;
import org.springframework.beans.factory.annotation.Autowired;

import es.salesianos.edu.models.Book;
import es.salesianos.edu.repository.RepositoryAuthor;
import es.salesianos.edu.service.ServiceBook;
import es.salesianos.edu.service.ServiceAuthor;

public class BookPage extends WebPage{

private static final long serialVersionUID = -1935854748907274886L;
	
	@SpringBean 
	ServiceBook serviceBook;
	
	@Autowired
	RepositoryAuthor repository;
	
	public BookPage() {
		
		Form form = new Form("formInsertBook", new CompoundPropertyModel(new Book())) {
				
			@Override
			protected void onSubmit() {
				super.onSubmit();
				Book newBook = new Book();
				//casteo para que sepa que es un team. con el getModelObject accedo al valor que haya en los inputs
				newBook.setTitle(((Book) getModelObject()).getTitle());
				newBook.setAuthor(((Book)getModelObject()).getAuthor());
				serviceBook.insert(newBook);
				//addViewList();
			}
		};
		
		form.add(new Label("titleBookLabel", "Titulo de libro"));
		form.add(new Label("authorBookLabel","Autor del libro"));
		form.add(new RequiredTextField("title"));
		form.add(new RequiredTextField("author"));
		
		add(form);
		
	}
	
}
