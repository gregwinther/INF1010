public class Main {

    public static void main(String[] args) {
        Professor langtangen = new Professor("Hans Petter Langtangen",
                                54, 680, "BioComputing");
        System.out.println("The professor's name is " + langtangen.hentNavn());
    
    }
}