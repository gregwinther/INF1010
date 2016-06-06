/**
* Main-klasse for behandling av bildata.
*
* @author Sebastian G. Winther-Larsen
*
*/

import java.util.*;
import java.io.*;

class Oblig03 {

	public static void main(String[] args) {

		// Filen som skal leses inn
		 String fileName =  args[0];

		// Plass til å lagre hver linje midlertidig.
		 String line = null;

		// Bilpark
		ArrayList<Bil> bilpark = new ArrayList<Bil>();

		// Forsoeker aa aapne filen
		try {
			
			FileReader fileReader = 
			new FileReader(fileName);

			BufferedReader bufferedReader = 
			new BufferedReader(fileReader);
			
			while ((line = bufferedReader.readLine()) != null) {
				
				String[] parts = line.split(" ");
				
				if (parts[0].equals("BIL")) {
					bilpark.add(new Bil(parts[1]));
				} else if (parts[0].equals("EL")) {
					int batteri = Integer.parseInt(parts[2]);
					bilpark.add(new Elbil(parts[1], batteri));
				} else if (parts[0].equals("FOSSIL")) {
					double utslipp = Double.parseDouble(parts[2]);
					bilpark.add(new Fossilbil(parts[1], utslipp));
				} else if (parts[0].equals("LASTEBIL")) {
					double utslipp = Double.parseDouble(parts[2]);
					double last = Double.parseDouble(parts[3]);
					bilpark.add(
					new Lastebil(parts[1], utslipp, last));
				} else if (parts[0].equals("PERSONFOSSILBIL")) {
					double utslipp = Double.parseDouble(parts[2]);
					int seteplass = Integer.parseInt(parts[3]);
					bilpark.add( 
					new Personbil(parts[1], utslipp, seteplass));
				}
				
			}
			
			// Lukker fil
			bufferedReader.close();
		} 

		catch(FileNotFoundException ex) {	
			System.out.println("Kan ikke aapne '" 
					+ fileName +  "'.");		
		}
		catch(IOException ex) {	
			System.out.println("Feil ved lesing av '"
					+ fileName + "'.");
		}				

		System.out.println("Oversikt over biler på fossilt brennstoff.");	
		System.out.println("----------");
		for (Bil item: bilpark) {
			
			if (item instanceof Fossilbil) {	
				
				Fossilbil tempFossilbil = (Fossilbil)item;	
				System.out.println(tempFossilbil.hentRegNr());
				System.out.print("Utslipp: ");
				System.out.println(tempFossilbil.hentUtslipp());

				 if (item instanceof Personbil) {

					Personbil tempPersonbil = (Personbil)item;
					System.out.println("Personbil.");	
					System.out.print("Antall passasjerer: ");
					System.out.println(tempPersonbil.hentPassasjerer());

				} else if (item instanceof Lastebil) {

					Lastebil tempLastebil = (Lastebil)item;
					System.out.println("Lastebil.");
					System.out.print("Nyttevekt: ");
					System.out.println(tempLastebil.hentNyttevekt());

				}
				System.out.println("----------");	
			} 
		} 		
	}
}		
