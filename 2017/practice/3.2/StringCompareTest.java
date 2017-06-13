public class StringCompareTest {
    public static void main(String[] args) {
 
        String[] stringArray = new String[3];
        stringArray[0] = "Hi";
        stringArray[1] = "Hello";
        stringArray[2] = "Goodbye!";

        System.out.println("String array size is: " + stringArray.length);

        String storsteStreng = new String();
        for (int i = 0; i < stringArray.length; i++) {
            for (int j = 1; j < stringArray.length; j++) {
                if (stringArray[i].compareTo(stringArray[j]) >= 0) {
                    storsteStreng = stringArray[i];
                } 
            }
        } 
        System.out.println("Storste streng er: " + storsteStreng);   
    }    
}