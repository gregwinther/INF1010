/**
* Subklasse av Resept
*
* Skal ha pris = 0 (gratis)
*
* @author Sebastian G. Winther-Larsen
*
*/

class HvitResept extends Resept {

	protected double pris = 0;

	public HvitResept(Legemiddel medisin, String legenavn, 
				String pasientnavn, int reit) {
		super(medisin, legenavn, pasientnavn, reit);
	}

	public void settPris(double nyPris) {
		pris = nyPris;
	}

	public double hentPris() {
		return pris;
	}
}
