import java.awt.*;
import java.awt.geom.Point2D;

public class DrawUtils {

    public static void drawCity(Graphics2D g, int x0, int y0, int height, int widthProjectionOnOX, int depth, Color c) {

            int xCenter = 400;
            int yCenter = 200;

            int flag = 1;
            if(x0 < xCenter){
                flag = 2;
            }

        Polygon face1 = new Polygon();

            int x1 = x0;
            int y1 = y0 - height;

            int x2 = x0 - (int)(Math.pow(-1, flag) * widthProjectionOnOX);
            double t1 = ((yCenter - y1)*1.0) / (xCenter - x1);
            int y2 = (int)(-(xCenter - x2) * t1 + yCenter);

            int x3 = x2;
            double t2 = ((y0 - yCenter)*1.0)/(xCenter - x0);
            int y3 = (int)((xCenter - x3) * t2 + yCenter);

        face1.addPoint(x0, y0);
        face1.addPoint(x1, y1);
        face1.addPoint(x2, y2);
        face1.addPoint(x3, y3);
        face1.addPoint(x0, y0);

        Polygon face2 = new Polygon();

            int x4 = x3 - (int)(Math.pow(-1, flag) * depth);
            int y4 = y3;

            int x5 = x2 - (int)(Math.pow(-1, flag) * depth);
            int y5 = y2;

        face2.addPoint(x2, y2);
        face2.addPoint(x3, y3);
        face2.addPoint(x4, y4);
        face2.addPoint(x5, y5);
        face2.addPoint(x2, y2);

        g.setColor(c);
            g.fillPolygon(face1);
            g.fillPolygon(face2);

        g.setColor(Color.BLACK);
            g.draw(face1);
            g.draw(face2);
    }

    public static void drawRoad(Graphics2D g, int x0, int y0, int width, Color c) {
            int y = 450;
            int x = 800;

        Polygon roadsideL = new Polygon();

            int x1 = (int)(x0 - 0.5 * width);

            int x3 = (int)(x0 - 0.5 * width + 0.1 * width);

        roadsideL.addPoint(x0, y0);
        roadsideL.addPoint(x1, y);
        roadsideL.addPoint(x3, y);
        roadsideL.addPoint(x0, y0);

        Polygon roadsideR = new Polygon();

            int x2 = (int)(x0 + 0.5 * width);

            int x4 = (int)(x0 + 0.5 * width - 0.1 * width);

        roadsideR.addPoint(x0, y0);
        roadsideR.addPoint(x2, y);
        roadsideR.addPoint(x4, y);
        roadsideR.addPoint(x0, y0);

        Polygon roadCentre = new Polygon();

        roadCentre.addPoint(x0, y0);
        roadCentre.addPoint(x3, y);
        roadCentre.addPoint(x4, y);
        roadCentre.addPoint(x0, y0);

        g.setColor(c);
            g.fillRect(0, y0, x, y);

        g.setColor(new Color(0, 0, 0, 70));
            g.fillPolygon(roadsideL);
            g.fillPolygon(roadsideR);

        g.setColor(new Color(0, 0, 0, 100));
            g.fillPolygon(roadCentre);

        g.setColor(Color.BLACK);
            g.drawLine(0, y0, x, y0);
            g.drawPolygon(roadsideL);
            g.drawPolygon(roadsideR);
            g.drawPolygon(roadCentre);
    }

    public static void drawSun(Graphics2D g, int x, int y, int r, int a, Color c){

        Point2D start = new Point2D.Float(0, 0);
        Point2D end = new Point2D.Float(800, 450);

        g.setPaint(new Color(1,31,125, a));
        g.fillRect(0,0,800,450);

        Color[] colors = {new Color(252, 218, 83, 255-a), new Color(244, 142, 40, 255-a), new Color(237,135,51, 255-a)};
        float[] dist = {0f, 0.5f, 1.0f};
        Point2D center = new Point2D.Float(x, y);
        RadialGradientPaint p = new RadialGradientPaint(center, 0.5f * 1300, dist, colors);
        g.setPaint(p);
        g.fillRect(0, 0, 800, 300);

        g.setColor(c);
        g.fillOval(x - r, y - r, 2 * r, 2 * r);
    }

    public static void drawWindow(Graphics2D g, int x0, int y0, int height, boolean type, Color c) {

            int xCenter = 400;
            int yCenter = 200;

            int flag = 1;
            if(x0 < xCenter){
                flag = 2;
            }

        Polygon face1 = new Polygon();

            int x1 = x0;
            int y1 = y0 - height;

            int x2 = x0 - (int)(Math.pow(-1, flag) * height * 0.7);
            int y2 = y1;

            int x3 = x2;
            int y3 = y0;

            if(type){
                double t1 = ((yCenter - y1)*1.0) / (xCenter - x1);
                y2 = (int)(-(xCenter - x2) * t1 + yCenter);

                double t2 = ((y0 - yCenter)*1.0)/(xCenter - x0);
                y3 = (int)((xCenter - x3) * t2 + yCenter);
            }

        face1.addPoint(x0, y0);
        face1.addPoint(x1, y1);
        face1.addPoint(x2, y2);
        face1.addPoint(x3, y3);
        face1.addPoint(x0, y0);

        g.setColor(c);
            g.fillPolygon(face1);

        g.setColor(Color.BLACK);
            g.drawPolygon(face1);
    }
}
