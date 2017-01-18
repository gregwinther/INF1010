/* Klasse for en mus
   Skal ha 1) navn; 2) tilstander: levende og dod som skrives ut naar den
   endres; 3) metode som gir tilstanden.

   Sebastian G. Winther-Larsen
   sebastwi@student.matnat.uio.no
   @greg_winther
*/

class Mus {
    
    private String navn;
    private Boolean lever = true;

    public Mus(String navn) {
	this.navn = navn;
    }

    public void angrip() {
	if (lever) {
	    lever = false;
	    System.out.println("Musen " + navn + " ble drept.");
	} else {
	    System.out.println("Musen " + navn + " er allerde død.");
	}
    }

    public Boolean lever() {
	return lever;
    }

    public String getNavn() {
	return navn;
    }
}
