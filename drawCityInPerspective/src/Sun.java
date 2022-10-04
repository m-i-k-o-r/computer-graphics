import java.awt.*;

public class Sun {
    private int x, y, r, a;
    private Color c;

    public Sun(int x, int y, int r, int a, Color c) {
        this.x = x;
        this.y = y;
        this.r = r;
        this.a = a;
        this.c = c;
    }

    public void draw(Graphics2D g){
        DrawUtils.drawSun(g, x, y, r, a, c);
    }

    public void AnimationSun(int step){

        if(y <= 250) {
            if (x < 300) {
                x = x + step;
                y = y - 2;

                if(a > 3){
                    a = a - 3;
                }
            } else if (x < 500){
                x = x + step;
            } else {
                x = x + step;
                y = y + 2;

                if(a < 252){
                    a = a + 3;
                }
            }
        }else{
            if (x > 500) {
                x = x - step;
                y = y + 2;
            } else if (x > 300){
                x = x - step;
            } else {
                x = x - step;
                y = y - 2;
            }

        }
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public Color getC() {
        return c;
    }

    public void setC(Color c) {
        this.c = c;
    }
}
