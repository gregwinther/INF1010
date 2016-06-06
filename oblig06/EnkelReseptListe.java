/**
* Klasse EnkelReseptListe
* Enveisliste med peker til forste og siste element i listen.
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

class EnkelReseptListe {

	protected Node forste;
	protected Node siste;
	protected int antallResepter;

	public EnkelReseptListe() {
		forste = null;
		siste = null;
		antallResepter = 0;
	}

	public Resept finn(int reseptnr) {
		Node temp = forste;

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
			Node temp  = forste;

			public boolean hasNext() {
				return (temp.data != null);
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