public class DobbeltLenketTest {
	public static void main(String[] args) {
		DobbeltLenket<String> enListe = new DobbeltLenket<String>();
		String string1 = "Dette";
		String string2 = "er";
		String string3 = "noe..";
		enListe.settInn(string1);
		enListe.settInn(string2);
		enListe.settInn(string3);
		for (String s: enListe) {
			System.out.println(s);
		}
	}
}	
