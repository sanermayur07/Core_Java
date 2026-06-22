class Player{
	String name;
	int age;
	String country;
	int matchesPlayed;
	int jersyNo;
	
	Player(){
		
	}
	
	Player(String name,int age,String country,int matchesPlayed,int jersyNo){
		this.name = name;
		this.age = age;
		this.country = country;
		this.matchesPlayed = matchesPlayed;
		this.jersyNo = jersyNo;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	String getName() {
		return this.name;
	}
	
	void setAge(int age) {
		this.age = age;
	}
	
	int getAge() {
		return this.age ;
	}
	
	void setCountry(String country) {
		this.country = country;
	}
	
	String getCountry() {
		return this.country;
	}
	
	void setMatchesPlayed(int matchesPlayed) {
		this.matchesPlayed = matchesPlayed;
	}
	
	int getMatchesPlayed() {
		return this.matchesPlayed;
	}

	void display() {
		System.out.println("Player Name: "+this.name);
		System.out.println("Age: "+this.age);
		System.out.println("Country Name: "+this.country);
		System.out.println("Matches Played: "+this.matchesPlayed);
		System.out.println("Jersy Number: "+this.jersyNo);
	}
}
	//class palyer ends here

class CricketPlayer extends Player{
	int totalRuns;
	int totalWickets;
	String battingStyle;
	String bowlingStyle;
	
     CricketPlayer() {
		
	}
     
     CricketPlayer(String name,int age,String country,int matchesPlayed,int jersyNo,int totalRuns,int totalWickets,String battingStyle,String bowlingStyle){
    	 super(name,age,country,matchesPlayed,jersyNo);
    	 this.totalRuns = totalRuns;
    	 this.totalWickets = totalWickets;
    	 this.battingStyle = battingStyle;
    	 this.bowlingStyle = bowlingStyle;
    	 
     }
     
     void setTotalRuns(int totalRuns) {
    	 this.totalRuns = totalRuns;
     }
     
     int getTotalRuns() {
    	 return this.totalRuns;
     }
     
     void setTotalWickets(int totalWickets) {
    	 this.totalWickets = totalWickets;
     }
     
     int getTotalWickets() {
    	 return this.totalWickets;
     }
     
     void setBattingStyle(String battingStyle) {
    	 this.battingStyle = battingStyle;
     }
     
     String getBattingStyle() {
    	 return this.battingStyle;
     }
     
     void setBowlingStyle(String bowlingStyle) {
    	 this.bowlingStyle = bowlingStyle;
     }
     
     String getBowlingStyle() {
    	 return this.bowlingStyle;
     }
     
     void display() {
    	 super.display();
    	 System.out.println("Total Runs: "+this.totalRuns);
    	 System.out.println("Total Wickets: "+this.totalWickets);
    	 System.out.println("Batting Style: "+this.battingStyle);
    	 System.out.println("Bowling Style: "+this.bowlingStyle);
     }
}
//class CricketPlayer ends here

class FootballPlayer extends Player{
	int totalGoals;
	String playingPosition;
	
	 FootballPlayer() {
		
	} 
	 
	 FootballPlayer(String name,int age,String country, int matchesPlayed,int jersyNo,int totalGoals,String playingPosition){
		 super(name,age,country,matchesPlayed,jersyNo);
		 
		 this.totalGoals = totalGoals;
		 this.playingPosition = playingPosition;
	 }
	 
	 void setTotalGoals(int totalGoals) {
		 this.totalGoals = totalGoals;
	 }
	 
	 int getTotalGoals() {
		 return this.totalGoals;
	 }
	 
	 void setPlayingPosition(String playingPosition) {
		 this.playingPosition = playingPosition;
	 }
	 
	 String getPlayingPosition() {
		 return this.playingPosition;
	 }
	 
	 void display() {
		super.display();
		 System.out.println("Total Goals: "+this.totalGoals);
		 System.out.println("Playing Position: "+this.playingPosition);
	 }
	 
	 //class football ends here
}
public class PlayerClass {
	public static void main(String[] args) {
		
		CricketPlayer c1= new CricketPlayer("Rohit Sharma",40,"India",500,45,10000,20,"Right-hand batsmen","Right-arm medium");
		
		FootballPlayer f1= new FootballPlayer("Lionel Messi",37,"Argentina",1000,10,800,"Forward");
		
		System.out.println("========Cricket Player Details==========");
		c1.display();
		System.out.println();// for space between cricketplayer or football player
		System.out.println("==========Football Player Details==========");
		f1.display();
		
		
	}

}
