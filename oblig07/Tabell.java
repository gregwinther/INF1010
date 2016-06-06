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

	public Iterator<E> iterator() {
		return new TabellIterator();
	}
	
	private class TabellIterator implements Iterator<E> {
		
		private E[] innhold_ = (E[]) new Object[lengde];
		private int i; // Indeks brukt i konstruktoer
		private int j; // Indeks brukt i metode next

		public TabellIterator() {
			for (E e : innhold) {
				if (e != null) {
					innhold_[i++] = e;
				}
			}
		}

		public boolean hasNext() {
			return (j < innhold_.length);	
		}
	
		public E next() {
			return innhold_[j++];
		}
	}	
}
	
