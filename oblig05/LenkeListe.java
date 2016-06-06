/**
* Klasse LenkeListe
*
* Klasse med generisk parameter som beskriver en boeholder som tar vare
* paa vilkaarlig mange objekter av samme type
*
* @author Sebastian G. Winther-Larsen
*
*/

class LenkeListe<E extends Comparable<E>> {

	private Node foran;
	private int antall;

	public boolean tom() {
		return (this.antall == 0);
	}

	public void leggTil(E e) {
		Node temp = new Node(e);
		Node denne = foran;
	
		// Legg til paa slutten i lenken	
		while (denne.hentNeste() != null) {
			denne = denne.hentNeste();
		}

		denne.settNeste(temp);
		antall++;
	}

	public E fjernMinste() {
		Node denne = foran;
		Node minste = foran;
		Node forrige = foran;
		Node a;
	

		// Soeker alle for aa finne plassering
		while (denne.hentNeste() !=null) {
			a = denne.hentNeste(); 	
			if (minste.hentData().compareTo(a.hentData())>0) {
				minste = a;	
				forrige = denne;
			}
			denne = denne.hentNeste();			
		}	
		// Hopper over minste slik at denne ekskluderes fra lenken
		forrige.settNeste(minste.hentNeste());
		return minste.hentData();
	}	

	public boolean inneholder(E e) {
		Node denne = foran;
		Node temp;
		
		while (denne.hentNeste() != null) {
			temp = denne.hentNeste();
			if (denne.hentData().compareTo(temp.hentData()) == 0) {
				return true;
			}
			denne = denne.hentNeste();
		}
		return false;
	}
	
	private class Node {
		
		// Neste node i rekken.
		Node neste;

		// Denne noden innhold/peker
		E data;
	
		public Node(E e) {
			neste = null;
			data = e;
		}

		public E hentData() {
			return data;
		}

		public void settData(E e) {
			data = e;
		}

		public Node hentNeste() {
			return neste;
		}
	
		public void settNeste(Node node) {
			neste = node;
		}
	}	
} 
