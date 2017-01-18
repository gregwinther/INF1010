/**
* Generisk klasse SortertEnkelListe
* som implementerer AbstrakSortertEnkelListe 
* som en enveisliste.
*
* @author Sebastian G. Winther-Larsen
*
*/

import java.util.NoSuchElementException;
import java.util.Iterator;

class SortertEnkelListe<E extends Comparable<E> & Lik>
	implements AbstraktSortertEnkelListe<E> {

	private Node hode;
	private Node hale;
	private int antall;

	public SortertEnkelListe() {
		hode = null;
		antall = 0;
	}

	public boolean tom() {
		return this.antall == 0;
	}

	public int hentAntall() {
		return antall;
	}

	public void settInn(E data) {
		if (this.hode == null) {
			this.hode = new Node(data, null);
			hale = hode;
		} else {
			if (data.compareTo(hode.hentData()) < 0) {
				Node nyNode = new Node(data, hode);
				hode = nyNode;
			} else if (data.compareTo(hale.hentData()) > 0) {
				Node temp = new Node(data, null);
				hale.settNeste(temp);
				hale = hale.hentNeste();
			}
		}
	}
	
	public E hent(String nokkel) {
		Node denne = hode;
		E temp = null;

		while (denne != null) {
			if (denne.hentData().samme(nokkel)) {
				temp = denne.hentData();
			}
			denne = denne.hentNeste();
		}
		return temp;
	}

	public Iterator<E> iterator() {
		return new sortertIterator();
	}

	private class sortertIterator implements Iterator<E>  {

	 	Node temp = hode;

		public boolean hasNext() {
			return (temp != null);
		}

		public E next() {
			E e = temp.data;
			temp = temp.neste;
			return e;
		}
	}
	private class Node {

		private Node neste;
		private E data;

		public Node(E data, Node neste) {
			this.data = data;
			this.neste = neste;
		}

		public E hentData() {
			return data;
		}

		public void settData(E data) {
			this.data = data;
		}

		public Node hentNeste() {
			return neste;
		}
	
		public void settNeste(Node node) {
			neste = node;
		}
	}


}
