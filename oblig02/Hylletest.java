// Dette er en klasse med forskjellige tester

class Hylletest {

	// Lager noen boeker
	private Bok bok1 = new Bok("Deathly Hallows", "JK Rowling");
	private Bok bok2 = new Bok("Chamber of Secrets", "JK Rowling");
	private Bok bok3 = new Bok("Philosopher's Stone", "JK Rowling");
	private Bok bok4 = new Bok("Prisoner of Azkaban", "JK Rowling");
	private Bok bok5 = new Bok("Dune", "Frank Herbert");

	// Test av hylle-klasse
	public void klassetest(Hylle<Bok> bokhylle) {
		
		System.out.println("\nTEST AV KLASSE\n");

		// Finner Stoerrelsen til klassen
		System.out.print("I bokhyllen er det plass til ");
		System.out.print(bokhylle.hentStor());
		System.out.println(" boeker");
	
		// Setter inn bok paa bestemt plass
		bokhylle.sett(bok1, 69);

		// Setter inn enda en bok på samme plass
		bokhylle.sett(bok2, 69);

		// Setter denne boken et annet sted
		bokhylle.sett(bok2, 27);

		// Sjekker om ledig foer og etter boken er tatt ut av hyllen
		bokhylle.ledig(69);
		Bok iHaanden = bokhylle.hent(69);
		bokhylle.ledig(69);

		// Hvilken bok er dette?
		System.out.print(iHaanden.hentTittel()+" av ");
		System.out.println(iHaanden.hentForfatter());
		
		// Putter bok i haanden paa samme plass som en annen bok
		bokhylle.sett(iHaanden, 27);

		// Det gikk ikke saa bra. Setter den et annet sted..
		bokhylle.sett(iHaanden, 300);

		// Jeg bommet paa hyllen! Her boer det gaa
		bokhylle.sett(iHaanden, 54);

		System.out.print("\n");
	}

	// Test av grensesnitt for generisk hylle
	public void grensetest(GenHylle<Bok> grensebokhylle) {

		System.out.println("\nTEST AV GRENESNITT\n");

		// Finner stoerrelsen til klassen
		System.out.print("I bokhyllen (grensensnittet) er det plass til ");
		System.out.println(grensebokhylle.hentStor());

		// Setter inn boeker i hyllen
		grensebokhylle.sett(bok3, 0);
		grensebokhylle.sett(bok4, 1);
		grensebokhylle.sett(bok5, 100); // Dette skal ikke gaa

		// Tar ut en bok og sjekker om plassen er ledig
		Bok iHaanden = grensebokhylle.hent(0);
		grensebokhylle.ledig(0);

		// Hvilken bok tok jeg ut?
		System.out.print(iHaanden.hentTittel() + " av ");
		System.out.println(iHaanden.hentForfatter());
		
		// Noen boeker aa sette paa plass
		grensebokhylle.sett(iHaanden, 3);
		grensebokhylle.sett(bok5, 0);

		System.out.print("\n");

	}	
}	
