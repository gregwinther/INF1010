/**
* Elbil, subklasse av Bil.
* Skal i tillegg til aa arve egenskapene til en bil, ha en batteri-
* kapasitet. 
*
* @author Sebastian G. Winther-Larsen
*
*/ 

class Elbil extends Bil {

	protected int kapasitet;

	public Elbil(String regNr, int batteri) {
		super(regNr);
		kapasitet = batteri;
	}
	
	public void settKapasitet(int kapasitet) {
		this.kapasitet = kapasitet;
	}
	public int hentKapasitet() {
		return kapasitet;
	}
}
