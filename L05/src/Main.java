import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //elso dolog szvingben hogy keszitunk egy framet: JFrame
        JFrame frame = new JFrame();
        frame.setSize(1000,1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false); //ne legyen ujrameretezheto
        frame.setTitle("ALMAFA keret");
        //egy framere direktbe ne rakjunk fel semmit, azt panelre kell

        //JPanel panel = new JPanel();
        MyPanel panel = new MyPanel();
//        JLabel label = new JLabel();
//        label.setText("Hello");
        //label.setBounds(100,100,100,50);
//        frame.add(label);


//        JTextField field = new JTextField();
//        field.setPreferredSize(new Dimension(100,30));//letrehoz egy kicsi ablakot, ahol tudsz beirni szoveget
        //field.setBounds(200,100,100,50);

        JButton button = new JButton();
        button.setText("Gomb");
        JButton button2 = new JButton();
        button.setText("Gomb2");
        //button.setBounds(100,200,200,50);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random r = new Random();
                //label.setText("GOMB lenyomva!!!!!!!!!!"); //megvaltozik a szoveg, ha megnyomod a gombot
                //label.setText(field.getText());
                frame.setSize(r.nextInt(750) + 250,r.nextInt(750)+250); //atmeretezi a keretet, veletelen szamok
                //panel.setBackground(new Color(100,200,20)); //hatterszint valtoztat
                panel.setBackground(new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255)));//random szin minden gomblenyomasra
                panel.setCircleX(r.nextInt(200));
                panel.setCircleY(r.nextInt(200));
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random r = new Random();
                //label.setText("GOMB lenyomva!!!!!!!!!!"); //megvaltozik a szoveg, ha megnyomod a gombot
                //label.setText(field.getText());
                frame.setSize(r.nextInt(750) + 250,r.nextInt(750)+250); //atmeretezi a keretet, veletelen szamok
                //panel.setBackground(new Color(100,200,20)); //hatterszint valtoztat
                panel.setBackground(new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255)));//random szin minden gomblenyomasra
                panel.setCircleX(r.nextInt(200));
                panel.setCircleY(r.nextInt(200));
            }
        });

        //panel.add(label);
        panel.add(button);
        panel.add(button2);
        //panel.add(field);
        frame.add(panel);
        // BorderLayout.CENTER vagy barmi mas, ahova akrjuk allitani a gombot, szoveget, stb, de csak ha a framebe babralunk
        //de azt nem a legjobb dolog piszkalni, szoval ezt nem csinaljuk, a panellel sokkal tobb lehetosegunk is van

        frame.setVisible(true); //lathatova tesszuk, ez az utolso parancs a kodban
    }
}