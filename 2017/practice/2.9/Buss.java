public class Buss extends Kjoeretoy {

    private int antallPlasser;

    Buss(String regnr, String fabrikkvaremerke, String eier, int antallPlasser) {
        super(regnr, fabrikkvaremerke, eier);
        this.antallPlasser = antallPlasser;

    }

    public double hentAvgift() {
        return 0;
    }


}