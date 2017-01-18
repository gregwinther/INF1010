/**
* Subklasse som arver fra Legemiddel
*
* @author Sebastian G. Winther-Larsen
*
*/

class LegemiddelA extends Legemiddel {	
	
	protected int hvorNarkotisk;
	
	public LegemiddelA(String navn, double virkestoff,
			int hvorNarkotisk) {
		super(navn, virkestoff);
		this.hvorNarkotisk = hvorNarkotisk;	
	}

}	
