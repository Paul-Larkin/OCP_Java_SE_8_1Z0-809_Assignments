package assignment3;

public class Assignment3_6 {

	public static void main(String[] args) {
		Footballer[] players = {new Footballer("Hazard", "Real Madrid"),
								new Footballer("Pogba", "Man Utd"),
								new Footballer("Ronaldo", "Juventus")};
		for(int index = 0; index < players.length; index++) {
			System.out.println(players[index] + " is at index " + index);
		}
	}

}// class

class Footballer {
	private String name;
	private String team;
	
	public Footballer(String name, String team) {
		this.name = name;
		this.team = team;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	@Override
	public String toString() {
		return name;
	}
}// class
