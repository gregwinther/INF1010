class oblig2 {
	
	public static void main(String[] args) {
	
		// Lager testobjekt	
		Hylletest test = new Hylletest();

		// Lager bokhyller
		Hylle<Bok> bokhylle = new Hylle<Bok>(100);
		GenHylle<Bok> grensebokhylle = new Hylle<Bok>(100);
		
		// Tester klassen for hylle
		test.klassetest(bokhylle);
		// Tester grensesnittet for hylle
		test.grensetest(grensebokhylle);
	}
} 
