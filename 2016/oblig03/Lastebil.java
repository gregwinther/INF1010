/**
* Lastebil, subklasse av Fossilbil
* Denne klassen har en nyttevekt
*
* @author Sebastian G. Winther-Larsen
*
*/

class Lastebil extends Fossilbil {

	protected double nyttevekt;

	public Lastebil(String regNr, double utslipp, double maksLast) {
		super(regNr, utslipp);
		nyttevekt = maksLast;
	}

	public void settNyttevekt(double lastevekt) {
		if (lastevekt < 0 ) {
			System.out.println("Ha! Din dust. En lastebil kan ikke "
							+ "lastes med noe som har negativ masse.");
		} else {
			nyttevekt = lastevekt;
		}
	}
	
	public double hentNyttevekt() {
		return nyttevekt;	
	}
} 

