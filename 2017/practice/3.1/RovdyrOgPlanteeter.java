class RovdyrOgPlanteeter {
    public static void main(String[] args) {
        
        // Lager en array med rovdyr
        Rovdyr[] alleRovdyr = new Rovdyr[4];
        for (int i = 0; i < 4; i+=2) {
            Ulv enUlv = new Ulv();
            Bjorn enBjorn = new Bjorn();
            alleRovdyr[i] = enUlv;
            alleRovdyr[i + 1] = enBjorn;
        }


        for (Rovdyr beist : alleRovdyr) {
            beist.jakt();
            //System.out.println(beist);
        }

        // Lager en array med planteetere
        Planteeter[] alleVeggiser = new Planteeter[4];
        for (int i = 0; i < 4; i+=2) {
            Sau enSau = new Sau();
            Elg enElg = new Elg();
            alleVeggiser[i] = enSau;
            alleVeggiser[i + 1] = enElg;
        }


        for (Planteeter veggis : alleVeggiser) {
            veggis.beskytt();
        }
    }
}