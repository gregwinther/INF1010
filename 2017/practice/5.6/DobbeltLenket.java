import java.util.*;

public class DobbeltLenket<T> implements Iterable<T> {

	class Node<T> {
		T data;
		Node<T> neste;
		Node<T> forrige;

		Node(T data, Node<T> neste, Node<T> forrige) {
			this.data = data;
			this.neste = neste;
			this.forrige = forrige;
		}			
	}

	private Node<T> forste;
		
	
	public void settInn(T element) {
		if (forste == null) {
			Node<T> nyNode = new Node<T>(element, null, null);
			forste = nyNode;
		} else {
			Node<T> denne;
			denne = forste;
			while(denne.neste != null) {
				denne = denne.neste;	
			}
			Node<T> nyNode = new Node<T>(element, null, denne);
			denne.neste = nyNode;
		}	
	}

	@Override 
	public Iterator<T> iterator() {
		return new LenkelisteIterator();	
	}
	
	private class LenkelisteIterator implements Iterator<T> {
		
		private Node<T> denne;

		LenkelisteIterator() {
			denne = forste;
		}

		@Override
		public boolean hasNext() {
			return denne != null;
		}

		@Override
		public T next() {
			if (!hasNext()) {
				throw new NoSuchElementException();
			} 
			
			Node<T> temp = denne;
			denne = denne.neste;
			return temp.data;			
		}

	}	

}
