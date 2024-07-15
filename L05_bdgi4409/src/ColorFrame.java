import java.awt.*;
import java.awt.event.*;
import java.util.Random;
public class ColorFrame extends Frame{
    private Choice colorChoice;
    private Random random;
    public ColorFrame() {
        setBounds(200,200,400,400); //keret beallitasa
        setTitle("Color Changer");

        random = new Random(); //inicializalas

        colorChoice = new Choice(); //legordulo lista elemei
        colorChoice.add("Red");
        colorChoice.add("Green");
        colorChoice.add("Blue");
        colorChoice.add("Black");
        colorChoice.add("Random");
        add(colorChoice, BorderLayout.NORTH);

        addWindowListener(new WindowAdapter() { //hogy be tudjuk zarni az ablakot
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        colorChoice.addItemListener(new ItemListener() { //esemenyfigyelo a szinvaltashoz
            @Override
            public void itemStateChanged(ItemEvent e) {
                String selectedColor = colorChoice.getSelectedItem();
                switch (selectedColor) {
                    case "Red":
                        setBackground(Color.RED);
                        break;
                    case "Green":
                        setBackground(Color.GREEN);
                        break;
                    case "Blue":
                        setBackground(Color.BLUE);
                        break;
                    case "Black":
                        setBackground(Color.BLACK);
                        break;
                    case "Random":
                        int r = random.nextInt(255);
                        int g = random.nextInt(255);
                        int b = random.nextInt(255);
                        setBackground(new Color(r, g, b));
                        break;
                    default:
                        setBackground(Color.WHITE);
                        break;
                }
            }
        });
        setVisible(true);
    }
}

//Hozzunk létre egy ColorFrame nevű keretet, majd adjunk hozzá egy legördülő listát (Choice) ami tartalmazza legalább három színnek a
// nevét (pl. "red", "green", "blue") és egy "random" opciót. Amikor a felhasználó kiválasztja a lista valamelyik elemét, a keret
// háttérszínét változtassuk a megfelelő színre: setBackground(...).
//Segítség: A Choice komponenshez adjuk hozzá egy megfelelően megírt ItemListener-t. Alapszínek elérhetőek a Color osztály statikus
// adattagjaiként (pl Color.RED), tetszőleges RBG szín létrehozható a new Color(r,g,b) konstruktorhívás segítségével, ahol az r,g,b
// paraméterek 0 és 255 közötti számok. A véletlenszerű szín létrehozásához vegyünk fel egy Random típusú adattagot a ColorFrame osztályban,
// a konstruktorban példányosítsuk azt, ahol szükséges a példány nextInt(bound) függvényével véletlen számot generálhatunk 0 és bound-1 között.
