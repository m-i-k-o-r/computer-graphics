import java.awt.*;

public class Window {
    int x0, y0, height;
    boolean type;
    Color c;

    public Window(int x0, int y0, int height, boolean type, Color c) {
        this.x0 = x0;
        this.y0 = y0;
        this.height = height;
        this.type = type;
        this.c = c;
    }

    public void drawWindow(Graphics2D g){
        DrawUtils.drawWindow(g, x0, y0, height, type, c);
    }

    public void AnimationWindow(int step, int y){
        if(y >= 250){
            c = new Color(255, 230, 55);
        } else {
            c = new Color(62, 145, 240);
        }
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
}
