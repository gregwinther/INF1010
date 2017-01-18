/**
* Klasse YngstehodeReseptListe
*
* En liste over resepter som skal starte med yngste resept når det
* itereres over. Man starter med andre ord med den som ble satt inn sist
* FILO.
*
* Denne klassen er en subklasse av EnkelReseptListe. Det eneste den trenger
* for aa oppfylle spesifikasjonen er en god metode for aa sett inn resepter.
*
* @author Sebastian G. Winther-Larsen
*
*/

class YngsteForstReseptListe extends EnkelReseptListe {

	protected Node hale;

	public void settInn(Resept r) {
		if (hode == null) {
			Node nyNode = new Node(null, r);
			hode = nyNode; 
			hale = nyNode; 
			antallResepter++;
		} else {
			Node nyNode = new Node(hode, r); // Nye noden peker på den forrige.
			hode = nyNode; // Den som skal ut foerst er den nye som legges inn.
			antallResepter++;
		}
	}
}
