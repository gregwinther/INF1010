public class Main {

    public static void main(String[] args) {

        // Lager nytt objekt av Bygning
        Bygning bygning = new Bygning(200);

        // Lager nytt objekt av Skyskraper
        Skyskraper skyskraper = new Skyskraper(6500, 12);

        int antallEtasjer = skyskraper.hentAntallEtasjer();

        System.out.println("Skyskraperen har " + antallEtasjer
                            + " etasjer.");
    }
}