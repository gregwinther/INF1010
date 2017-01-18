/**
* Klasse EldstehodeReseptListe
*
* En liste over resepter som skal starte med eldste resept når det
* itereres over. Man starter med andre ord med den som ble satt inn foerst.
* FIFO.
*
* Denne klassen er en subklasse av EnkelReseptListe. 
*
* @author Sebastian G. Winther-Larsen
*
*/

class EldsteForstReseptListe extends EnkelReseptListe {

	protected Node hale;

	public void settInn(Resept r) {
		if (hode == null) {
			Node nyNode = new Node(null, r);
			hode = nyNode;
			hale = nyNode;  
			antallResepter++;
		} else {
			Node nyNode = new Node(null, r);
			hale.neste = nyNode;
			hale = nyNode;
			antallResepter++;
		}
	}
}
