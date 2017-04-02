abstract class Person {

    protected String navn;
    protected int alder;

    Person(String navn, int alder) {
        this.navn = navn;
        this.alder = alder;
    }

    String hentNavn() {
        return navn;
    }

    int hentAlder() {
        return alder;
    }

}