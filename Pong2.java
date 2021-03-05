package Pong2;
import javax.swing.*;
import java.util.*;

public class Pong2 extends JDialog {
    static int a;
    static int b;
    public  Pong2(int a,int b)
    {
        this.a=a;
        this.b=b;
        add(new Board2(a,b,this));
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(1000, 1000);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
    }
    public static void main(String[] args) {
    // replace a and b with dimension of pool table
    Pong2 e=new Pong2(a*100,b*100);
   

    }
}
