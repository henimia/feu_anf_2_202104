package rechnen;

import java.text.DecimalFormat;

public class Geld {
	private final Currency waehrung;
	private final double betrag;

	public Geld(double betrag, Currency waehrung) {
		super();
		this.waehrung = waehrung;
		this.betrag = betrag;
	}

	public Geld(double betrag) {
		this(betrag, Currency.valueOf("EUR"));
	}

	public Geld add(Geld geld) {
		validateCurrency(geld);
		final double betragsSumme = betrag + geld.betrag;
		return new Geld(betragsSumme, waehrung);
	}

	public Geld substract(Geld geld) {
		validateCurrency(geld);
		validateAmount(geld);
		final double result = betrag - geld.betrag;
		return new Geld(result, waehrung);
	}

	public Geld multiply(double faktor) {
		return new Geld(this.betrag * faktor, waehrung);
	}

	@Override
	public String toString() {
		return "Geld [waehrung=" + waehrung + ", betrag=" //
				+ new DecimalFormat("#.##").format(betrag) + "]";
	}

	private void validateAmount(Geld geld) {
		if (betrag - geld.betrag < 0.0) {
			throw new IllegalArgumentException("Negatives Geld gibt es nicht.");
		}
	}

	private void validateCurrency(Geld geld) {
		if (!this.waehrung.equals(geld.waehrung)) {
			throw new IllegalArgumentException("Unterschiedliche W�hrungen kann ich nicht verrechnen");
		}

	}

}
