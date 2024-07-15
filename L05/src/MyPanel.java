import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    private int circleX=100;
    private int circleY=100;
    private int circleWidth=100;
    private int circleHeight=100;

    public void setCircleWidth(int circleWidth) {
        this.circleWidth = circleWidth;
    }

    public void setCircleHeight(int circleHeight) {
        this.circleHeight = circleHeight;
    }

    public void setCircleX(int circleX) {
        this.circleX = circleX;
    }

    public void setCircleY(int circleY) {
        this.circleY = circleY;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.magenta);
        g.fillOval(circleX,circleY,100,100);

    }
}
