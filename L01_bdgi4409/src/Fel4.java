public class Fel4 {
    public static void main(String[] args) {
        //4.

        int n = 10; //alapertelmezett sorok szama
        if(args.length > 0) { //megnezzuk, ha a parancssorban lett e megadva helyes bemenet
            try {
                n = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.out.println("ervenytelen bemenet");
            }
        }
            int[][] tomb = new int[n][]; //tombokbol allo tomb
            int index = 1; //eppen beirando szam
            for (int i = 0; i < n; i++) { //sorok szamozasa
                tomb[i] = new int[i + 1]; //uj sor
                for (int j = 0; j <= i; j++) { //oszlopok szamozasa
                    tomb[i][j] = index;
                    index++;
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(tomb[i][j] + " "); //kiiratjuk space-ekkel elvalasztva a szamokat
                }
                System.out.println();
            }
        }
    }

