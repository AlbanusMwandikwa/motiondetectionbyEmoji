import java.awt.*;

public class Eye {
    int x, y, mouseX, mouseY;
    int top, left, right, bottom;
    int height, width;
    Pupil p;
    int radius;
    Point origin;

    public Eye(int x, int y, int height, int width) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
        radius = width / 2;

        origin = new Point(x + radius, y + radius);
        this.p = new Pupil(origin, 10, this);
    }

    /***
     *
     * @param origin point of origin of the circle
     * @param radius distance between the origin to the circumference of the circle
     */
    public Eye(Point origin, int radius) {
        this.origin = origin;
        this.radius = radius;
    }

    /***
     *
     * @param g graphics
     */
    public void draw(Graphics g) {
        g.setColor(Color.white);
        g.fillOval(origin.x - radius, origin.y - radius, radius + radius, radius + radius);
        p.draw(g);
    }

    public void rotate() {
        p.move();
    }

    /***
     *
     * @param mouseX indicates the horizontal position of the cursor
     */
    public void setMouseX(int mouseX) {
        this.mouseX = mouseX;
    }

    /***
     *
     * @param mouseY indicates the vertical  position of the the cursor
     */
    public void setMouseY(int mouseY) {
        this.mouseY = mouseY;
    }

}
