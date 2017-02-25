package es.salesianos.edu.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import es.salesianos.edu.models.Team;
import es.salesianos.edu.repository.Repository;
@Component
public class ServiceTeam {
	
	@Autowired
	Repository repository;
		
	public boolean insert(Team team) {
		repository.insertTeam(team);
		
		return true;
	}
	
	public boolean show() {
		
		return true;
	}
	
	public List<Team> addListTeam() {
		return repository.getDb().getTeams();
	}
}
