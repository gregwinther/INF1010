/**
* Subklasse av Resept
*
* Skal vaere gratis.
*
* @author Sebastian G. Winther-Larsen
*
*/

class BlaaResept extends Resept {

	public BlaaResept(Legemiddel medisin, String legenavn, 
			String pasientnavn, int reit) {
		super(medisin, legenavn, pasientnavn, reit);
	}
}
