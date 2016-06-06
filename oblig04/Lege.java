/**
* Klasse for Lege
*
* En lege har et unikt navn.
*
* @author Sebastian G. Winther-Larsen
*
*/

class Lege implements Lik{

	protected String navn;

	public Lege(String navn) {
		this.navn = navn;
	}

	public String hentNavn() {
		return navn;
	}

	public boolean samme(String etNavn) {
		if (etNavn.equals(navn)) {
			return true;
		} else {
			return false;
		}
	}
}
