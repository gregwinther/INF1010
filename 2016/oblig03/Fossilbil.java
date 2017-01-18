/**
* Fossilbil, subklasse av klassen Bil
* Skal ha CO2-utslipp
*
* @author Sebastian G. Winther-Larsen
*
*/

class Fossilbil extends Bil {

	protected double emission;

	public Fossilbil(String regNr, double utslipp) {
		super(regNr);
		emission = utslipp;
	}

	public void settUtslipp(double utslipp) {
		emission = utslipp;
	}

	public double hentUtslipp() {
		return emission;		
	}
}
