import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MoveCircleFrame extends JFrame {
    private MovePanel movePanel;
    public MoveCircleFrame(){
        setTitle("Mozgo kor");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setBounds(400,400,400,400);
        setLayout(new BorderLayout());
        setResizable(false);

        movePanel = new MovePanel();
        add(movePanel, BorderLayout.CENTER);

        JButton fel = new JButton("↑");
        JButton le = new JButton("↓");
        JButton jobbra = new JButton("→");
        JButton balra = new JButton("←");

        //ezek megmondjak, merre kell mozogjon a kor, meghivva a movecircle metodust
        fel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                movePanel.moveCircle(0, -10);
            }
        });
        le.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                movePanel.moveCircle(0, 10);
            }
        });

        jobbra.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                movePanel.moveCircle(10, 0);
            }
        });

        balra.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                movePanel.moveCircle(-10, 0);
            }
        });
        add(fel, BorderLayout.NORTH);
        add(le, BorderLayout.SOUTH);
        add(jobbra, BorderLayout.EAST);
        add(balra, BorderLayout.WEST);

        //setLocationRelativeTo(null); //kozepre helyezi az ablakot a kepernyon, kiprobaltam igy milyen
        setVisible(true);
    }
}
