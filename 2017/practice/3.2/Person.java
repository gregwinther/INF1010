class Person implements Comparable<Person> {
    
    private int alder;
    private String navn;

    Person() {}

    Person(String navn, int alder) {
        this.navn = navn;
        this.alder = alder;
    }

    public int hentAlder() {
        return alder;
    }

    public String hentNavn() {
        return navn;
    }

    public int compareTo(Person person) {
        return this.hentAlder() - person.hentAlder(); 
    }

    
}