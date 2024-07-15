import java.awt.*;
import java.awt.event.*;
public class GroceryListFrame extends Frame {
    private List list1;
    private List list2;
    private Button button1;
    private Button button2;

    public GroceryListFrame(){
        setBounds(200,200,400,400);
        addWindowListener(new WindowAdapter() { //hogy be tudjuk zarni az ablakot
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
        setTitle("Bevasarlo lista");
        setLayout(new FlowLayout());

        //gyumolcslista letrehozasa
        list1 = new List(10,true);
        list1.add("Alma");
        list1.add("Korte");
        list1.add("Szilva");
        list1.add("Szolo");
        list1.add("Narancs");
        list1.add("Citrom");
        list1.add("Fuge");
        list1.add("Banan");
        add(list1);

        button1 = new Button("->");
        add(button1);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                moveItems(list1, list2);
            }
        });

        button2 = new Button("<-");
        add(button2);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                moveItems(list2, list1);
            }
        });

        //zoldseglista
        list2 = new List(10, true);
        list2.add("Uborka");
        list2.add("Paprika");
        list2.add("Sargarepa");
        list2.add("Krumpli");
        list2.add("Retek");
        list2.add("Petrezselyem");
        list2.add("Paradicsom");
        list2.add("Paszuly");
        add(list2);

        setVisible(true);
    }

    //a lista elemeinek kicserelese
    private void moveItems(List sourceList, List destinationList) {
        String[] selectedItems = sourceList.getSelectedItems();
        for (String item : selectedItems) {
            destinationList.add(item);
            sourceList.remove(item);
        }
    }

}
//Hozzunk létre egy GroceryListFrame nevű keretet, és helyezzünk el egymás mellé rendre egy listaablakot (List) egy “->” feliratú gombot,
// egy “<-”  feliratú gombot, majd egy másik listaablakot.  Az első listát töltsük fel gyümölcsnevekkel, a másodikat zöldségnevekkel.
// Ha a felhasználó a “->” gombra kattint, akkor az első listaablakban kijelölt szavak átkerülnek a második listaablakba, és fordítva.
// Egy listaablakon belül egyszerre több elem is legyen kijelölhető: setMultipleMode(true).