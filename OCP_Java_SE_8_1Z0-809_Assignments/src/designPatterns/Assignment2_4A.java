package designPatterns;

public class Assignment2_4A {

	public static void main(String[] args) {

		MusicConductor bob = new MusicConductor();
		String piece = "The Four Seasons by Vivaldi";
		Instrument violin = new Violin("Violin");
		Instrument clarinet = new Clarinet("Clarinet");
		Instrument frenchHorn = new FrenchHorn("French Horn");
		bob.callThePlay(piece, violin, clarinet, frenchHorn);
	}// main
}// class
abstract class Instrument {
	String name;
	public Instrument(String name) {
		this.name = name;
	}
	public String play(String piece) {
		return name + " playing " + piece;
	}
}// class
class Violin extends Instrument{
	public Violin(String name) {
		super(name);
	}
}// class
class Clarinet extends Instrument{
	public Clarinet(String name) {
		super(name);
	}
}// class
class FrenchHorn extends Instrument{
	public FrenchHorn(String name) {
		super(name);
	}
}// class
class MusicConductor {
	public void callThePlay(String piece, Instrument... i) {
		System.out.println("The orchestra is about to begin...");
		for(Instrument inst: i) {
			System.out.println(inst.play(piece));
		}
	}
}// class