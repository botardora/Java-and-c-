public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        //interfacebol nem lehet peldanyositani, kell egy osztaly ami megvalositja az interfacet, es tartalmazza annak a metodusait,
        // kell egy override hozza az osztalyban, megirjuk a konstruktort, gettert, settert
        // ha floatot akarok irni, irom a szam.0f, az f-el a vegen float lesz, f nelkul double
        //mindig elobb az interfacet kell letrehozni
        //vehiclelistbe a konstruktorban a current az 0
        //nem igy: vehicles[current++]=vehicle, hanem vehicles[current]=vehicle es current++
        //kivetelkezeles: arrayindexoutofexception-al
        //inkabb konstruktorba irjuk azt, hogy index=0, mint akkor amikor inicializaljuk
        //ha visszafele megyunk az index a current minus 1-rol indulunk
        //public Vehicleiterator getforvarditerator(){
        // return new vehicleforwarditerator}
        //
    }
}