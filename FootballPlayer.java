package com.refoctor.test;

public class FootballPlayer {

	private double passerRating;
	private int rushingYards;
	private int receivingYards;
	private int totalTackles;
	private int interceptions;
	private int fieldGoals;
	private double avgPunt;
	private double avgKickoffReturn;
	private double avgPuntReturn;

	public FootballPlayer(double passerRating, int rushingYards, int receivingYards, int totalTackles,
			int interceptions, int fieldGoals, double avgPunt, double avgKickoffReturn, double avgPuntReturn) {
		super();
		this.passerRating = passerRating;
		this.rushingYards = rushingYards;
		this.receivingYards = receivingYards;
		this.totalTackles = totalTackles;
		this.interceptions = interceptions;
		this.fieldGoals = fieldGoals;
		this.avgPunt = avgPunt;
		this.avgKickoffReturn = avgKickoffReturn;
		this.avgPuntReturn = avgPuntReturn;
	}



	public double getPasserRating() {
		return passerRating;
	}



	public int getRushingYards() {
		return rushingYards;
	}



	public int getReceivingYards() {
		return receivingYards;
	}



	public int getTotalTackles() {
		return totalTackles;
	}



	public int getInterceptions() {
		return interceptions;
	}



	public int getFieldGoals() {
		return fieldGoals;
	}



	public double getAvgPunt() {
		return avgPunt;
	}



	public double getAvgKickoffReturn() {
		return avgKickoffReturn;
	}



	public double getAvgPuntReturn() {
		return avgPuntReturn;
	}



	public static FootballPlayer createQB(double passerRating, int rushingYards){

       return new FootballPlayer(passerRating, rushingYards, 0, 0, 0, 0, 0.0,
               0.0, 0.0);
   }
   public static FootballPlayer createWR(int rushingYards, int receivingYards){
       return new FootballPlayer(0, rushingYards, receivingYards, 0, 0, 0, 0.0,
               0.0, 0.0);
   }
   public static FootballPlayer createKicker(int fieldGoals, double avgPunt){
       return new FootballPlayer(0, 0, 0, 0, 0, 38, 37.8,

               0.0, 0.0);

   }

	public static void main(String[] args) {
		FootballPlayer aaron = FootballPlayer.createQB(108.0, 259);
		        FootballPlayer calvin = FootballPlayer.createWR(11, 1964);
		        FootballPlayer sebastian = FootballPlayer.createKicker(31, 33.0);
		        System.out.println("Aaron Passer Rating: " + aaron.getPasserRating());
		        System.out.println("calvin rushing Yards ratings: "+calvin.getRushingYards());
	}

}
