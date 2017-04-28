package main;

public class Player{
	private int gamesPlayedPercent, gamesPlayedMentalmath, gamesPlayedDivision,
				 gamesWonPercent, gamesWonMentalmath, gamesWonDivision;

	public Player(){
		gamesPlayedPercent = 0;
		gamesPlayedMentalmath = 0;
		gamesPlayedDivision = 0;
		gamesWonPercent = 0;
		gamesWonMentalmath = 0;
		gamesWonDivision = 0;
	}
	
	public void setResult(boolean result, int type){
		if(type == 1){
			playedPercent(result);
		}else if(type == 2){
			playedDivision(result);
		}else if(type == 3){
			playedMentalmath(result);
		}else if(type == 4){
			
		}
	}

	private void playedMentalmath(boolean result){
		gamesPlayedMentalmath++;
		if(result){
			gamesWonMentalmath++;
		}
	}	

	private void playedDivision(boolean result){
		gamesPlayedDivision++;
		if(result){
			gamesWonDivision++;
		}
	}

	private void playedPercent(boolean result){
		gamesPlayedPercent++;
		if(result){
			gamesWonPercent++;
		}
	}
	
	private int getTotalGamesWon(){
		return gamesWonPercent + gamesWonDivision + gamesWonMentalmath;
	}
	
	private int getTotalGamesPlayed(){
		return gamesPlayedPercent + gamesPlayedDivision + gamesPlayedMentalmath;
	}
	
	private int getTotalGamesLost(){
		return getTotalGamesPlayed() - getTotalGamesWon();
	}

	private float getWinLoseRatio(){
		if(getTotalGamesWon() == 0){
			return 0;
		}else if(getTotalGamesLost() == 0){
			return (float)getTotalGamesWon();
		}else{
			return (float)getTotalGamesWon() / (float)getTotalGamesLost();
		}

	}

	public String showStats(){
		return "\nSpiele gespielt: " + getTotalGamesPlayed() + "\nSpiele gewonnen: " + getTotalGamesWon() + "\nRatio: " + getWinLoseRatio() + "\n**************************************************\nKopfrechnen gespielt: " + gamesPlayedMentalmath + "\nKopfrechnen gewonnen: " + gamesWonMentalmath + "\n**************************************************\nDivision gespielt: " + gamesPlayedDivision + "\nDivision gewonnen: " + gamesWonDivision + "\n**************************************************\nProzentrechnung gespielt: " + gamesPlayedPercent + "\nProzentrechnung gewonnen: " + gamesWonPercent;
	}
}