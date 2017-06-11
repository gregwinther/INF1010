abstract class Kjoeretoy {

    protected String regnr;
    protected String fabrikkmerke;
    protected String eier;

    Kjoeretoy(String regnr, String fabrikkmerke, String eier) {
        this.regnr = regnr;
        this.fabrikkmerke = fabrikkmerke;
        this.eier = eier;
    }

    public double hentAvgift() {
        return 3000;
    }

    public String hentRegnr() {
        return regnr;
    }

    public void settRegnr(String nyttRegnr) {
        this.regnr = nyttRegnr;
    }

    public String hentFabrikkmerke() {
        return fabrikkmerke;
    }

    public void settFabrikkmerke(String nyttFabrikkM) {
        this.fabrikkmerke = nyttFabrikkM;    
    }

    public String hentEier() {
        return eier;
    }

    public void settEier(String nyEier) {
        this.eier = nyEier;
    }
}