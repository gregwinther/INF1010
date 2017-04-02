public class Bachelorstudent extends Student {

    Bachelorstudent(String navn, int alder) {
        super(navn, alder);
        super.tilgangUtenforAapningstid = false;
    }
}