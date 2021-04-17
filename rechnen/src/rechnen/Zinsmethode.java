package rechnen;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public interface Zinsmethode {

	Geld execute(Geld betrag, double zinssatz, LocalDate zinsbeginn, LocalDate zinsende);

	static long calculateDays(LocalDate zinsbeginn, LocalDate zinsende) {
		return zinsbeginn.until(zinsende, ChronoUnit.DAYS);
	}

	static double zinssatzDecimal(double zinssatz) {
		return zinssatz / 100;
	}

	// Beispiele
	default void someMethod() {
		System.out.println(privateMethod());
	}

	private String privateMethod() {
		return "Default Method.";
	}

}
