import java.util.Arrays;

class oblig10 {

	public static void main(String[] args){

		Sudoku sudoku = new Sudoku();

		sudoku.lesFil(args[0]);

		System.out.println("\nBrett som skal loses: \n");

		Brett brett = sudoku.hentBrett();
		brett.opprettDatastruktur();
		brett.skrivBrett();

		Rute rute = brett.hentRuter()[0][0];
		rute.fyllUtDenneRuteOgResten();
		
		SudokuBeholder losninger = sudoku.hentBeholder();
		int antallLosninger = losninger.hentAntall();

		System.out.println("\nLosningen(e) er: \n");
		
		for (int i = 0; i < antallLosninger; i++) {
			Losning losning = losninger.taUt(i);
			losning.skrivUt();
		}
	}
}