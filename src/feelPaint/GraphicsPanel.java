package feelPaint;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;
import static java.lang.Math.random;

public class GraphicsPanel extends JPanel{

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D gr = (Graphics2D)g;
        BasicStroke pen1 = new BasicStroke(5);
        gr.setStroke(pen1);

        //Рандомно выбирает цвет и расположение
        for (int i = 0; i < 3; i++) {
            switch(i) {
                case 0:
                    gr.setColor(new Color((int)(Math.random()*(200-10)+10),(int)(Math.random()*(200-10)+10),(int)(Math.random()*(200-10)+10)));
                    gr.drawLine((int)(Math.random()*(300-10)+10), (int)(Math.random()*(300-10)+10), (int)(Math.random()*(300-10)+10), (int)(Math.random()*(300-10)+10));
                    break;
                case 1:
                    gr.setColor(new Color((int)(Math.random()*(200-10)+10),(int)(Math.random()*(200-10)+10),(int)(Math.random()*(200-10)+10)));
                    gr.drawRect((int)(Math.random()*(300-10)+10), (int)(Math.random()*(300-10)+10), (int)(Math.random()*(300-10)+10), (int)(Math.random()*(300-10)+10));
                    break;
                case 2:
                    gr.setColor(new Color((int)(Math.random()*(200-10)+10),(int)(Math.random()*(200-10)+10),(int)(Math.random()*(200-10)+10)));
                    gr.drawOval((int)(Math.random()*(300-10)+10), (int)(Math.random()*(300-10)+10), (int)(Math.random()*(300-10)+10), (int)(Math.random()*(300-10)+10));
                    break;
            }
        }
    }
}