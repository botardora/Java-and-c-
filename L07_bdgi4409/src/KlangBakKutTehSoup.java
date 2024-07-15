public class KlangBakKutTehSoup implements Soup{
    @Override
    public String toString() {
        return "KlangBakKutTehSoup";
    }

    @Override
    public void associateMainDish(MainDish mainDish) {
        System.out.println("A " + toString() + " leveshez a " + mainDish.toString() + " foetelt tarsitottam.");
    }
}

