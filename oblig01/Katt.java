/* Dette er en klasse for en katt.
   En katt skal: 1) ha et navn; 2) kunne jakte.
   
   Sebastian G. Winther-Larsen
   sebastwi@student.matnat.uio.no
   @greg_winther
*/

class Katt {

    private String navn;

    public Katt(String navn) {
	this.navn = navn;
    }

    public void jakt(Bol<Mus> musebol, Bol<Rotte> rottebol) {
	
	Boolean gotMouse = false;
	Boolean gotRat = false;

	// Tar ut mus for undersoekelse
	Mus mus = musebol.taUt();
	if (mus == null) { // Musebolet er tomt
	    gotMouse = false;
	} else if (mus.lever()) { // Lever musen?
	    gotMouse = true;
	    musebol.settInn(mus); // Setter mus tilbake
	}

	// Tar ut rotte for undersoekelse
	Rotte rotte = rottebol.taUt();
	if (rotte == null) { // Rottebolet er tomt
	    gotRat = false;
	} else if (rotte.lever()) { // Lever rotten?
	    gotRat = true;
	    rottebol.settInn(rotte); // Legger rotte tilbake
	}

	if (gotMouse) { // Angriper mus
	    System.out.println("Katten " + navn + " angrep musen "
			   + mus.getNavn());
	    mus.angrip();
	} else if (gotRat) { // Angriper rotte
	    System.out.println("Katten " + navn + " angrep rotta "
			   + rotte.getNavn());
	    rotte.angrip();
	} else {
	    System.out.println("Katten " + navn +
			   " fant ingen gnagere. Jakten avsluttes.");
	}
    }
}
