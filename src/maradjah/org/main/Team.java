package maradjah.org.main;

import java.util.ArrayList;

public class Team {

	private String name;
	private int rate;
	private int groupeScore;
	private ArrayList<String> gamesScore = new ArrayList<String>();
	private String coach;
	private String creationDate;

	public Team() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Team(String name, int rate, int groupScore, String coach, String creationDate) {
		super();
		this.name = name;
		this.rate = rate;
		this.groupeScore = groupScore;
		this.coach = coach;
		this.creationDate = creationDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public int getGroupeScore() {
		return groupeScore;
	}

	public void setGroupeScore(int groupeScore) {
		this.groupeScore = groupeScore;
	}

	public ArrayList<String> getGamesScore() {
		return gamesScore;
	}

	public void setGamesScore(ArrayList<String> gamesScore) {
		this.gamesScore = gamesScore;
	}

	public String getCoach() {
		return coach;
	}

	public void setCoach(String coach) {
		this.coach = coach;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	@Override
	public String toString() {
		return name;
	}

}
