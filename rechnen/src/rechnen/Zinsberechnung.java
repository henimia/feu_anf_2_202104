package rechnen;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Zinsberechnung {
	private final LocalDate zinsbeginn;
	private final Geld betrag;
	private double zinssatz;

	public Zinsberechnung(LocalDate zinsbeginn, Geld betrag, double zinssatz) {
		this.zinsbeginn = zinsbeginn;
		this.betrag = betrag;
		this.zinssatz = zinssatz;
	}

	public Geld calculateUpToToday() {
		return calculateUpToDate(LocalDate.now());
	}

	public Geld calculateUpToDate(LocalDate zinsende) {
		validatePeriod(zinsende);
		long days = zinsbeginn.until(zinsende, ChronoUnit.DAYS);
		return betrag.multiply(zinssatz / 100 * days / 360);
	}

	private void validatePeriod(LocalDate zinsende) {
		if (zinsende.isBefore(zinsbeginn)) {
			throw new IllegalArgumentException("Zinsende darf nicht vor Zinsbeginn liegen.");
		}

	}

}
