package rechnen;

public class Objekte {

	public static void main(String[] args) {
		Geld betrag = new Geld(1.0d, "EUR");
		Geld betrag2 = new Geld(1.0d, "EUR");

		System.out.println("Gleich: " + betrag.equals(betrag2));
	}

}
