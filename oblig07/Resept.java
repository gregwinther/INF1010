/**
* Klasse for Resept.
*
* Skal inneholde: 
* 1) et unikt nummer som starter på 0 med første resept
* 2) en peker til et legemiddel
* 3) navnet til legen som har skrevet ut resepten
* 4) navnet til pasienten som eier resepten
* 5) hvor mange ganger resepten kan brukes (som oppdateres),
* 6) mulighet for å bli ugyldig
*
* Noen resepter er blå, andre er hvite (subklasses)
*
* @author Sebastian G. Winther-Larsen
* */

class Resept {

	protected static int counter = 0;
	protected int reseptnummer;
	
	protected Legemiddel medisin;

	protected String legenavn;
	protected String pasientnavn;

	protected int reit;

	protected Boolean gyldig = true;

	public Resept(Legemiddel medisin, String legenavn, String pasientnavn,
		int reit) {

		this.medisin = medisin;
		
		this.legenavn = legenavn;
		this.pasientnavn = pasientnavn;

		this.reit = reit;

		this.reseptnummer = counter;
		counter++;
	}

	public int hentNr() {
		return reseptnummer;
	}

	public Legemiddel hentLegemiddel() {
		return medisin;
	}

	public void bruk() {
		if (!gyldig) {
			System.out.println("Resepten er ikke gyldig");
		} else {
			reit--;
			if (reit == 0) {
				gyldig = false;
			}
		}
	}

}




