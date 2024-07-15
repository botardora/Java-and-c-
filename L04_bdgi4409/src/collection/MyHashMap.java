package collection;
import core.Car;
public class MyHashMap {
    private Entry[] entries;
    public MyHashMap(int size){
        entries = new Entry [size];
    }
    private int hashFunction(int key){
        return key % entries.length;
    }
    public void put(int key, Car value){
        if (key <= 1000 || key > 10000){
            System.out.println("ez nem egy alvazszam, nem 4 jegyu: " + key);
            return;
        }

        int listaindex = hashFunction(key);
        Entry uj = entries[listaindex];
//        if (uj == null) {
//            entries[listaindex] = new Entry(key, value, null);
//            return;
//        }
        while (uj != null) {
            if (uj.getKey() == key) {
                System.out.println("Mar letezik ilyen kulcs!: " + key);
                uj = new Entry(key, value, entries[listaindex]); // Felülírjuk az értéket, ha már létezik a kulcs
                entries[listaindex] = uj;
                return;
            }
            uj = uj.getNext();
        }
        Entry uj1 = new Entry(key, value, entries[listaindex]);
        entries[listaindex] = uj1;
    }
    public Car get(int key){
        int listaindex = hashFunction(key);
        Entry uj = entries[listaindex];
        while (uj != null) {
            if (uj.getKey() == key) {
                return uj.getValue();
            }
            uj = uj.getNext();
        }
        return null;
    }
    public boolean containsKey(int key){
        return get(key) != null;
    }
}
