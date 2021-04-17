package vererbung;

import java.util.Arrays;
import java.util.List;

public class VererbungApp {

	public static void main(String[] args) {
		List<AbstractPerson> personen = Arrays.asList(//
				new Student("Petra", "Beliebig"), //
				new Mitarbeiter("Frank", "Meyer"));

		// Alternative zu for-each-Schleife
		// Method reference
		personen.forEach(System.out::println);
		// Lambda
		personen.forEach(p -> System.out.println(p.getLastname()));

		for (AbstractPerson person : personen) {
			if (person instanceof Student) {
				System.out.println(((Student) person).getMatrikelnummer());
			} else {
				System.out.println(((Mitarbeiter) person).getMitarbeiternummer());
			}
		}
	}

}
