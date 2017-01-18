class test {

	public static void main(String[] args) {
		
		int a = 3;
		int b = 2;
		System.out.println(a/b);

		double A = (double) a;
		System.out.println(A/b);

		int c = 2;
		System.out.println(c);
		c--;
		System.out.println(c);

		Pasient pasient1 = new Pasient("Lars", 123, "Vei", 1234);
		Pasient pasient2 = new Pasient("Jon", 456, "Gate", 5678);
		System.out.println(pasient1.hentID());
		System.out.println(pasient2.hentID());
	}
}
