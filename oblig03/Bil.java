/**
* Bil superklasse.
* Skal ha et bilnummer.
*
* @author Sebastian G. Winther-Larsen
*
*/

class Bil {
	
	protected String regNr;

	public Bil(String denne) {
		regNr = denne;
	}

	public void settRegNr(String denne) {
		regNr = denne;
	}

	public String hentRegNr() {
		return regNr;
	}
}	
	
