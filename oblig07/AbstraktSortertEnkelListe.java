/**
* Grensesnitt AbstraktSortertEnkelListe
*
* En liste som bare skal kunne inneholde elementer som implementerer
* grensesnittet Comaparable og Lik.
*
* En slik liste skal kunne:
* 1) Sette inn et nytt element, sortert, minste foerst.
* 2) Finne et element basert på noekkel av typen String.
* 3) Itereres over, sortert, minste foerst.
*
* @author Sebastian G. Winther-Larsen
*
*/

import java.util.Iterator;

interface AbstraktSortertEnkelListe<E extends Comparable<E> & Lik> 
	extends Iterable<E>{

	public void settInn(E e);

	public E hent(String nokkel);

	public Iterator<E> iterator();

} 
