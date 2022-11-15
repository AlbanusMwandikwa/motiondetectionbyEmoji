import javax.swing.*;
import java.awt.*;

public class Pupil {
    private Eye e;
    private int x, y, width;
    int originX, originY;
    int radius;

    /***
     *
     * @param origin point of origin  of the circle
     * @param radius  distance of the circle from the origin to the circumference
     * @param e its the eye
     */
    public Pupil(Point origin, int radius, Eye e) {
        this.e = e;
        originX = origin.x;
        originY = origin.y;
        this.radius = radius;

    }

    /***
     *
     * @param g helps in the drawing of the pupil
     */
    public void draw(Graphics g) {
        g.setColor(Color.black);
        g.fillOval(originX - radius, originY - radius, radius + radius ,radius + radius);
    }

    public void move() {
        int my = e.mouseY, mx = e.mouseX;
        double theta = Math.atan2(my - e.origin.y, mx - e.origin.x);
        double distance = e.radius - radius;
        int x = (int) (Math.round(Math.cos(theta) * distance) + e.origin.x);
        int y = (int) (Math.round(Math.sin(theta) * distance) + e.origin.y);
        originX = x;
        originY = y;
    }
}
