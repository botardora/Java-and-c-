import javax.swing.*;
import java.awt.*;

public class MovePanel extends JPanel {
    private int posX = 50;
    private int posY = 50;

    public MovePanel(){
    }
    public void moveCircle(int deltaX, int deltaY) {
        posX += deltaX; //x tengelyen elmozdulas deltaX, itt modositjuk a poziciot
        posY += deltaY; //y tengelyen elmozdulas deltaY, itt modositjuk a poziciot

        //Korlatozzuk a kor poziciojat, hogy ne logjon ki a panelbol
        if (posX < 0) posX = 0; //ha tulmenne 0-ra allitjuk a poziciot
        if (posY < 0) posY = 0;
        if (posX > getWidth() - 30) posX = getWidth() - 30; //jobb oldalt es alul figyelembe vesszuk a kor szelesseget is
        if (posY > getHeight() - 30) posY = getHeight() - 30;

        repaint();
    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.pink); //jobban tetszik mint az uncsi fekete
        g.fillOval(posX, posY, 30, 30); //30*30 a kor merete

    }

}
