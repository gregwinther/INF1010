public class Masterstudent extends Student {

    Masterstudent(String navn, int alder) {
        super(navn, alder);
        super.tilgangUtenforAapningstid = true;
    }
}