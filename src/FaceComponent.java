import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.*;

public class FaceComponent extends JPanel implements MouseMotionListener
{
    Eye[] eyes = new Eye[2];
    FaceComponent(){
        eyes[0] = new Eye(55, 65, 30, 40);
        eyes[1] = new Eye(135, 65, 30, 40);
        addMouseMotionListener(this);
    }


    public void paintComponent(Graphics g) {
        super.paintComponent(g);

//   setting of colour black of the outer circle
        g.setColor(Color.black);

//        drawing the outer circle
        g.fillOval(5,5,210,210);

//        setting of colour yellow of the inner circle
        g.setColor(Color.yellow);

//        drawing the inner circle
        g.fillOval(10, 10, 200, 200);

        //drawing the eyes
        eyes[0].draw(g);
        eyes[1].draw(g);

        //drawing the mouth
        g.fillOval(50, 110, 120, 60);


        //setting of a smiling mouth
        g.setColor(Color.yellow);
        g.fillRect(50, 110, 120, 30);
        g.fillOval(50, 120, 120, 40);

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        eyes[0].setMouseX(x);
        eyes[1].setMouseX(x);
        eyes[0].setMouseY(y);
        eyes[1].setMouseY(y);


        eyes[0].rotate();
        eyes[1].rotate();

        repaint();
    }
}

