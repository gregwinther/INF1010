/**
* Subklasse av Resept
*
* Skal ha pris = 0 (gratis)
*
* @author Sebastian G. Winther-Larsen
*
*/

class HvitResept extends Resept {

	protected double pris;

	public HvitResept(Legemiddel medisin, Lege lege, Pasient pasient,
				int reit, double pris) {
		super(medisin, lege, pasient, reit);
		this.pris = pris;
	}

	public void settPris(double nyPris) {
		pris = nyPris;
	}

	public double hentPris() {
		return pris;
	}
}
