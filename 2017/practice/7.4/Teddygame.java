// This algorithm is not working correctly!
public class Teddygame {

    public static void main(String[] args) {
        System.out.print(teddy(Integer.parseInt(args[0])));
    }

    public static boolean teddy(int n) {
        if (n == 42) {
            return true;
        } else if (n % 2 == 0) {
             n = n/2;
             System.out.println(n);
             teddy(n);
        } else if (n % 3 == 0 || n % 4 == 0) {
            int n1 = n % 10;
            int n2 = (n%100)/10;
            n = n - n1*n2;
            System.out.println(n);
            teddy(n);
        } else if (n % 5 == 0) {
            n = n - 42;
            System.out.println(n);
            teddy(n);
        }
        return false;
    }
}