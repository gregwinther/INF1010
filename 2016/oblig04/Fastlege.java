/**
* Fastlege, Subklasse av Lege
*
* Arver alt fra Lege og har i tillegg et avtalenummer.
*
* @author Sebastian G. Winther-Larsen
*
*/

class Fastlege extends Lege implements Lik, Kommuneavtale {

	protected int avtalenummer;

	public Fastlege(String navn, int avtalenummer) {
		super(navn);
		this.avtalenummer = avtalenummer;
	}

	public void settAvtale(int nyttnummer) {
		avtalenummer = nyttnummer;
	}

	public int hentAvtale() {
		return avtalenummer;
	}
}
