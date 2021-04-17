package rechnen;

import java.time.LocalDate;

public class Act360 implements Zinsmethode, NameCarrier {

	@Override
	public Geld execute(Geld betrag, double zinssatz, LocalDate zinsbeginn, LocalDate zinsende) {
		long days = Zinsmethode.calculateDays(zinsbeginn, zinsende);
		final double zinssatzDecimal = Zinsmethode.zinssatzDecimal(zinssatz);
		System.out.println("Using " + getName());
		return betrag.multiply(zinssatzDecimal * days / 360);
	}

	@Override
	public String getName() {
		return "Act360";
	}

}
