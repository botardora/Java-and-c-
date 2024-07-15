public class Menu {
    private MainDish mainDish;
    private Soup soup;
    public void createMenu(Chef chef){
        soup = chef.prepareSoup();
        mainDish = chef.prepareMainDish();
        soup.associateMainDish(mainDish);
    }
    public static void main(String[] args) {
        IndianChef indianChef = new IndianChef();
        ChineseChef chineseChef = new ChineseChef();
        Menu menu = new Menu();
        menu.createMenu(indianChef);
        menu.createMenu(chineseChef);
    }
}