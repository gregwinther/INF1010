/**
* Subklasse som arver fra Legemiddel
*
* @author Sebastian G. Winther-Larsen
*
*/

class LegemiddelB extends Legemiddel {

	protected int vanedannende;

	public LegemiddelB(String navn, double virkestoff,
			int vanedannende) {

		super(navn, virkestoff);
		this.vanedannende = vanedannende;
	}

}	
