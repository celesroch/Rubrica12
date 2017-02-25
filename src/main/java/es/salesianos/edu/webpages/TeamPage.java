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

import es.salesianos.edu.models.Team;
import es.salesianos.edu.repository.Repository;
import es.salesianos.edu.service.ServiceTeam;

public class TeamPage extends WebPage{
	
	private static final long serialVersionUID = -1935854748907274886L;
	
	@SpringBean 
	ServiceTeam serviceTeam;
	
	@Autowired
	Repository repository;
	
	public TeamPage() {
		
		Form form = new Form("formInsertTeam", new CompoundPropertyModel(new Team())) {
				
			@Override
			protected void onSubmit() {
				super.onSubmit();
				Team newTeam = new Team();
				//casteo para que sepa que es un team. con el getModelObject accedo al valor que haya en los inputs
				newTeam.setNameTeam(((Team) getModelObject()).getNameTeam());
				newTeam.setDivisionTeam(((Team)getModelObject()).getDivisionTeam());
				serviceTeam.insert(newTeam);
				//addViewList();
			}
		};
		
		form.add(new Label("nameTeamLabel", getString("team.name")));
		form.add(new Label("divisionTeamLabel", getString("team.division")));
		form.add(new RequiredTextField("nameTeam"));
		form.add(new RequiredTextField("divisionTeam"));
		
		add(form);
		
	}
	
	
}
