class TriangleTester {
		
	public static boolean isTriangle(int a, int b, int c) {
		if (a > 0 && b > 0 && c > 0) {
			if ((a+b) <= c || (a+c) <= b || (c+b) <= a) {
				return false;	
			} else if ((a+b) >= c || (a+c) >= b || (c+b) >= a)	{
					return true;
			}
		} else {
				return false; 
			}
				return false;
		}	
}
