package vererbung;

import java.util.UUID;

public class Student extends AbstractPerson {
	private String matrikelnummer;

	public Student(String name, String lastname) {
		super(name, lastname);
		this.matrikelnummer = UUID.randomUUID().toString();
	}

	public String getMatrikelnummer() {
		return matrikelnummer;
	}

	@Override
	public String toString() {
		return "Student [matrikelnummer=" + matrikelnummer + ", name=" + name + ", lastname=" + lastname + "]";
	}

}
