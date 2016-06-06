/**
* klasse Rute
*
* Maa inneholde verdi.
* Men maa ogsaa ha pekere til objekter av klassen:
* Boks, Rad og Kolonne.
*
* @author Sebastian G. Winther-Larsen
*
*/

import java.util.ArrayList;

class Rute {
	
	private int verdi;

	private Rad rad;
	private Kolonne kolonne;
	private Boks boks;

	// Constructor
	Rute(int verdi) {
		this.verdi = verdi;
	}

	// Finner mulige tall
	public int[] finnAlleMuligeTall() {

		int dimensjon;
		ArrayList<Integer> ulovligeTall = new ArrayList<Integer>();
		ArrayList<Integer> lovligeTall = new ArrayList<Integer>();

		// Finner antall tall jeg skal ha fra vilkaarlig objekt.
		//dimensjon = rad.hentRuter().size();

		// Leter i rad
		dimensjon = rad.hentAntall();
		for (int i = 1; i <= dimensjon; i++) {
			if (rad.harVerdi(i)) {
				ulovligeTall.add(i);
			}
		}
		
		// Leter i kolonne
		dimensjon = kolonne.hentAntall();
		for (int i = 1; i <= dimensjon; i++) {
			if (kolonne.harVerdi(i)) {
				ulovligeTall.add(i);
			}
		}

		// Leter i boks
		dimensjon = boks.hentAntall();
		for (int i = 1; i <= dimensjon; i++) {
			if (boks.harVerdi(i)) {
				ulovligeTall.add(i);
			}
		}
		
		// Lager liste over lovlige tall
		for (int i = 1; i <= dimensjon; i++) {
			if (!ulovligeTall.contains(i)) {
				lovligeTall.add(i);
			}
		}

		int antallLovlige = lovligeTall.size();
		int[] lovligeTall2 = new int[antallLovlige];

		for (int i = 0; i < antallLovlige; i++) {
			lovligeTall2[i] = lovligeTall.get(i);
		}

		return lovligeTall2;

	}

	public void settRad(Rad r) {rad = r;}
	public Rad hentRad() {return rad;}
	
	public void settKolonne(Kolonne k) {kolonne = k;}
	public Kolonne hentKolonne() {return kolonne;}
	
	public void settBoks(Boks b) {boks = b;}
	public Boks hentBoks() {return boks;}

	public void settVerdi(int v) {verdi = v;}
	public int hentVerdi() {return verdi;}
}