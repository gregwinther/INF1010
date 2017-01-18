/**
* Klasse EldsteForsteReseptListe
*
* En liste over resepter som skal starte med eldste resept når det
* itereres over. Man starter med andre ord med den som ble satt inn først
* FIFO.
*
* Denne klassen er en subklasse av EnkelReseptListe. Det eneste den trenger
* for aa oppfylle spesifikasjonen er en god metode for aa sett inn resepter.
*
* @author Sebastian G. Winther-Larsen
*
*/

class EldsteForstReseptListe extends EnkelReseptListe {

	public void settInn(Resept r) {
		if (forste == null) {
			Node nyNode = new Node(null, r);
			forste = nyNode;
			siste = nyNode;  
			antallResepter++;
		} else {
			Node nyNode = new Node(null, r);
			siste.neste = nyNode;
			siste = nyNode;
			antallResepter++;
		}
	}
}