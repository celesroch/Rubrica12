package es.salesianos.edu.models;

import java.io.Serializable;

public class Team implements Serializable{
	
	private String nameTeam;
	private String divisionTeam;
	public String getNameTeam() {
		return nameTeam;
	}
	public void setNameTeam(String nameTeam) {
		this.nameTeam = nameTeam;
	}
	public String getDivisionTeam() {
		return divisionTeam;
	}
	public void setDivisionTeam(String divisionTeam) {
		this.divisionTeam = divisionTeam;
	}

	
	

}
