import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class DrawPanel extends JPanel {
    private City house1, house2, house3, house4, house5, house6, house7, house8, house9, house10;
    private ArrayList<Window> windows;
    private Road road;
    private Timer timer;
    private Sun s;
    private Light l;
    public DrawPanel(){

        timer = new Timer(15, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
            s.AnimationSun(3);
            l.AnimationLight(s.getY());

            for(Window w: windows){
                w.AnimationWindow(3, s.getY());
            }
            repaint();
            }
        });
        timer.start();

        s = new Sun(100, 200, 35, 50, new Color(255,251,226));

        road = new Road(400, 200, 280, new Color(84,84,84));

        house1 = new City(210, 355, 170,115,190, new Color(120,120, 40));
        house2 = new City(280, 300, 140,40,150, new Color(100, 80, 80));
        house3 = new City(310, 270, 130,40,100, new Color(100, 100, 70));
        house4 = new City(335, 250, 70,20,40, new Color(100, 120, 40));
        house5 = new City(375, 215, 35,20,30, new Color(120, 120, 50));

        house6 = new City(545, 340, 210,60,200, new Color(100, 120, 40));
        house7 = new City(520, 300, 110,40,100, new Color(130, 80, 25));
        house8 = new City(475, 260, 75,30,80, new Color(80, 80, 60));
        house9 = new City(450, 235, 80,30,80, new Color(100, 80, 80));
        house10 = new City(425, 215, 30,15,30, new Color(100, 100, 70));


        windows = new ArrayList<>();

        windows.add(new Window(625, 350, 50, false, new Color(60, 100, 160)));
        windows.add(new Window(700, 250, 50, false, new Color(60, 100, 160)));
        windows.add(new Window(50, 250, 50, false, new Color(60, 100, 160)));
        windows.add(new Window(555, 180, 40, true, new Color(62, 145, 240)));
        windows.add(new Window(267, 270, 30, true, new Color(45, 100, 160)));
        windows.add(new Window(190, 250, 45, true, new Color(62, 145, 240)));
        windows.add(new Window(190, 310, 45, true, new Color(62, 145, 240)));
        windows.add(new Window(455, 200, 18, true, new Color(45, 100, 160)));

        l = new Light(0);

    }
    @Override
    protected void paintComponent(Graphics g) {

        Graphics2D gr = (Graphics2D) g;
        s.draw(gr);

        road.drawRoad(gr);

        house10.drawCity(gr);
        house9.drawCity(gr);
        house8.drawCity(gr);
        house7.drawCity(gr);
        house6.drawCity(gr);
        house5.drawCity(gr);
        house4.drawCity(gr);
        house3.drawCity(gr);
        house2.drawCity(gr);
        house1.drawCity(gr);

        for(Window w: windows){
            w.drawWindow(gr);
        }

        l.DrawLight(gr);
    }
}