import core.*;
import collection.*;
public class TestMyHashMap {
    public static void main(String[] args){
        MyHashMap hm = new MyHashMap(10);
        hm.put(1001, new Car("Audi", 1));
        hm.put(1001, new Car("BMW", 2));
        hm.put(101, new Car("Nissan",3));
        hm.put(10001, new Car("Mazda",4));
        hm.put(2001, new Car("VW",5));
        hm.put(3001, new Car("Ford",6));
        hm.put(4003, new Car("Opel",7));
        System.out.println(hm.get(1001));
        System.out.println(hm.get(2001));
        System.out.println(hm.get(3001));
        System.out.println(hm.get(4003));
        System.out.println(hm.get(5001));
        System.out.println(hm.get(5002));
        System.out.println(hm.get(5003));
        System.out.println(hm.containsKey(1001));
        System.out.println(hm.containsKey(5001));
        System.out.println(hm.containsKey(5002));
    }
}
//Egy hash map segítségével autókat szeretnénk eltárolni az alvázszámukkal együtt. Ezáltal hatékonyan tudunk rákeresni egy autóra az alvázszáma alapján.
//
//A Car osztályban eltároljuk az autó típusát (type) és korát (age), írunk egy paraméteres konstruktort, amely inicializálja ezeket a tagokat, valamint felülírjuk
// a toString metódust, amely az autó adatainak szöveges reprezentációját adja vissza.
//
//Az Entry osztályban eltárolunk egy autót, a neki megfelelő négyjegyű, egyedi alvázszámot, illetve egy referenciát egy másik Entry típusú objektumra (ezáltal láncolt
// listát építhetünk). Az osztály rendelkezik paraméteres konstruktorral, illetve az adattagok értékét visszatérítő (getter) metódusokkal.
//
//A MyHashMap osztályban implementáljuk a hash mapet, amely egy Entry típusú tömb segítségével lesz megadva. Ezáltal minden tömbelem egy-egy láncolt listát határoz meg.
// A tömb hosszát (size) a konstruktor paramétereként adjuk meg és a tömb számára size méretű memóriaterületet foglalunk a konstruktorban. A tömb hossza a program futtatása
// során változatlan marad. A hash függvény (hashFunction) visszatéríti a paraméterként kapott alvázszámnak a tömb hosszával vett osztási maradékát. Minden autó abba a
// láncolt listába kerül, amelynek az indexe az alvázszám hash értéke (vagyis az alvázszámnak a tömb hosszával vett osztási maradéka).
//
//Beszúráskor (put) ellenőrizzük az alvázszámot: ha a szám nem négyjegyű, vagy már létezik ilyen kulcs, akkor hibaüzenetet írunk ki a konzolra. Ellenkező esetben
// beszúrjuk annak a listának az elejére, amelynek indexe az alvázszám hash értéke.
//
//Lekérdezéskor (get) egy ciklusban bejárjuk azt a listát, amelynek indexe az alvázszám hash értéke. Ha megtaláljuk a keresett alvázszámú autót, akkor visszatérítjük azt,
// ellenkező esetben null-t térítünk vissza. Fontos: Integer, vagy más referenciatípusok egyenlőségének ellenőrzésére az equals metódust használjuk.
//
//A containsKey metódus visszaadja, hogy létezik-e adott alvázszámú autó a hash map-ben. Implementáláskor használjuk fel a korábban megírt get függvényt.