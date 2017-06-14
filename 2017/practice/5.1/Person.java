public class Person {
	private String navn;
	private String gjenstand;
	private Person nestePerson;

	Person() {};

	Person(String navn, String gjenstand, Person nestePerson) {
		this.navn = navn;
		this.gjenstand = gjenstand;
		this.nestePerson = nestePerson;
	}

	public void settNavn(String nyttNavn) {
		this.navn = nyttNavn;
	}

	public String hentNavn() {
		return navn;
	}

	public void settGjenstand(String nyGjenstand) {
		this.gjenstand = nyGjenstand;
	}

	public String hentGjenstand() {
		return gjenstand;
	}

	public void settNestePerson(Person nyPerson) {
		this.nestePerson = nyPerson;
	}

	public Person hentNestePerson() {
		return nestePerson;
	}

}
