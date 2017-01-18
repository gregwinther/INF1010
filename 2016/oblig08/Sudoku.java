/**
* klasse Sudoku
*
* klasse som definerer hele spillet.
* leser og skriver
*
* @author Sebastian G. Winther-Larsen
*
*/

import java.util.ArrayList;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.lang.IllegalArgumentException;
import java.lang.IndexOutOfBoundsException;
import java.util.Arrays;

class Sudoku {

	// Antall rader og kolonner i en boks.
	int raderBoks = 0;
	int kolonnerBoks = 0;

	// Midlertidige filnavn
	private String filNavnInn = "data.txt";

	// Brett
	private Brett brett;

	private static char TOM_RUTE_TEGN = '.';

	// Tom konstruktoer
	Sudoku() {}

	public void lesFil() {

		// Dimensjonsvariabel, inneholder "nesten" all informasjon.
		int dimensjon = 0; 

		// Ruter som leses inn
		Rute[][] ruter = new Rute[0][0]; 

		try {
		// FileNotFoundException
		BufferedReader data = new BufferedReader(new FileReader(filNavnInn));

		String linje;
		int linjeNr = 0;

		// IOException
		while ((linje = data.readLine()) != null) {
			linjeNr++;

			// Leser linje 1 hvor antall rader i en boks er spesifisert.
			if (linjeNr == 1) {

				raderBoks = Integer.parseInt(linje);
			
			// Leser linje 2 hvor antall kolonner i en boks er spesifisert.
			} else if (linjeNr == 2) {

				kolonnerBoks = Integer.parseInt(linje);
				dimensjon = raderBoks * kolonnerBoks;
				if (dimensjon > 64) { // Brett for stort?
					throw new IndexOutOfBoundsException();
				}
				ruter = new Rute[dimensjon][dimensjon];

			// Leser resten av filen som inneholder Sudokubrettet.
			} else {
				
				//System.out.println("Linje: " + linjeNr);

				// her er linjeNr-3 rad og i er kolonne
				for (int i = 0; i < linje.length(); i++) {
					
					char tegn;
					int verdi;

					// Boer sette inn unntak for lovlig intervall ogsaa

					tegn = linje.charAt(i); // Henter tegn fra fil
					verdi = tegnTilVerdi(tegn);
					//System.out.println(verdi);
					
					// Setter i brett
					ruter[(linjeNr-3)][i] = new Rute(verdi);

				}
				 
			}
		}

		// Lager brett-objekt
		brett = new Brett(raderBoks, kolonnerBoks, ruter);

		} catch (FileNotFoundException e) {
			System.out.println("Finner ikke fil :" + e);
		} catch (IOException e) {
			System.out.println("Feil ved lesing av fil: " + e);
		} catch (IllegalArgumentException e) {
			System.out.println("Kan ikke konvertere " + e + "til tegn.");
		} catch (IndexOutOfBoundsException e) { // Antagelig feil unntak å bruke!
			System.out.println("Sudokubrettet er for stort.");
		}
	}

	public void skrivBrett() {

		int dimensjon, raderBoks, kolonnerBoks;
		Rute[][] ruter;

		dimensjon = brett.hentDimensjon();
		raderBoks = brett.hentRaderBoks();
		kolonnerBoks = brett.hentKolonnerBoks();
		ruter = brett.hentRuter();
		//System.out.print(" ");

		for (int i = 0; i < dimensjon; i++) {
			for (int j = 0; j < dimensjon; j++) {
				if ((j > 0) && (kolonnerBoks % j == 0) && (j != 1)) {
					System.out.print("|");	
				}
				if (ruter[i][j].hentVerdi() == 0) {
					System.out.print(" ");
				} else {
					System.out.print(ruter[i][j].hentVerdi());
				}
			}
			System.out.println();
			if ((i > 0) && ((i + 1) % raderBoks == 0) && (i < dimensjon - 1)) {
				int k = 0;
				while (k < dimensjon) {
					if ((k > 1) && (k % kolonnerBoks == 0)) {
						System.out.print("+");
					}
					System.out.print("-");
					k++;
				}
			System.out.println();
			}
		}
	}

	public Brett hentBrett() { return brett; }

	/**
     * Oversetter et tegn (char) til en tallverdi (int)
     *
     * @param tegn      tegnet som skal oversettes
     * @return          verdien som tegnet tilsvarer
     */
    public static int tegnTilVerdi(char tegn) {
        if (tegn == TOM_RUTE_TEGN) {                // tom rute
            return 0;
        } else if ('1' <= tegn && tegn <= '9') {    // tegn er i [1, 9]
            return tegn - '0';
        } else if ('A' <= tegn && tegn <= 'Z') {    // tegn er i [A, Z]
            return tegn - 'A' + 10;
        } else if (tegn == '@') {                   // tegn er @
            return 36;
        } else if (tegn == '#') {                   // tegn er #
            return 37;
        } else if (tegn == '&') {                   // tegn er &
            return 38;
        } else if ('a' <= tegn && tegn <= 'z') {    // tegn er i [a, z]
            return tegn - 'a' + 39;
        } else {                                    // tegn er ugyldig
            return -1;
        }
    }

    /**
     * Oversetter en tallverdi (int) til et tegn (char)
     *
     * @param verdi     verdien som skal oversettes
     * @param tom       tegnet som brukes for aa representere 0 (tom rute)
     * @return          tegnet som verdien tilsvarer
     */
    public static char verdiTilTegn(int verdi, char tom) {
        if (verdi == 0) {                           // tom
            return tom;
        } else if (1 <= verdi && verdi <= 9) {      // tegn er i [1, 9]
            return (char) (verdi + '0');
        } else if (10 <= verdi && verdi <= 35) {    // tegn er i [A, Z]
            return (char) (verdi + 'A' - 10);
        } else if (verdi == 36) {                   // tegn er @
            return '@';
        } else if (verdi == 37) {                   // tegn er #
            return '#';
        } else if (verdi == 38) {                   // tegn er &
            return '&';
        } else if (39 <= verdi && verdi <= 64) {    // tegn er i [a, z]
            return (char) (verdi + 'a' - 39);
        } else {                                    // tegn er ugyldig
            throw new IllegalArgumentException();    
        }
    }
}