package collection;
import core.Car;

public class CarList {
    private int current = 0;
    private Car [] cars;
    public CarIterator getIterator() {
        return new CarIterator();
        //ennek a segitsegevel peldanyosithatunk
    }
    public CarList(int size) {
        cars = new Car[size];
    }

    //kivetelkezeles, amennyiben tobb auto lenne, mint ami a listaban szerepelhet
    public void addCar(Car car) {
        try{
            if (current < cars.length) {
                cars[current] = car;
                current++;
            } else {
                throw new IllegalStateException("A lista maximális kapacitása elérve.");
            }
        }
        catch (IllegalStateException e){
            System.out.println(e.getMessage());
        }
    }
    public class CarIterator{
        private int index;
        public boolean hasMoreElements() {
            return index < current;
            //lista meg tartalmaz elemeket vagy sem
        }

        public Car nextElement() {
            Car car = cars[index];
            index++;
            return car;
            //kovetkezo elem lekerdezese
        }
    }
}

