/**
* Subklasse som arver fra Legemiddel
*
* @author Sebastian G. Winther-Larsen
*
*/

class MiksturC extends LegemiddelC implements Mikstur {

	protected double volum;

	public MiksturC(String navn, double virkestoff, 
			 double volum) {
	super(navn, virkestoff);
	this.volum = volum;
	}
	
	public double hentVolum() {
		return volum;
	}

	public double hentVirkestoffPerVolum() {
		return (virkestoff/volum);
	}
}	
