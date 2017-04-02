public class Ansatt extends Person {

    protected double timeloenn;

    Ansatt(String navn, int alder, double timeloenn) {
        super(navn, alder);
        this.timeloenn = timeloenn;
    }
} 