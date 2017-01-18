/**
* Subklasse som arver fra Legemiddel
*
* @author Sebastian G. Winther-Larsen
*
*/

class MiksturA extends LegemiddelA implements Mikstur {

	protected double volum;

	public MiksturA(String navn, double virkestoff, 
			int hvorNarkotisk, double volum) {
	super(navn, virkestoff, hvorNarkotisk);
	this.volum = volum;
	}

	public double hentVolum() {
		return volum;
	}

	public double hentVirkestoffPerVolum() {
		return (virkestoff/volum);
	}
}	
