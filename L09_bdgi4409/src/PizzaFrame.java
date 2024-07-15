import javax.swing.*;
import java.io.IOException;

public class PizzaFrame extends JFrame {
    private PizzaPanel panel;
    public PizzaFrame() {

        setBounds(200,200,500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Pizza pizza = new Corn(new Olive(new Mushroom(new Salami(new Tomato(new PizzaBase())))));
        panel = new PizzaPanel(pizza);
        add(panel);
        setVisible(true);
        System.out.println("AR: " + panel.getPizza().getPrice()+" lej");
        System.out.println("Osszetevok: " + panel.getPizza().getIngredients());
    }
    public static void main(String[] args){
        PizzaFrame p1 = new PizzaFrame();
    }
}
