public class Professor extends Ansatt {
    
    String fagomraade;

    Professor(String navn, int alder, double timeloenn, String fagomraade) {
        super(navn, alder, timeloenn);
        this.fagomraade = fagomraade;
    }
}