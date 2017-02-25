package es.salesianos.edu.repository;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.Logger;

import es.salesianos.edu.connection.DataBase;
import es.salesianos.edu.models.Team;


@org.springframework.stereotype.Repository
public class Repository{

	 private DataBase db = new DataBase();

	public DataBase getDb() {
		return db;
	}

	public void setDb(DataBase db) {
		this.db = db;
	}
	
	public boolean insertTeam (Team team) {
		db.getTeams().add(team);
		return true;
	}
	
	public List<Team> listTeams() {
		
		return db.getTeams();
	}

	
}
