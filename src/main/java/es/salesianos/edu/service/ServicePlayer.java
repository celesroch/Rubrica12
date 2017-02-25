package es.salesianos.edu.service;

import java.util.ArrayList;
import java.util.List;

import es.salesianos.edu.models.Player;

public class ServicePlayer {
	
	List<Player> listPlayers = new ArrayList<Player>();
	
	public boolean insert(Player player) {
		
		return true;
	}
	
	public boolean show() {
		
		return true;
	}
	
	public String search(Player player) {
		String playerSearched = ""; 
		
		// ÑAPA
		/*for(int i = 0; i < listPlayers.size(); i++){
			if(listPlayers(i).getName() == player.getName()) {
				playerSearched = listPlayers(i).getName();
			}
		}*/
		
		return playerSearched;
	}
}
