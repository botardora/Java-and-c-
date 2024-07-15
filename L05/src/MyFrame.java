import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MyFrame extends JFrame implements ActionListener {
    private JLabel label;
    private JFrame frame;
    private JTextField field;
    private JPanel panel;
    private JButton[] buttons;
    private Random r = new Random();
    public void createTextField(){

    }
    public void crateButtons(int nr){
        buttons = new JButton[nr];
        for(int i=0;i<buttons.length;i++){
            buttons[i]=new JButton();
            buttons[i].setText("Button"+i);
        }
    }
    public void buildPanel(){
        panel.add(label);
        panel.add(field);
        for(int i=0;i<buttons.length;i++){
            panel.add(buttons[i]);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(buttons[0])){
            panel.setCircleX(r.nextInt(500));
        }
    }
}
