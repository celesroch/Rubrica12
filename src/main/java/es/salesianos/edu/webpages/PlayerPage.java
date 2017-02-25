package es.salesianos.edu.webpages;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.spring.injection.annot.SpringBean;

import es.salesianos.edu.service.ServiceBook;

public class PlayerPage extends WebPage{
	
	@SpringBean
	ServiceBook servicePlayer;
	
	public PlayerPage() {
		
	}

}
