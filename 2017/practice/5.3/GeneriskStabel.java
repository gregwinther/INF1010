public class GeneriskStabel<E> {

	private Node<E> toppen;

	GeneriskStabel() {	
		this.toppen = null;	
	}

	public void leggPaa(E e) {
		if (toppen == null) {
			Node<E> nyNode = new Node<E>(e, null);
			toppen = nyNode;
		} else {
			Node<E> nyNode = new Node<E>(e, toppen);
			toppen = nyNode;
		}
	}

	public E taAv() {
		if (toppen == null) {
			return null;
		} else {
			Node<E> temp = toppen;
			toppen = toppen.lenke;
			return temp.e;
		}
	}

	public boolean erTom() {
		return (toppen == null);
	}

	class Node<E> {
		E e;
		Node<E> lenke;

		Node(E e, Node n) {
			this.e = e;
			this.lenke = n;
		}
	}
}
