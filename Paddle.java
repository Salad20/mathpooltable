package Pong2;
import java.awt.*;

public class Paddle {
    private Rectangle r;
    private int xpos, ypos, width, height, speed, xdir, ydir;

    public Paddle(int x, int y, int w, int h){

        xpos = x;
        ypos = y;
        width = w;
        height = h;
        speed = 50;
        xdir = 0;
        ydir = 1;

        r = new Rectangle(xpos, ypos, width, height);
    }
    public void move(int y, int x) {
        ydir = y;
        xdir=x;
        xpos = xpos + speed * xdir;
        ypos = ypos + speed * ydir;
        r.setFrame(xpos, ypos, width, height);

    }

    public boolean intersects(int x, int y, int w, int h){
        return r.intersects(x, y, w, h);
    }

    public int getX(){
        return xpos;
    }
    public int getY(){
        return ypos;
    }
    public int getW(){
        return width;
    }
    public int getH(){
        return height;
    }
    public void paint(Graphics2D g2){

        g2.fill(r);
    }
}












