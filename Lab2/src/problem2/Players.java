package problem2;

public class Players {
	String name_surname;
	int quantity_goals;
	int cnt_club_trophies;
	Country_trophy country_trophy;
	
	Players(String name_surname, int quantity_goals){
		this.name_surname = name_surname;
		this.quantity_goals = quantity_goals;
	}
	
	public void setClubTrophy(int cnt_club_trophies) {
		this.cnt_club_trophies = cnt_club_trophies;
	}
	public int getClubTrophy() {
		return cnt_club_trophies;
	}
	public void setCountryTrophy(Country_trophy country_trophy) {
		this.country_trophy = country_trophy;
	}
	public Country_trophy getCountryTrophy() {
		return country_trophy;
	}
	
	
	
}
enum Country_trophy{WorldCup, EuroCup, Nothing} 
