public class Fel2 {
    public static void main(String[] args) {
        //2.

        int parosossz = 0;
        int paratlanossz = 0;
        for (String arg : args) { //vegigvesszuk a parancssori argumentumokat
            try {
                int szam = Integer.parseInt(arg); //atalakitja egesz szamma
                if (szam % 2 == 0) {
                    parosossz += szam;
                } else {
                    paratlanossz += szam;
                }
            } catch (NumberFormatException e) {
                System.err.println("Hiba: " + arg + " nem egy egesz szam.");
            }
        }
        System.out.println("paros szamok osszege: " + parosossz);
        System.out.println("paratlan szamok osszege: " + paratlanossz);
    }
}
