/**
* Klasse YngsteForsteReseptListe
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

	public void settInn(Resept r) {
		if (forste == null) {
			Node nyNode = new Node(null, r);
			forste = nyNode; 
			siste = nyNode; 
			antallResepter++;
		} else {
			Node nyNode = new Node(forste, r); // Nye noden peker på den forrige.
			forste = nyNode; // Den forste som skal ut er den nye som legges inn.
			antallResepter++;
		}
	}
}