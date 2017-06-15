public class FakultetTest {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        System.out.println("Rekursiv metode: ");
        System.out.println(n + "! = " + Fakultet.fakultet(n));

        System.out.println("Iterativ metode: ");
        System.out.println(n + "! = " + Fakultet.fakultetIterativ(n));
        
    }
}