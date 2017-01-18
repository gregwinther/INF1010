/**
* Klasse for en Pasient.
*
* En skal ha 1) navn, 2) foedselsnummer, 3) adresse delt i veiadresse og postnr.
* 4) identifikasjonsnummer.
*
* @author Sebastian G. Winther-Larsen
* 
*/

class Pasient {

	protected String navn;
	protected double fnr; // Kan ikke bruke int. Vil vaere stoerre enn MAX

	protected String adresse;
	protected int postnr;

	protected static int counter = 0;
	protected int ID;

	public Pasient(String navn, double fnr, String adresse, int postnr) {
		
		this.navn = navn;
		this.fnr = fnr;
		this.adresse = adresse;
		this.postnr = postnr;
		this.ID = counter;
		counter++;
	}

	public String hentNavn() {
		return navn;
	}
	
	public int hentID() {
		return ID;
	}
}
