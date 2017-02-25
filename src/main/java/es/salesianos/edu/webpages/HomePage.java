package es.salesianos.edu.webpages;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;

public class HomePage extends WebPage{
	
	public HomePage() {
		BookmarkablePageLink link1 = 
			new BookmarkablePageLink("linkPlayerForm", 
			PlayerPage.class);
		BookmarkablePageLink link3 = 
				new BookmarkablePageLink("linkPlayerList", 
				PlayerPage.class);
		
		BookmarkablePageLink link2 = 
				new BookmarkablePageLink("linkTeamForm", 
				TeamPage.class);
		BookmarkablePageLink link4 = 
				new BookmarkablePageLink("linkTeamList", 
				ListTeamPage.class);
		
		add(link1);
		add(link3);
		add(link2);
		add(link4);
	}

}
