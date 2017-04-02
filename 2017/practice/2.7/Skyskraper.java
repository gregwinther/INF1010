// Denne klassen arver fra Bygning.java

public class Skyskraper extends Bygning {

    int antallEtasjer;

    Skyskraper(double bruttoAreal, int antallEtasjer) {
        
        // Sender argumenter fra konstruktoer til superklassen
        // Superklassens konstruktoer kan kun kalles med super()
        super(bruttoAreal);
        
        System.out.println("Konstruerte instans av Skyskraper.");

        this.antallEtasjer = antallEtasjer;
    }

    int hentAntallEtasjer() {
        return antallEtasjer;
    }
}