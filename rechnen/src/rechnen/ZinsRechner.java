package rechnen;

import java.time.LocalDate;
import java.util.Random;

public class ZinsRechner {

	public static void main(String[] args) {
		LocalDate zinsbeginn = LocalDate.of(2021, 4, 1);
		Geld betrag = new Geld(10_000.00, Currency.EUR);
		double zinssatz = 4.12d;
		Zinsmethode zinsmethode = determineZinsmethode();
		Zinsberechnung zinsen = new Zinsberechnung(zinsbeginn, betrag, zinssatz, zinsmethode);

		Geld zinsbetrag = zinsen.calculateUpToToday();
		System.out.println("Bis heute: " + zinsbetrag);

		Geld erwarteteZinsen = zinsen.calculateUpToDate(LocalDate.of(2021, 12, 31));
		System.out.println("Bis Jahresende: " + erwarteteZinsen);

	}

	private static Zinsmethode determineZinsmethode() {
		// abhängig vom Konto wird die richtige Zinsmethode an Hand der Daten
		// ermittelt...
		if (new Random().nextBoolean()) {
			return new Act360();
		} else {
			return new Act365();
		}
	}

}
