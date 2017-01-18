/**
* Subklasse som arver fra Legemiddel
*
* @author Sebastian G. Winther-Larsen
*
*/

class PilleC extends Legemiddel implements Piller {

	protected int antallPiller;

	public PilleC(String navn, double virkestoff,
			int antallPiller) {
	super(navn, virkestoff);
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
