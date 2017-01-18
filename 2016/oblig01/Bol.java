/* Dette er en generisk klasse for en Bol som kan huse et vilkaarlig dyr.
   Klasseinstanser av mus og rotter liker seg for eksempel i et bol.
   Et bol skal: 1) ha plass til ett dyr; 2) ha en metode for å sjekke om
   bolet er tomt; 3) ha en metode for å sette inn et nytt objekt; 4) 
   ha en metode for å hente ut et objekt som er der.

   Sebastian G. Winther-Larsen
   sebastwi@student.matnat.uio.no
   @greg_winther
*/

class Bol<T> {

    private Boolean occupied = false;
    private T denne;

    public void settInn(T den) {
	if (!occupied) {
	    occupied = true;
	    denne = den;
	} else {
	    System.out.println("Dette bolet er bebodd.");
	}
    }

    public T taUt() {
	if (occupied) {
	    occupied = false;
	    return denne;
	} else {
	    return null;
	}
    }
}
