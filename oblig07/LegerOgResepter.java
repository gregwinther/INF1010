/**
* Endelig program til prosjektet "Leger og Resepter"
*
* Ordrestyrt program for leger og resepter. Programmet skal kunne:
* 1) Lese all data fra fil.
* 2) Skrive ut alle data til fil.
* 3) Skrive ut alle personer, leger (sortert paa navn), legemidler
* og resepter.
* 4) Opprette og legge inn en ny lege
* 5) Opprette og legge inn en ny person (pasient??)
* 6) Opprette og legge inn en ny resept.
* 7) Hente legemiddelet på en resept.
* 8) Haandtere ordre for aa skrive ut statistikk.
*
* @author Sebastian G. Winther-Larsen
*
*/

import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

class LegerOgResepter {

	// MAIN
	public static void main(String[] args){
		
		Journalsystem journal = new Journalsystem();

	}
}

// Indre klasse om definerer hele journalsystemet med leger, resepter etc
class Journalsystem {

	// Fil inn.
	String filInn = "dataset.txt";

	// Menyvelger
	Scanner input = new Scanner(System.in);

	// Pasientbeholder
	Tabell<Pasient> pasienter = new Tabell<Pasient>(100);

	// Legemiddelbeholder
	Tabell<Legemiddel> legemidler = new Tabell<Legemiddel>(100);

	// Legebeholder
	SortertEnkelListe<Lege> leger = new SortertEnkelListe<Lege>();

	// Reseptbeholder
	EnkelReseptListe resepter = new EnkelReseptListe();

	// Konstruktoer og initialisering
	Journalsystem() {

		// Filinnlesning
		this.lesFil();

		// Meny
		System.out.println();
		System.out.println("---- Velkommen til Journassystemet ----");
		System.out.println();
		System.out.println(" 1: Skriv ut alle pasienter.");
		System.out.println(" 2: Skriv ut alle leger.");
		System.out.println(" 3: Skriv ut alle legemidler.");
		System.out.println(" 4: Skriv ut alle resepter.");
		System.out.println(" 5: Opprett nytt legemiddel.");
		System.out.println(" 6: Opprett ny lege.");
		System.out.println(" 7: Opprett ny resept.");
		System.out.println(" 8: Finn legemiddel paa resept.");
		System.out.println();
		System.out.println(" 9: Lagre fil.");
		System.out.println(" 0: Avslutt program.");
		System.out.println();
		System.out.println(" ® Greg Winther \n");
		
		int valg = -1;

		while (valg != 0) {
			switch (Integer.parseInt(tekstInn())) {
				case 0: System.out.println("\n Paa gjensyn! \n");
						System.exit(0); break;
				case 1: this.skrivPasienter(); break;
				case 2: this.skrivLeger(); break;
				case 3: this.skrivLegemidler(); break;
				case 4: this.skrivResepter(); break;
				case 5: this.opprettLegemiddel(); break;
				case 6: this.opprettLege(); break;
				case 7: this.opprettResept(); break;
				case 8: this.finnLegemiddelPaaResept(); break;
				case 9: this.lagreTilFil(); break;
			}
		}
	}
		
	// Valg 1: Skriv ut alle pasienter
	private void skrivPasienter() {
			System.out.println("\nPasienter:\n");
			for (Pasient pasient : this.pasienter) {
				if (pasient != null) {
					System.out.println(pasient.hentNavn());
				}
			}
			System.out.println();		
	}

	// Valg 2: Skriv ut alle leger (i alfabetisk rekkefoelge)
	private void skrivLeger() {
			System.out.println("\nLeger:\n");
			for (Lege lege : this.leger) {
				System.out.println(lege.hentNavn());
			}
			System.out.println();
	}

	// Valg 3: Skriv ut alle legemidler
	private void skrivLegemidler() {
			System.out.println("\nLegemidler:\n");
			for (Legemiddel legemiddel : this.legemidler) {
				if (legemiddel != null) {
					System.out.println(legemiddel.hentNavn());
				}
			}
			System.out.println();
	}

	// Valg 4: Skriv ut alle resepter
	private void skrivResepter() {
			System.out.println("\nResepter:\n");
			for (Resept resept : resepter) {
				System.out.println(resept);
			}
			System.out.println();
	}

	// Valg 5: Opprett nytt legemiddel
	private void opprettLegemiddel() {
			System.out.println("\nNytt legemiddel:\n");
			// Instruksjoner
			System.out.println("Vennligst oppgi navn, form, type, pris, ");
			System.out.println("mengde, virkestoff og eventuell styrke");
			System.out.println("for legemiddelet separert ved komma.");
			System.out.println();
			System.out.println("For eksempel:");
			System.out.println("Predizol, mikstur, b, 450, 50, 75, 8\n");

			// Input
			String line = this.tekstInn();

			// Det foelgende er nesten likt som for tekstlesemetoden.
			String[] legemiddeldata = line.split(", ");
			String navn = legemiddeldata[0];
			String form = legemiddeldata[1];
			String type = legemiddeldata[2];
			int pris = Integer.parseInt(legemiddeldata[3]);
			int mengde = Integer.parseInt(legemiddeldata[4]);
			double virkestoff = Double.parseDouble(legemiddeldata[5]);
			int styrke = 0;
			if (type.equals("a") || type.equals("b")) {
				styrke = Integer.parseInt(legemiddeldata[6]);
			}	

			// Lager legemiddelobjekt
			Legemiddel legemiddel = null;			
			if (form.equals("mikstur") && type.equals("a")) {
				legemiddel = 
				new MiksturA(navn, virkestoff, styrke, mengde);
			}
			if (form.equals("mikstur") && type.equals("b")) {
				legemiddel = 
				new MiksturB(navn, virkestoff, styrke, mengde);
			}
			if (form.equals("mikstur") && type.equals("c")) {
				legemiddel = 
				new MiksturC(navn, virkestoff, mengde);
			}
			if (form.equals("pille") && type.equals("a")) {
				legemiddel = 
				new PilleA(navn, virkestoff, styrke, mengde);
			}
			if (form.equals("pille") && type.equals("b")) {
				legemiddel = 
				new PilleB(navn, virkestoff, styrke, mengde);
			}
			if (form.equals("pille") && type.equals("c")) {
				legemiddel = 
				new PilleC(navn, virkestoff, mengde);
			}

			// Finner antall legemidler i tabellen saa langt
			int antall = 0;
			for (Legemiddel elem : legemidler) {
				if (elem != null) {
					antall++;
				}
			}

			// Setter inn
			legemidler.settInn(legemiddel, antall);
	}

	// Valg 6: Opprett ny lege
	private void opprettLege() {
			// Instrukser
			System.out.println("\nNy lege:\n");
			System.out.println("Vennligst oppgi navn og avtalenummer til legen");
			System.out.println("separert med komma. (0 hvis ingen avtale)");
			System.out.println("\nFor eksempel:\nDr. Watson, 12345\n");

			// Input
			String line = tekstInn();

			String[] legedata = line.split(", ");
			String navn = legedata[0];
			int avtalenr = Integer.parseInt(legedata[1]);

			// Legeobjekt
			Lege nyLege = null;
			if (avtalenr != 0) {
				nyLege = new Fastlege(navn, avtalenr);
			} else {
				nyLege = new Lege(navn);
			}

			// Putter lege i beholder
			this.leger.settInn(nyLege);
	}

	// Valg 7: Opprett ny resept
	private void opprettResept() {
			// Instrukser
			System.out.println("\nNy resept:\n");
			System.out.println("Vennligst oppgi farge, pasientnummer, legenavn");
			System.out.println("legemiddelnummer og reit");
			System.out.println("separert ved komma.");
			System.out.println("\nFor eksempel:");
			System.out.println("blå, 2, Dr. Oz, 0, 3\n");

			// Input
			String line = tekstInn();
			String[] reseptdata = line.split(", ");
			boolean hvit = reseptdata[0].equals("hvit");
			int pasnr = Integer.parseInt(reseptdata[1]);
			String legenavn = reseptdata[2];
			int legemiddelnr = Integer.parseInt(reseptdata[3]);
			int reit = Integer.parseInt(reseptdata[4]);

			// Finner pasientnavn
			Pasient pasient = pasienter.hent(pasnr);
			String pasientnavn = pasient.hentNavn();

			// Finner legemiddel
			Legemiddel legemiddel = legemidler.hent(legemiddelnr);

			// Lager resept
			Resept resept = null;
			if (hvit) {
				resept = new HvitResept(legemiddel, legenavn,
					pasientnavn, reit);
			} else {
				resept = new BlaaResept(legemiddel, legenavn,
					pasientnavn, reit);
			}

			// Putter resept i beholder
			this.resepter.settInn(resept);
	}

	// Valg 8: Finn legemiddel paa resept
	private void finnLegemiddelPaaResept() {
			// Instruksjoner 
			System.out.println("\nFinn legemiddel paa resept\n");
			System.out.println("Vennlgist oppgi reseptnummer.");

			int reseptnummer = Integer.parseInt(tekstInn());

			Resept prescr = this.resepter.finn(reseptnummer);

			Legemiddel medisin = prescr.hentLegemiddel();

			System.out.println(medisin.hentNavn());
	}

	// Valg 9: Lagre til fil
	// IKKE GJORT!
	private void lagreTilFil() {
		System.out.println("Ikke implementert.\n");
	}


	// Metode for aa lese fra fil.
	private void lesFil() {
		try {

			BufferedReader data = new BufferedReader(new FileReader(filInn));

			String line;

			/* 
			For aa bestemme hvor i filen filleseren er,
			telles det hvor mange "#" som er lest (kategori). 
			1: pasienter, 2: legemidler, 3: leger, 4: resepter
			heltallet kategorie brukes til dette formaalet
			*/

			int kategori = 0;

			while ((line = data.readLine()) != null) {
				
				if (line.length() != 0) {
					
					if (line.contains("#")) { // Kategoriskifte!
						
						kategori++;

					} else {

						// Kategori 1: Pasienter
						if (kategori == 1) {
							
							// Henter paisentdata
							String[] pasientdata = line.split(", ");
							int nummer = Integer.parseInt(pasientdata[0]);
							String navn = pasientdata[1];
							Double fnr = Double.parseDouble(pasientdata[2]);
							String adresse = pasientdata[3];
							int postnr = Integer.parseInt(pasientdata[4]);

							// Lager pasient
							Pasient pasient = 
							new Pasient(navn, fnr, adresse, postnr);

							// Putter pasient i beholder
							this.pasienter.settInn(pasient, nummer);
						}

						// Kategori 2: Legemidler
						else if (kategori == 2) {
							
							// Henter legemiddeldata
							String[] legemiddeldata = line.split(", ");
							int nummer = Integer.parseInt(legemiddeldata[0]);
							String navn = legemiddeldata[1];
							String form = legemiddeldata[2];
							String type = legemiddeldata[3];
							int pris = Integer.parseInt(legemiddeldata[4]);
							int mengde = Integer.parseInt(legemiddeldata[5]);
							double virkestoff = Double.parseDouble(legemiddeldata[6]);
							int styrke = 0;
							if (type.equals("a") || type.equals("b")) {
								styrke = Integer.parseInt(legemiddeldata[7]);
							}

							// Lager legemiddelobjekter
							Legemiddel legemiddel = null;

							if (form.equals("mikstur") && type.equals("a")) {
								legemiddel = 
								new MiksturA(navn, virkestoff, styrke, mengde);
							}
							if (form.equals("mikstur") && type.equals("b")) {
								legemiddel = 
								new MiksturB(navn, virkestoff, styrke, mengde);
							}
							if (form.equals("mikstur") && type.equals("c")) {
								legemiddel = 
								new MiksturC(navn, virkestoff, mengde);
							}
							if (form.equals("pille") && type.equals("a")) {
								legemiddel = 
								new PilleA(navn, virkestoff, styrke, mengde);
							}
							if (form.equals("pille") && type.equals("b")) {
								legemiddel = 
								new PilleB(navn, virkestoff, styrke, mengde);
							}
							if (form.equals("pille") && type.equals("c")) {
								legemiddel = 
								new PilleC(navn, virkestoff, mengde);
							}

							// Putter legemiddel i beholder
							this.legemidler.settInn(legemiddel, nummer);
						} 

						// Kategori 3: Leger
						else if (kategori == 3) {

							// Henter legedata
							String[] legedata = line.split(", ");
							String navn = legedata[0];
							int avtalenr = Integer.parseInt(legedata[1]);

							// Legeobjekt
							Lege lege = null;
							if (avtalenr != 0) {
								lege = new Fastlege(navn, avtalenr);
							} else {
								lege = new Lege(navn);
							}

							// Putter lege i beholder
							this.leger.settInn(lege);
						}

						// Kategori 4: Resepter
						else if (kategori == 4) {

							// Henter reseptdata
							String[] reseptdata = line.split(", ");
							int nummer = Integer.parseInt(reseptdata[0]);
							boolean hvit = reseptdata[1].equals("hvit");
							int pasnr = Integer.parseInt(reseptdata[2]);
							String legenavn = reseptdata[3];
							int legemiddelnr = Integer.parseInt(reseptdata[4]);
							int reit = Integer.parseInt(reseptdata[5]);

							// Finner pasientnavn
							Pasient pasient = pasienter.hent(pasnr);
							String pasientnavn = pasient.hentNavn();

							// Finner legemiddel
							Legemiddel legemiddel = legemidler.hent(legemiddelnr);

							// Lager resept
							Resept resept = null;
							if (hvit) {
								resept = new HvitResept(legemiddel, legenavn,
									pasientnavn, reit);
							} else {
								resept = new BlaaResept(legemiddel, legenavn,
									pasientnavn, reit);
							}

							// Putter resept i beholder
							this.resepter.settInn(resept);

						}
					}
				}
			}

			// Lukk fil
			data.close();
 
		} catch(IOException e) {
			System.out.println("Kunne ikke lese fil.");
		}
	}

	// Hjelpemetode for aa skrive inn tekst
	private String tekstInn() {
		String tekst = input.nextLine();
		return tekst;
	}
}