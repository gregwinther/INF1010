public class Butikk {
	private Person nesteKunde;

	public void entreButikk(Person p) {
		if (nesteKunde == null) {
			nesteKunde = p;
		} else {
			Person temp = nesteKunde;
			while (p.hentNestePerson() != null) {
				temp = temp.hentNestePerson();
			}
			temp.settNestePerson(p);
		}
	}

	public void kasse() {
		while (nesteKunde != null) {
			System.out.print(nesteKunde.hentNavn());
			System.out.print(" kjoeper ");
			System.out.println(nesteKunde.hentGjenstand());
			System.out.println("Ha det bra!");
			nesteKunde = nesteKunde.hentNestePerson();	
		}
	}

}
