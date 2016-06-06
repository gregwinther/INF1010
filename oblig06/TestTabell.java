// Enhetstesting av klassen Tabell

import java.util.Iterator;

class TestTabell {

	public static void main(String[] args) {
		System.out.print("\n  - Enhetstesting av klassen Tabell -\n\n");

		// En tabell konstrueres med lengde 100. Sjekker om tabell har riktig lengde.
		Tabell<Pasient> pasientoversikt = new Tabell<Pasient>(100);
		System.out.printf("%-50s","Tabell konstrueres og blir gitt lengde: ");
		System.out.printf("%5s\n",pasientoversikt.hentLengde()==100);

		// Det settes en pasient på plass 10. Skal returnere true.
		Pasient p1 = new Pasient("Rune", 12345, "Blindernveien 13", 0371);
		System.out.printf("%-50s","Setter inn pasient på tillatt plass: ");
		System.out.printf("%5s\n",pasientoversikt.settInn(p1,10));

		// Setter inn pasient på plass 100. Skal returnere false.
		Pasient p2 = new Pasient("Einar", 25647, "Blindernveien 12", 0371);
		System.out.printf("%-50s","Setter inn pasient på plass som ikke finnes: ");
		System.out.printf("%5s\n",!pasientoversikt.settInn(p2,100));

		// Putter inn pasient paa opptatt plass.
		System.out.printf("%-50s","Setter inn pasient på opptatt plass: ");
		System.out.printf("%5s\n",!pasientoversikt.settInn(p2,10));

		// Iterasjon
		Iterator iterator = pasientoversikt.hentIterator();
		int i = 1;
		while (iterator.hasNext()) {
			iterator.next();
			i++;
			if (i == 100) { // Ved siste element i listen
				System.out.printf("%-50s","Iterasjon: ");
				System.out.printf("%5s",i==100);
			}
		}

		System.out.print("\n\n");
	}
}