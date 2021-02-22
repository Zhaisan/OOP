package problem2;
import java.util.Vector;

public class FootballPlayers {
	final int maxGoals = 500;
	final int maxClubTrophy = 30;

	public static void title() {
		System.out.println("The best goal scorers ever:");
	}
	
	Vector<Players> players = new Vector<Players>();
	public void football(Players name) {
		players.add(name);
	}
	
	public void football() {
		for(int i = 0; i < players.size(); i++) {
			if((players.get(i).quantity_goals > maxGoals || players.get(i).getCountryTrophy() == Country_trophy.WorldCup 
					|| players.get(i).getCountryTrophy() == Country_trophy.EuroCup )) {
				System.out.println(players.get(i).name_surname);
				
			}
		}
	}
	
	public static void main(String[] args) {
		title();
		FootballPlayers fb = new FootballPlayers();
		Players player1 = new Players("David Beckham", 250);
		Players player2 = new Players("Cristiano Ronaldo", 763);
		Players player3 = new Players("Leo Messi", 764);
		player1.setClubTrophy(30);
		player2.setClubTrophy(32);
		player3.setClubTrophy(35);
		player1.setCountryTrophy(Country_trophy.WorldCup);
		player1.setCountryTrophy(Country_trophy.EuroCup);
		player1.setCountryTrophy(Country_trophy.Nothing);
		fb.football(player1);
		fb.football(player2);
		fb.football(player3);
		fb.football();
		
		
		

	}

}
