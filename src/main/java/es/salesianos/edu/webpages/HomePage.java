package es.salesianos.edu.webpages;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;

public class HomePage extends WebPage{
	
	public HomePage() {
		BookmarkablePageLink link1 = 
			new BookmarkablePageLink("linkBookrForm", 
			BookPage.class);
		BookmarkablePageLink link3 = 
				new BookmarkablePageLink("linkBookrList", 
						ListBookPage.class);
		
		BookmarkablePageLink link2 = 
				new BookmarkablePageLink("linkTeamForm", 
				AuthorPage.class);
		BookmarkablePageLink link4 = 
				new BookmarkablePageLink("linkTeamList", 
				ListAuthorPage.class);
		
		add(link1);
		add(link3);
		add(link2);
		add(link4);
	}

}
