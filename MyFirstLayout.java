import javax.swing.*;
public class MyFirstLayout{
    public static void main(String args[])
    {
        JFrame f1=new JFrame("welcome to my first new layout");
        JButton b1=new JButton("click me");
        f1.add(b1);
        f1.setSize(400,300);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setVisible(true);
    }
    
}