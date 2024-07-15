
import core.Car;
import collection.CarList;
public class TestCarList {
    public static void main(String[] args) {
        CarList carList = new CarList(4); //megadjuk hany auto szerepelhet a listaban
        Car car1 = new Car("Sedan", 5, 200);
        Car car2 = new Car("SUV", 3, 250);
        Car car3 = new Car("Convertible", 2, 300);
        Car car4 = new Car("Sports", 7,500);
        car4.setAge(5); //ezzel most felulirom az elobb megadottakat
        car4.setType("Beetle");
        car4.setPerformance(150);
        //car4.getAge();
        //car4.getType();
        //car4.getPerformance();
        Car car5 = new Car("Cabrio", 4, 300); //plusz egy, hogy latsszon a kivetelkezeles
        //System.out.println(car1);
        //System.out.println(car2);
        //System.out.println(car3);
        carList.addCar(car1);
        carList.addCar(car2);
        carList.addCar(car3);
        carList.addCar(car4);
        carList.addCar(car5);

        CarList.CarIterator iterator = carList.getIterator();

        while (iterator.hasMoreElements()) {
            Car car = iterator.nextElement();
            System.out.println(car);
        }
    }
}
//    Létrehozzuk a core és collection csomagokat. A core csomagon belül létrehozunk egy jármű (Vehicle) osztályt (POJO) a típus (type) és kor (age) adattagokkal,
//    az adattagok értékeit beállító paraméteres konstruktorral, valamint az adattagoknak megfelelő getter és setter metódusokkal.
//    A Vehicle osztályból származtatjuk a autó (Car) osztályt, kiegészítve a teljesítmény (performance) adattaggal, a megfelelő konstruktorral
//    és getter/setter metódusokkal. A Car osztályon belül újradefiniáljuk az Object ősosztály toString metódusát, visszatérítve az autókkal kapcsolatos
//    információk szöveges reprezentációját (például a típus, kor és teljesítmény tulajdonságoknak megfelelő stringek összefűzéséből előállított stringet).
//
//        A collection csomagon belül létrehozzuk a CarList osztályt, amelyből autó objektumokat tartalmazó gyűjtemények példányosíthatóak.
//        Az osztályon belül egy Car típusú elemeket tartalmazó tömbben rögzítjük a autókkal kapcsolatos információkat. A current adattag mindig
//        a tömb aktuális elemére fog mutatni, így az új autó beillesztését végző addCar metódus felhasználhatja ezt az értéket az új elem pozíciójának
//        meghatározásához, és a beillesztés után elvégezheti az érték frissítését. A tömb méretét (a lista maximális kapacitását) a konstruktor paramétere
//        határozza meg, az elemeknek a konstruktoron belül foglalunk helyet. Az addCar metódusban alkalmazzunk kivételkezelést: ha több autót szeretnénk
//        hozzáadni a listához, mint amennyi annak a maximális kapacitása, akkor írjunk ki egy üzenetet a konzolra és ne végezzük el a beszúrást.
//
//        A lista bejárása egy iterátor segítségével történik, a CarIterator osztály által. Az osztály két metódust tartalmaz: a hasMoreElements metódus
//        segítségével lekérdezhető, hogy van-e még elem a listában (vagy annak végéhez értünk), a nextElement metódus segítségével lekérdezhető a lista
//        következő eleme. Ugyanakkor az osztályban egy egész típusú attribútum segítségével történik az aktuális  pozíció rögzítése. Az osztályt a CarList
//        osztály belső osztályaként hozzuk létre, és a CarList osztály getIterator() metódusa segítségével példányosíthatjuk.
//
//        A létrehozott osztályok kipróbálásához írjunk egy rövid programot. ATestCarList osztály main metódusán belül hozzunk létre néhány Car objektumot.
//        Hozzunk létre egy listát (CarList példány), és adjuk hozzá ehhez a létrehozott autó objektumokat. Az iterátor segítségével egy cikluson belül járjuk
//        be a listát, és írjuk ki a konzolra az autókkal kapcsolatos információkat.