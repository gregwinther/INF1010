/**
* Klasse EnkelReseptListe
* Enveisliste med peker til hode og siste element i listen.
*
* Denne klassen skal ta vare på resepter, en resept må kunne vaere med
* i flere objekter av denne klassen.
* Skal ellers kunne 1) set, 2) get (med unntak om resepten ikke finnes)
* 3) Iterator
*
* @author Sebastian G. Winther-Larsen
*
*/

import java.util.Iterator;

class EnkelReseptListe implements Iterable<Resept>{

	protected Node hode;
	protected int antallResepter;

	public EnkelReseptListe() {
		hode = null;
		antallResepter = 0;
	}

	public void settInn(Resept r) {
		if (hode == null) {
			hode = new Node(null, r);
			antallResepter++;	
		} else {
			Node temp = new Node(hode, r);
			hode = temp;
			antallResepter++;
		}
	}

	public Resept finn(int reseptnr) {
		Node temp = hode;

		while (temp != null) {
			if (temp.data.hentNr() == reseptnr) {
				return temp.data;
			}
			temp = temp.neste;
		}
		throw new IllegalStateException("Reseptnummer ikke registrert.");
	}

	public Iterator<Resept> iterator() {
		return new Iterator<Resept>() {
			Node temp  = hode;

			public boolean hasNext() {
				return (temp.neste != null);
			}

			public Resept next() {
				Resept resept = temp.data;
				temp = temp.neste;
				return resept;
			}
		};
	}

	class Node {
		Node neste;
		Resept data;

		Node(Node neste, Resept data) {
			this.neste = neste;
			this.data = data;
		}
	}
}