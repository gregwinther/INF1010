/**
* Der alt knyttes sammen!
*
* Skal lese og skrive
*
* @author Sebastian G. Winther-Larsen
*
*/

import java.util.Arrays;

class Oblig08 {

	public static void main(String[] args) {

		// Nytt spill
		Sudoku sudoku = new Sudoku();

		// Lese inn
		sudoku.lesFil();

		// Oppretter struktur
		sudoku.hentBrett().opprettDatastruktur();

		// Skriv til terminal
		sudoku.skrivBrett();

		// Proever aa finne mulige
		Brett brett = sudoku.hentBrett();
		Rute[][] ruter = brett.hentRuter();
		Rute rute1 = ruter[0][0];

		System.out.println();
		System.out.println("Mulige tall i rute 1,1: ");
		System.out.println(Arrays.toString(rute1.finnAlleMuligeTall()));

	}
}