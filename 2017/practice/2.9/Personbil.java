public class Personbil extends Kjoeretoy {

   private int antallPlasser; 
    Personbil(String regnr, String fabrikkvaremerke, String eier, int antallPlasser) {
        super(regnr, fabrikkvaremerke, eier);
        this.antallPlasser = antallPlasser;
        
    }
}