package es.salesianos.edu.webpages;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.spring.injection.annot.SpringBean;

import es.salesianos.edu.service.ServicePlayer;

public class PlayerPage extends WebPage{
	
	@SpringBean
	ServicePlayer servicePlayer;
	
	public PlayerPage() {
		
	}

}
