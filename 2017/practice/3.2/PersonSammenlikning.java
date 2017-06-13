class PersonSammenlikning {
    public static void main(String[] args) {
        Person person1 = new Person("Jens", 22);
        Person person2 = new Person("Ola", 24);
        Person person3 = new Person("Siri", 21);

        Person[] personListe = new Person[3];
        personListe[0] = person1;
        personListe[1] = person2;
        personListe[2] = person3;

        Person eldste = new Person();
        Person yngste = new Person();
        for (Person person : personListe) {
           for (Person annenPerson : personListe) {
               if (person.compareTo(annenPerson) > 0) {
                   eldste = person;
               }
               if (person.compareTo(annenPerson) < 0) {
                   yngste = person;
               }
           }
        }

        System.out.print("Den eldste personen er ");
        System.out.println(eldste.hentNavn() + ".");
        System.out.print(eldste.hentNavn() + " er ");
        System.out.println(eldste.hentAlder() + " aar gammel.");

        System.out.print("Den yngste personen er ");
        System.out.println(yngste.hentNavn() + ".");
        System.out.print(yngste.hentNavn() + " er ");
        System.out.println(yngste.hentAlder() + " aar gammel.");
}
}