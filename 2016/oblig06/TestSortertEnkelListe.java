// Enhetstesting av SortertEnkelListe

import java.util.Iterator;

class TestSortertEnkelListe {

	public static void main(String[] args) {

		System.out.println("\n  - Enhetstesting av SortertEnkelListe - \n");

		// Sette inn nytt element, sortert - minste foerst.
		SortertEnkelListe<Lege> leger = new SortertEnkelListe<Lege>(10);
		Lege l1 = new Lege("Frans");
		leger.settInn(l1);
		System.out.printf("%-40s","Setter inn lege og søker på nøkkel: ");
		Lege hentetlege = leger.hent("Frans");
		System.out.printf("%5s\n",hentetlege.samme("Frans"));
		
		// Setter inn en lege til og itererer
		// Det sjekkes om legene Frans og Harald kommer naar de skal.
		Lege l2 = new Lege("Harald");
		leger.settInn(l2);
		leger.settInn(hentetlege); // Putter hentet lege tilbake.
		Iterator itr = leger.hentIterator();
		int i = 1;
		while(itr.hasNext()) {
			Lege temp = (Lege)itr.next();
			System.out.printf("Legen heter %-6s :",temp.hentNavn());
			if (i == 1) {
				System.out.printf("%7s\n",temp.hentNavn().equals("Frans"));
			} else if (i ==2) {	
				System.out.printf("%7s\n",temp.hentNavn().equals("Harald"));
			}
			i++;
		}

		System.out.println("");	
	}
}