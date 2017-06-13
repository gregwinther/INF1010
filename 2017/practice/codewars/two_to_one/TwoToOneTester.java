public class TwoToOneTester {

	public static void main(String[] args) {
			TwoToOne testObject = new TwoToOne();
			String someString = "qwerty";
			System.out.println(someString);
			someString = testObject.stringSorter(someString);
			System.out.println(someString);

			String anotherString = "qweerty";
			System.out.println("\n" + anotherString);
			anotherString = testObject.stringSorter(anotherString);
			System.out.println(anotherString);
			anotherString = testObject.removeRedundancies(anotherString);
			System.out.println(anotherString);

			String string1 = "qwertyui";
			String string2 = "qwerteeeeqqw";
			String longest = testObject.longest(string1, string2);
			System.out.println("\nLongest string is: " + longest);
	}
}
