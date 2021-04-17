package rechnen;

import java.time.LocalDate;

public class ZinsRechner {

	public static void main(String[] args) {
		LocalDate zinsbeginn = LocalDate.of(2021, 4, 1);
		Geld betrag = new Geld(10_000.00, Currency.EUR);
		double zinssatz = 4.12d;
		Zinsberechnung zinsen = new Zinsberechnung(zinsbeginn, betrag, zinssatz);

		Geld zinsbetrag = zinsen.calculateUpToToday();
		System.out.println("Bis heute: " + zinsbetrag);

		Geld erwarteteZinsen = zinsen.calculateUpToDate(LocalDate.of(2021, 12, 31));
		System.out.println("Bis Jahresende: " + erwarteteZinsen);

		try {
			zinsen.calculateUpToDate(LocalDate.of(2020, 12, 31));
		} catch (IllegalArgumentException e) {
			System.out.println("Richtig");
		}
	}

}
