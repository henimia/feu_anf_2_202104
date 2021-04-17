package rechnen;

public class Waehrungsprobleme {

	public static void main(String[] args) {
		final Currency[] values = Currency.values();

		System.out.println(values[Currency.EUR.ordinal()]);

		Geld eigeneWaehrung = new Geld(1.0d, Currency.of("zoeller"));

	}

}
