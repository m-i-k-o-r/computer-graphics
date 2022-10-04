import java.awt.*;

public class Light {
    int a;

    public Light(int a) {
        this.a = a;
    }

    public void DrawLight(Graphics2D g){
        g.setColor(new Color(0,0,0, a));
        g.fillRect(0, 0, 800, 450);
    }

    public void AnimationLight(int y){
        if(y > 200 && a < 100){
            a = a + 3;
        }else if(y < 200 && a > 3){
            a = a - 3;
        }
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
