package maradjah.org.main;

public class Score {

	private String gameScore;
	private String scoreWon, scoreLost;

	public String getScoreWon() {
		return scoreWon;
	}

	public void setScoreWon(String scoreWon) {
		this.scoreWon = scoreWon;
	}

	public String getScoreLost() {
		return scoreLost;
	}

	public void setScoreLost(String scoreLost) {
		this.scoreLost = scoreLost;
	}

	public Score() {
		super();
	}

	public Score(String gameScore) {
		super();
		this.gameScore = gameScore;
	}

	public String getGameScore() {
		return gameScore;
	}

	public void setGameScore(String gameScore) {
		this.gameScore = gameScore;
	}

	public String SimulateScoreDeuce() {
		GameOutput caseDeuce = new GameOutput();
		caseDeuce.addNumber(0, 0.3d);
		caseDeuce.addNumber(1, 0.4d);
		caseDeuce.addNumber(2, 0.2d);
		caseDeuce.addNumber(3, 0.05d);
		caseDeuce.addNumber(4, 0.05d);
		int score = caseDeuce.getDistributedRandomNumber();
		return String.valueOf(score) + " - " + String.valueOf(score);
	}

	public void SimulateScore() {
		int scoreWiningTeam, scoreLosingTeam;

		GameOutput scoreWon = new GameOutput();
		GameOutput scoreLost = new GameOutput();

		scoreLost.addNumber(0, 0.6d);
		scoreLost.addNumber(1, 0.3d);
		scoreLost.addNumber(2, 0.1d);

		scoreWon.addNumber(1, 0.5d);
		scoreWon.addNumber(2, 0.4d);
		scoreWon.addNumber(3, 0.1d);

		scoreLosingTeam = scoreLost.getDistributedRandomNumber();
		scoreWiningTeam = scoreLosingTeam + scoreWon.getDistributedRandomNumber();
		setScoreWon(String.valueOf(scoreWiningTeam));
		setScoreLost(String.valueOf(scoreLosingTeam));

	}

}
