/** Superklasse Enhet, med subklasser Boks, Kolonne og Rad.
*
* @author Sebastian G. Winther-Larsen
*
*/

import java.util.ArrayList;

class Enhet {

	ArrayList<Rute> ruter = new ArrayList<Rute>();

	Enhet() {}

	public void settInnRute(Rute r) {
		ruter.add(r);
	}

	public ArrayList<Rute> hentRuter() {
		return ruter;
	}

	public boolean harVerdi(int verdi) {
		for (Rute r: this.hentRuter()) {
			if (r.hentVerdi() == verdi) {
				return true;
			}
		}	
		return false;
	}

	public int hentAntall() {
		return ruter.size();
	}
}


// Subklasse Boks
class Boks extends Enhet{
	
	int raderBoks;
	int kolonnerBoks;

	Boks() {}

	Boks(int raderBoks, int kolonnerBoks) {
		this.raderBoks = raderBoks;
		this.kolonnerBoks = kolonnerBoks;
	}

}

// Subklasse Kolonne
class Kolonne extends Enhet {

	Kolonne() {}

}


// Subklasse Rad
class Rad extends Enhet {

	Rad() {}

}