/**
* Grensesnittet AbstraktTabell
* Generisk grensesnitt uten restriksjoner for hva tabellen skal inneholde.
*
* AbstraktTabell besktriver en beholder og skal kunne:
* 1) Sette inn et objekt paa en oppgitt plass. Skal returnere true/false
* avhengig av om operasjonen gikk bra eller ikke.
* 2) Finne objekt basert på en indeks
* 3) Itereres over
*
* @author Sebastian G. Winther-Larsen
*
*/

import java.util.Iterator;

interface AbstraktTabell<E> extends Iterable<E> {

	public boolean settInn(E e, int plass);

	public E hent(int plass);

	public Iterator<E> iterator();

}
