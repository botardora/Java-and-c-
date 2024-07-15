public class Fel3 {
    public static void main(String[] args) {
        //3.

            for(int i = 0; i < args.length; i++) {
                String szo = args[i];
                for(int j = 0; j < szo.length(); j++) {//vegigvesszuk a paranccsori argumentumokat
                    char betu = szo.charAt(j);
                    //char atalakitott;
                    if (Character.isUpperCase(betu)) {
                        System.out.println(Character.toLowerCase(betu));
                    } else if (Character.isLowerCase(betu)) {
                        System.out.println(Character.toUpperCase(betu));
                    } else {
                        System.out.println(betu); //haa valami nem betu az ugyanolyan marad
                    }
                    //System.out.println(" ");
                }
                System.out.println();
                }
        }
    }
