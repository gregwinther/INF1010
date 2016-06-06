/**
* Klasse for Bok som kan implementere grensesnittet TilUtlaan.
*
* @author Sebastian Winther-Larsen
*/

class Bok implements TilUtlaan {

	private String tittel;
	private String forfatter;
	private String utlaaner;

	/**
	* Konstruktoer for klassen bok.
	*
	* @param tittel Bokens tittel.
	* @param forfatter Bokens forfatter.
	*/
	public Bok(String tittel, String forfatter) {
		this.tittel = tittel;
		this.forfatter = forfatter;
	}
	
	public void laanUt(String bibliotek) {
		if (utlaaner != null) {
			System.out.println("Boken er allerede utlaant.");
		} else {
			utlaaner = bibliotek;
		}
	}

	public void leverTilbake() {
		utlaaner = null;
	}

	public String hentTittel() {
		return tittel;
	}
	
	public String hentForfatter() {
		return forfatter;
	}

}
