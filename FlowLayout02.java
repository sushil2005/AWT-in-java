import javax.swing.*;
import java.awt.*;

public class FlowLayout02{

    public static void main(String[] args) {

        JFrame frame = new JFrame("FlowLayout Example");

        frame.setLayout(new FlowLayout());

        JButton b1=new JButton("one");
        JButton b2=new JButton("two");
        JButton b3=new JButton("three");
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        
        frame .setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
