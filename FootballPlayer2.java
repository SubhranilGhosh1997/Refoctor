package com.refoctor.test;

public class FootballPlayer2 {

	private String playerName = "";

	private String college = "";

	private double fortyYardDash = 0.0;

	private int repsBenchPress = 0;

	private double sixtyYardDash = 0.0;

	public FootballPlayer2(String playerName, String college, double fortyYardDash, int repsBenchPress,
			double sixtyYardDash) {
		super();
		this.playerName = playerName;
		this.college = college;
		this.fortyYardDash = fortyYardDash;
		this.repsBenchPress = repsBenchPress;
		this.sixtyYardDash = sixtyYardDash;
	}

	public String getPlayerName() {
		return playerName;
	}

	public String getCollege() {
		return college;
	}

	public double getFortyYardDash() {
		return fortyYardDash;
	}

	public int getRepsBenchPress() {
		return repsBenchPress;
	}

	public double getSixtyYardDash() {
		return sixtyYardDash;
	}

	public FootballPlayer2(String playerName, String college,

			double fortyYardDash, int repsBenchPress) {

		this(playerName, college, fortyYardDash, repsBenchPress, 0.0);

	}

	public FootballPlayer2(String playerName, String college,

			double fortyYardDash, double sixtyYardDash) {

		this(playerName, college, fortyYardDash, 0, sixtyYardDash);

	}

	public static void main(String[] args) {

		FootballPlayer2 subhranil = new FootballPlayer2("Subhranil Ghosh", "MAKAUT", 4.53, 10.75);

		System.out.println(subhranil.getPlayerName());

		System.out.println(subhranil.getCollege());

		System.out.println(subhranil.getFortyYardDash());

		System.out.println(subhranil.getRepsBenchPress());

		System.out.println(subhranil.getFortyYardDash());

	}

}
