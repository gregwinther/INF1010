/**
* Subklasse av Resept
*
* Skal ha pris = 0 (gratis)
*
* @author Sebastian G. Winther-Larsen
*
*/

class BlaaResept extends Resept {

	protected double pris = 0;

	public BlaaResept(Legemiddel medisin, Lege lege, Pasient pasient,
				int reit) {
		super(medisin, lege, pasient, reit);
	}

	public void settPris(double nyPris) {
		pris = nyPris;
	}

	public double hentPris() {
		return pris;
	}
}
