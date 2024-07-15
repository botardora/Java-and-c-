import java.awt.*;
import java.awt.event.*;

public class TextFilterFrame extends Frame{
    private TextField field;
    private Button button;
    private TextArea area;
    public TextFilterFrame(){
        setBounds(200,200,400,400); //keret beallitasa
        setLayout(new BorderLayout());
        setTitle("Szovegtorles");

        //inicializalasok, letrehozasok
        field = new TextField(15);
        add(field, BorderLayout.NORTH);

        button = new Button("Filter");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                filterText();
            }
        });
        add(button, BorderLayout.CENTER);

        area = new TextArea(20,15);
        add(area, BorderLayout.SOUTH);

        addWindowListener(new WindowAdapter() { //hogy be tudjuk zarni az ablakot
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
        }
    private void filterText() {
        String filterWord = field.getText();
        String text = area.getText();
        //Szures
        String filteredText = text.replace(filterWord, "*");
        //az uj szoveget jelenitjuk meg
        area.setText(filteredText);
    }
    }
//Hozzunk létre egy TextFilterFrame nevű keretet, adjunk hozzá egymás alá egy szövegmezőt (TextField), egy gombot a „Filter”
// felirattal, valamint egy TextArea komponenst. Gombnyomásra végezzünk szűrést: a TextArea komponensből kérjük le a kijelölt
// szövegrészt, és ebből a szövegrészből töröljük a szövegmezőbe írt szó összes előfordulását. A gomb lenyomása után a TextArea-ban
// maradjon csak a kijelölt szövegrész szűrt változata.
//Segítség: Törlésre használhatjuk a String osztály replace(...) metódusát.
