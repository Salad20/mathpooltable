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
       int[] primes=new int[]{1,2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
     for (int i = 0; i <primes.length ; i++) {
//           for (int j = i+1; j <primes.length ; j++) {
                Pong2 e=new Pong2(primes[i]*100,3100);
//           }
     }
    }
}
