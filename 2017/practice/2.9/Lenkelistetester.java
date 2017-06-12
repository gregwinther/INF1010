import java.util.Iterator;

class Lenkelistetester {

    public static void main(String[] args) {

        // Lager ny lenkeliste
        LenkeListe<Kjoeretoy> bilregister = new LenkeListe();

        // Putter inn en varebil
        Varebil varebil1 = new Varebil("AB1234", "Volvo", "Jens", 800);
        bilregister.settInnVedStart(varebil1);
        
        Varebil varebil2 = new Varebil("AB1235", "Volvo", "Jens", 799);
        bilregister.settInnVedSlutt(varebil2);

        Personbil bil1 = new Personbil("CD4567", "Volkswagen", "Ola", 15);
        bilregister.settInnVedSlutt(bil1);

        for (Kjoeretoy k : bilregister) {
            System.out.println("Avgift: " + k.hentAvgift() +  " kr");
        }
    }
}