/**
* Generisk hylle som kan inneholde ting av valgfri art.
* Har en stoerrelse som paramater
*
* @author Sebastian G. Winther-Larsen
*/

class Hylle<T> implements GenHylle<T> {
		
	private int antallPlasser;
	private T[] denne;

	public Hylle(int s) {
		antallPlasser = s;
		denne = (T[]) new Object[s];
	}

	public int hentStor() {
		return antallPlasser;
	}

	public void sett(T ting, int plass) {
		if (plass<0 || plass>(antallPlasser-1)) {
			System.out.println("Denne plassen finnes ikke i hyllen.");
		} else if (denne[plass] == null) {
			denne[plass] = ting;
		} else {
		System.out.println("Det er allerede noe paa denne plassen");
		}
	}

	public void ledig(int plass) {
		if (denne[plass] == null) {
			System.out.println("Plassen er ledig");
		} else {
			System.out.print("Her er det allerede en bok");
		}
	}

	public T hent(int plass) {
		T temp = denne[plass];
		denne[plass] = null;
		return temp;
		
	}

}
