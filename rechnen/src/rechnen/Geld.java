package rechnen;

public class Geld {
	private final String waehrung;
	private final double betrag;

	public Geld(double betrag, String waehrung) {
		super();
		this.waehrung = waehrung;
		this.betrag = betrag;
	}

	public Geld(double betrag) {
		this(betrag, "EUR");
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

	@Override
	public String toString() {
		return "Geld [waehrung=" + waehrung + ", betrag=" + betrag + "]";
	}

	private void validateAmount(Geld geld) {
		if (betrag - geld.betrag < 0.0) {
			throw new IllegalArgumentException("Negatives Geld gibt es nicht.");
		}
	}

	private void validateCurrency(Geld geld) {
		if (!this.waehrung.equals(geld.waehrung)) {
			throw new IllegalArgumentException("Unterschiedliche Währungen kann ich nicht verrechnen");
		}

	}

}
