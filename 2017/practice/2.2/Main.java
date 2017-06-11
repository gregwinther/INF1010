class Main {
    public static void main(String[] args) {
        X x1 = (X) new Y(); // Legal: Y cast to X
        X y1 = new Y(); // Legal: Y to X (subclass)
        // Y y2 = new X(); // Not legal: X cannot be converted to Y
        Y y3 = new Z(); // Legal
        Z z1 = new Z(); // Legal!
        //Z z2 = (Z) new X(); // Not legal: X cannot be cast to Z 
    }
}