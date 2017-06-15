public class Fakultet {
    static int fakultet(int n) {
        if (n <= 0) { return 1; } 
        else {
            return n * fakultet(n - 1);
        }     
    }

    static int fakultetIterativ(int n) {
        int product = 1;
        for (int i = 1; i < n + 1; i++) {
            product = product*i;
        }
        return product;
    }
}