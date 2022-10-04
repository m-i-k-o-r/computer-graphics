import java.awt.*;
public class Road {
    private int x0, y0, width;
    private Color c;
    public Road(int x0, int y0, int width, Color c) {
        this.x0 = x0;
        this.y0 = y0;
        this.width = width;
        this.c = c;
    }

    public void drawRoad(Graphics2D g){
        DrawUtils.drawRoad(g, x0, y0, width, c);
    }

    public int getX0() {
        return x0;
    }

    public void setX0(int x0) {
        this.x0 = x0;
    }

    public int getY0() {
        return y0;
    }

    public void setY0(int y0) {
        this.y0 = y0;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Color getC() {
        return c;
    }

    public void setC(Color c) {
        this.c = c;
    }
}
