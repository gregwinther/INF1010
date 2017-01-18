/**
* klasse Brett
*
* Fungerer som en beholder for Rute-objekter i tillegg til
* aa holde styr paa hvilke egenskaper brettet har.
* Egenskaper er: 
* rader i en boks (raderBoks), 
* kolonner i en boks (kolonnerBoks),
* ruter i kolonne, boks, rad (dimensjon=raderBoks*kolonnerBoks)
* antall ruter til sammen (ruterTotalt=dimensjon*dimensjon)
* 
* @author Sebastian G. Winther-Larsen
*
*/

class Brett {

	private int raderBoks;
	private int kolonnerBoks;
	private int dimensjon;
	private int ruterTotalt;

	// Matrise (eller 2D-array) av ruter
	private Rute[][] ruter;

	// Constructor	
	Brett (int raderBoks, int kolonnerBoks, Rute[][] ruter) {

		this.raderBoks = raderBoks;
		this.kolonnerBoks = kolonnerBoks;

		dimensjon = raderBoks * kolonnerBoks;
		// Naa skal dimensjon == ruter.length()

		ruterTotalt = dimensjon * dimensjon;

		this.ruter = ruter;
	}

	public void opprettDatastruktur() {

		// Legger til rader
		int i = 0;
		int j = 0;
		while (i < dimensjon) {
			Rad rad = new Rad();
			while(j < dimensjon) {
				rad.settInnRute(ruter[i][j]);
				ruter[i][j].settRad(rad);
				j++;
			}
			j = 0;
			i++;
		}
		
		// Legger til kolonner
		i = 0;
		j = 0;
		while (j < dimensjon) {
			Kolonne kolonne = new Kolonne();
			while(i < dimensjon) {
				kolonne.settInnRute(ruter[i][j]);
				ruter[i][j].settKolonne(kolonne);
				i++;
			}
			i = 0;
			j++;
		}

		// Legger til bokser
		i = 0;
		j = 0;
		int k = 0;
		int l = 0;
		while (k < dimensjon) { // rad av bokser
			while (l < dimensjon) { // kolonne av bokser
				Boks boks = new Boks();
				// Her kjøres det gjennom en hel boks
				while (i < raderBoks) { // rad i boksen
					while (j < kolonnerBoks) {
							boks.settInnRute(ruter[i+k][j+l]);
							ruter[i+k][j+l].settBoks(boks);
						j++;
					}
					j = 0;
					i++;
				}
				i = 0;
				l = l + kolonnerBoks;
			}
			l = 0;
			k = k + raderBoks;
		}
	}

	public int hentDimensjon() {
		return dimensjon;
	}

	public int hentRaderBoks() {
		return raderBoks;
	}

	public int hentKolonnerBoks() {
		return kolonnerBoks;
	}

	public int hentRuterTotalt() {
		return ruterTotalt;
	}

	public Rute[][] hentRuter() {
		return ruter;
	}



}