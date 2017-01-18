/**
* Subklasse som arver fra Legemiddel
*
* @author Sebastian G. Winther-Larsen
*
*/

class PilleB extends LegemiddelB implements Piller {
	
	protected int antallPiller;

	public PilleB(String navn, double virkestoff, 
			int vanedannende, int antallPiller) {
	super(navn, virkestoff, vanedannende);	
	this.antallPiller = antallPiller;
	}

	public int hentAntallPiller() {
		return antallPiller;
	}

	public double hentVirkestoffPerPille() {
		double piller = (double) antallPiller;
		return virkestoff/piller;
	}	 	
}	
