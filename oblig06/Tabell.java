/**
* Generisk klasse Tabell
* Implementerer AbstraktTabell
*
* Lager alle elementer i en array, lengden oppgis i contructor.
* 
* @author Sebastian G. Winther-Larsen
*
*/

import java.util.Iterator;

class Tabell<E> implements AbstraktTabell<E> {

	private E[] innhold;
	private int lengde;

	public Tabell(int lengde) {
		innhold = (E[]) new Object[lengde];
		this.lengde = lengde;
	}

	public boolean settInn(E e, int plass) {
		if (plass < 0 || plass > (lengde - 1)) {
			return false;
		} else if (innhold[plass] != null) {
			return false;
		} else {
			innhold[plass] = e;
			return true;
		}
	}

	public E hent(int plass) {
		return innhold[plass];
	}

	public int hentLengde() {
		return lengde;
	}

	public Iterator<E> hentIterator() {
		return new TabellIterator(innhold);
	}
	
	private class TabellIterator implements Iterator<E> {
		
		private E[] innhold;
		private int dennePlassen;
		private int nestePlass;	

		public TabellIterator(E[] e) {
			innhold = e;
			dennePlassen = 0;
			nestePlass = 1;
		}

		public boolean hasNext() {
			if (nestePlass < innhold.length) {
				return true;
			} else {
				return false;
			}
		}	
	
		public E next() {
			E neste = null;
			if (hasNext()) {
				neste = innhold[nestePlass];
				dennePlassen = nestePlass;
				nestePlass++;
			}
			return neste;
		}
	}	
}
	
