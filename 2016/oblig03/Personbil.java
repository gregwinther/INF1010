/**
* Personbil, subklasse av Fossilbil.
* En personbil kan ha et antall pasasjerer.
*
* @author Sebastian G. Winther-Larsen
*
*/

class Personbil extends Fossilbil {

	protected int antallPassasjerer;

	public Personbil(String regNr, double utslipp, int seter) {
		super(regNr, utslipp);
		antallPassasjerer = seter;
	}

	public void settPassasjerer(int passasjerer) {
		antallPassasjerer = passasjerer;
	}

	public int hentPassasjerer() {
		return antallPassasjerer;
	}
}
