/**
* Subklasse som arver fra Legemiddel
*
* @author Sebastian G. Winther-Larsen
*
*/

class MiksturB extends LegemiddelB implements Mikstur {

	protected double volum;

	public MiksturB(String navn, double virkestoff, 
			int vanedannende, double volum) {
	super(navn, virkestoff, vanedannende);
	this.volum = volum;
	}

	public double hentVolum() {
		return volum;
	}

	public double hentVirkestoffPerVolum() {
		return (virkestoff/volum);
	}
}	
