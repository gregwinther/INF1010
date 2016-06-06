/* Hovedklasse for Obligatorisk Innlevering 1 i INF1010

   Gjennomkjoering:
   
   Implacable:oblig01 greg_winther$ javac *.java
   Implacable:oblig01 greg_winther$ java Oblig1
   Katten Lucifer fant ingen gnagere. Jakten avsluttes.
   Katten Lucifer angrep rotta Professor Padraic Ratigan
   Rotten Professor Padraic Ratigan ble skadet.
   Dette bolet er bebodd.
   Katten Lucifer angrep musen Basil of Baker Street
   Musen Basil of Baker Street ble drept.

   Sebastian G. Winther-Larsen
   sebastwi@student.matnat.uio.no
   @greg_winther
*/

class Oblig1 {

    public static void main(String[] args) {

	//  1 Lage musebol og rottebol.
	Bol<Mus> musebol = new Bol<Mus>();
	Bol<Rotte> rottebol = new Bol<Rotte>();

	//  2 Lage en katt.
	Katt katt = new Katt("Lucifer");

	//  3 La katten gå på jakt. Den skal ikke finne noen gnagere
	katt.jakt(musebol,rottebol);

	//  4 Opprett en rotte.
	Rotte rotte = new Rotte("Professor Padraic Ratigan");

	//  5 Sett rotten i rottebolet
	rottebol.settInn(rotte);

	//  6 La katten gå på jakt på nytt. Rotten skal bli skadet.
	katt.jakt(musebol,rottebol);

	//  7 Lag en mus.
	Mus mus1 = new Mus("Basil of Baker Street");

	//  8 Sett musen i musebolet.
	musebol.settInn(mus1);

	//  9 Lag enda en mus.
	Mus mus2 = new Mus("Roquefort");

	// 10 Prøv å sette musen i samme bol. Det skal ikke gaa.
	musebol.settInn(mus2);

	// 11 La katten gå på jakt igjen. Musen skal doe.
	katt.jakt(musebol,rottebol);

    }
}
