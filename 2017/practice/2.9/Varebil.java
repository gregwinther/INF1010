public class Varebil extends Kjoeretoy {

    private double maxLastevekt;

    Varebil(String regnr, String fabrikkvaremerke, String eier, int antallPlasser) {
        super(regnr, fabrikkvaremerke, eier);
        this.maxLastevekt = maxLastevekt;
    }

    public double hentAvgift() {
        return 4*maxLastevekt;
    }
    
}