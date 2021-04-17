package rechnen;

import java.text.DecimalFormat;
import java.util.Objects;

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
	public int hashCode() {
		return Objects.hash(betrag, waehrung);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Geld other = (Geld) obj;
		return Double.doubleToLongBits(betrag) == Double.doubleToLongBits(other.betrag) && waehrung == other.waehrung;
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
			throw new IllegalArgumentException("Unterschiedliche Währungen kann ich nicht verrechnen");
		}

	}

}
