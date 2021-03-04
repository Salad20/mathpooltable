package Pong2;
import java.awt.Graphics;
import javax.swing.*;
import javax.swing.Timer;
import java.awt.geom.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.util.*;
import java.awt.event.KeyListener;
import java.util.Random;

class Board2 extends JPanel{
    int x=Pong2.a;
    int y=Pong2.b;
    Wall topWall = new Wall(0, 0, x, 1);
    Wall leftWall = new Wall (0,0,1,y);
    Wall rightWall = new Wall (x,0,1,y);
    Wall bottomWall = new Wall (0,y,x,1);
    Ball ball = new Ball(0,y,12,12);
    int score1;
    Timer t;
    public Board2(int a, int b,JDialog frame) {
        x=a;
        y=b;
        setFocusable(true);
        ActionListener s = new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ball.move();
                //more game code will go here
                if (ball.intersects(topWall.getX(), topWall.getY(), topWall.getW(), topWall.getH())) {
                    ball.changeYdir(1);
                    score1++;
                }
                if (ball.intersects(bottomWall.getX(), bottomWall.getY(), bottomWall.getW(), bottomWall.getH())) {
                    ball.changeYdir(-1);
                    score1++;
                }
                if (ball.intersects(leftWall.getX(), leftWall.getY(), leftWall.getW(), leftWall.getH())) {
                    ball.changeXdir(1);
                    score1++;
                }
                if (ball.intersects(rightWall.getX(), rightWall.getY(), rightWall.getW(), rightWall.getH())) {
                    ball.changeXdir(-1);
                    score1++;
                }
                if(ball.intersects(0,0,1,1)){
                    ball.stop();
                    System.out.println("Top left "+(score1-7)/3+" "+a/100+" "+b/100);
                    score1=0;
                    setVisible(false);
                    frame.dispose();
                }
                if(ball.intersects(x-1,0,1,1)){
                    ball.stop();
                    System.out.println("Top right "+(score1-7)/3+" "+a/100+" "+b/100);
                    score1=0;
                    setVisible(false);
                    frame.dispose();

                }
                if(ball.intersects(x-1,y-1,1,1)){
                    ball.stop();
                    System.out.println("Bottom right "+ (score1-7)/3+" "+a/100+" "+b/100);
                    score1=0;
                    setVisible(false);
                    frame.dispose();
                }
                repaint();
            }
        };
        t = new Timer(10, s);
        t.start();
    }


    public void paint(Graphics g)
    {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;

        g2.setColor(Color.ORANGE);
        topWall.paint(g2);
        leftWall.paint(g2);
        rightWall.paint(g2);
        bottomWall.paint(g2);
        ball.paint(g2);
    }
}
