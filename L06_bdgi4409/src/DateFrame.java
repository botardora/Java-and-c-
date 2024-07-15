import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class DateFrame extends JFrame {
    private JLabel label;
    private JButton button;


    public DateFrame(){
        setTitle("Mai datum");
        setBounds(100,100,300,400);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE); //ablakbezaras
        //setLayout(new BorderLayout()); //layout manager hasznalata
        setLayout(new FlowLayout(FlowLayout.CENTER));
        label = new JLabel();
        label.setHorizontalAlignment(SwingConstants.CENTER);
        button = new JButton("Aktualis ido");
        button.setPreferredSize(new Dimension(130,30));

        add(label);
        add(button);
        //add(label, BorderLayout.NORTH);
        //add(button, BorderLayout.CENTER);


        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LocalDateTime currentDateTime = LocalDateTime.now(); //lekerjuk a jelenlegi idot es datumot
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"); //formazzuk, hogy szepen irja ki
                String formattedDateTime = currentDateTime.format(formatter);

                label.setText("Datum es ido: " + formattedDateTime);
            }
        });

        setVisible(true);
    }

}
