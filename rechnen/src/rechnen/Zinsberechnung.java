package rechnen;

import java.time.LocalDate;

public class Zinsberechnung {
	private final LocalDate zinsbeginn;
	private final Geld betrag;
	private final double zinssatz;
	private final Zinsmethode zinsmethode;

	public Zinsberechnung(LocalDate zinsbeginn, Geld betrag, double zinssatz, Zinsmethode zinsmethode) {
		this.zinsbeginn = zinsbeginn;
		this.betrag = betrag;
		this.zinssatz = zinssatz;
		this.zinsmethode = zinsmethode;
	}

	public Geld calculateUpToToday() {
		return calculateUpToDate(LocalDate.now());
	}

	public Geld calculateUpToDate(LocalDate zinsende) {
		validatePeriod(zinsende);
		return zinsmethode.execute(betrag, zinssatz, zinsbeginn, zinsende);
	}

	private void validatePeriod(LocalDate zinsende) {
		if (zinsende.isBefore(zinsbeginn)) {
			throw new IllegalArgumentException("Zinsende darf nicht vor Zinsbeginn liegen.");
		}

	}

}
