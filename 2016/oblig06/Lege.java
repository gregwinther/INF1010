/**
* Klasse for Lege
*
* En lege har et unikt navn.
*
* @author Sebastian G. Winther-Larsen
*
*/

class Lege implements Comparable<Lege>, Lik{

	protected String navn;

	public Lege(String navn) {
		this.navn = navn;
	}

	public String hentNavn() {
		return navn;
	}

	public int compareTo(Lege lege) {
		return (navn.compareTo(lege.hentNavn())); 
	}

	public boolean samme(String s) {
		return (navn.equals(s));
	}
}
