package vererbung;

public class Mitarbeiter extends AbstractPerson {
	private static long counter = 0;
	private long mitarbeiternummer;

	public Mitarbeiter(String name, String lastname) {
		super(name, lastname);
		this.mitarbeiternummer = ++counter;
	}

	public long getMitarbeiternummer() {
		return mitarbeiternummer;
	}

	@Override
	public String toString() {
		return "Mitarbeiter [mitarbeiternummer=" + mitarbeiternummer + ", name=" + name + ", lastname=" + lastname
				+ "]";
	}

}
