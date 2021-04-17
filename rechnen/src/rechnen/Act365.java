package rechnen;

import java.time.LocalDate;

public class Act365 implements Zinsmethode {

	@Override
	public Geld execute(Geld betrag, double zinssatz, LocalDate zinsbeginn, LocalDate zinsende) {
		long days = Zinsmethode.calculateDays(zinsbeginn, zinsende);
		final double zinssatzDecimal = Zinsmethode.zinssatzDecimal(zinssatz);
		System.out.println("Using Act/365");
		return betrag.multiply(zinssatzDecimal * days / 365);
	}

}
