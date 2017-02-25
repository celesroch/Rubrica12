package es.salesianos.edu.connection;

import java.util.ArrayList;

import es.salesianos.edu.models.Team;

public class DataBase {

	private ArrayList<Team> teams = new ArrayList<Team>();

	public ArrayList<Team> getTeams() {
		return teams;
	}

	public void setTeams(ArrayList<Team> teams) {
		this.teams = teams;
	}

}
