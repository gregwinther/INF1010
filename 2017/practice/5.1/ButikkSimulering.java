public class ButikkSimulering {
	public static void main(String[] args) {
		Person person1 = new Person("Niels Henrik Abel", "kladdebok med ruter", null);
		Person person2 = new Person("Vilhelm Bjerknes", "termometer", null);
		person1.settNestePerson(person2);

		Butikk enButikk = new Butikk();
		enButikk.entreButikk(person1);
		enButikk.entreButikk(person2);

		enButikk.kasse();
	}
}
