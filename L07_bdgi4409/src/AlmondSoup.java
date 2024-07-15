public class AlmondSoup implements Soup{
    @Override
    public String toString() {
        return "AlmondSoup";
    }

    @Override
    public void associateMainDish(MainDish mainDish) {
        System.out.println("A " + toString() + " leveshez a " + mainDish.toString() + " foetelt tarsitottam.");
    }
}