package rechnen;

public class Rechner {

	public static void main(String[] args) {
		Geld betrag1 = new Geld(23.45d, Currency.EUR);
		Geld betrag2 = new Geld(11.87d, Currency.EUR);

		Geld summe = betrag1.add(betrag2);
		Geld differenz = betrag1.substract(betrag2);
		System.out.println("Summe: " + summe.toString() //
				+ " Differenz: " + differenz.toString());
		Geld fremwaehrung = new Geld(67.99, Currency.USD);

		try {
			betrag1.add(fremwaehrung);
		} catch (IllegalArgumentException e) {
			System.out.println("Richtig!");
		}

	}

}
