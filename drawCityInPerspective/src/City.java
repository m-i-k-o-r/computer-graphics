import java.awt.*;

public class City {
    int x0, y0, height, widthProjectionOnOX, depth;

    Color c;

    public City(int x0, int y0, int height, int widthProjectionOnOX, int depth, Color c) {
        this.x0 = x0;
        this.y0 = y0;
        this.height = height;
        this.widthProjectionOnOX = widthProjectionOnOX;
        this.depth = depth;
        this.c = c;
    }

    public void drawCity(Graphics2D g){
        DrawUtils.drawCity(g, x0, y0, height, widthProjectionOnOX, depth, c);
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

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidthProjectionOnOY() {
        return widthProjectionOnOX;
    }

    public void setWidthProjectionOnOY(int widthProjectionOnOY) {
        this.widthProjectionOnOX = widthProjectionOnOY;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public Color getC() {
        return c;
    }

    public void setC(Color c) {
        this.c = c;
    }
}
