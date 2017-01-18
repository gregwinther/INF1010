/* Klasse for en rotte
   Skal ha: 1) navn; 2) tilstander: levende, skadet, dod; 3) rapportering
   av tilstandsendring; 4) mulighet for å be om tilstand

   Sebastian G. Winther-Larsen
   sebastwi@student.matnat.uio.no
   @greg_winther
*/

class Rotte {

    private String navn;
    private String tilstand = "levende";
    private Boolean lever = true;

    public Rotte(String navn) {
	this.navn = navn;
    }

    public void angrip() {
	if (tilstand == "levende") {
	    tilstand = "skadet";
	    System.out.println("Rotten " + navn + " ble skadet.");
	} else if (tilstand == "skadet") {
	    tilstand = "dod";
	    lever = false;
	    System.out.println("Rotten " + navn + " ble drept.");
	} else {
	    System.out.println("Rotten " + navn + " er allerede doed"
			     + " eller befinner seg i uviss tilstand.");
	}
    }

    public Boolean lever() {
	return lever;
    }

    public String getNavn() {
	return navn;
    }
}
