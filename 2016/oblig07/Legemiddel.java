/**
* Superklasse Legemiddel.
* Implementerer grensesnittet Piller
* 
*
* @author Sebastian G. Winther-Larsen
*
*/

abstract class Legemiddel {
	
	protected String navn;
	protected double pris;
	protected int ID;
	protected double virkestoff;
	
	protected static int counter = 0; // Teller antall legemidler

	public Legemiddel(String navn, double virkestoff) {	
		this.navn = navn;
		this.virkestoff = virkestoff;
		ID = counter;	
		counter++;  
	}

	public void settPris(double nyPris) {
		pris = nyPris;		
	}

	public double hentPris() {
		return pris;
	}

	public int hentID() {
		return ID;
	}

	public String hentNavn() {
		return navn;
	}

	public double hentVirkestoff() {
		return virkestoff;
	}
}
