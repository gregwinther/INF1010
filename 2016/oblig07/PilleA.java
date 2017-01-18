/**
* Subklasse som arver fra Legemiddel
*
* @author Sebastian G. Winther-Larsen
*
*/

class PilleA extends LegemiddelA implements Piller {

	protected int antallPiller;

	public PilleA(String navn, double virkestoff, 
			int hvorNarkotisk, int antallPiller) {
	super(navn, virkestoff, hvorNarkotisk);	
	this.antallPiller = antallPiller;
	}
	
	public int hentAntallPiller() {
		return antallPiller;
	}

	public double hentVirkestoffPerPille() {
		double piller = (double) antallPiller;
		return (virkestoff/piller);
	}

}	
