import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BorderLayoutCalculator extends JFrame implements ActionListener {

    JTextField t1, t2, t3;
    JButton add, sub, mul, div;

    public BorderLayoutCalculator() {
        setTitle("Border Layout Calculator");
        setSize(500,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel north = new JPanel();
        north.add(new JLabel("Simple Calculator"));
        add(north, BorderLayout.NORTH);

        JPanel center = new JPanel(new GridLayout(3,2,5,5));
        center.add(new JLabel("First Number"));
        t1 = new JTextField();
        center.add(t1);

        center.add(new JLabel("Second Number"));
        t2 = new JTextField();
        center.add(t2);

        center.add(new JLabel("Result"));
        t3 = new JTextField();
        center.add(t3);

        add(center, BorderLayout.CENTER);

        JPanel east = new JPanel(new GridLayout(4,1,5,5));
        add = new JButton("Add");
        sub = new JButton("Subtract");
        mul = new JButton("Multiply");
        div = new JButton("Divide");

        east.add(add);
        east.add(sub);
        east.add(mul);
        east.add(div);

        add(east, BorderLayout.EAST);

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());
        int r = 0;

        if(e.getSource() == add) r = a + b;
        if(e.getSource() == sub) r = a - b;
        if(e.getSource() == mul) r = a * b;
        if(e.getSource() == div) r = a / b;

        t3.setText(String.valueOf(r));
    }

    public static void main(String[] args) {
        new BorderLayoutCalculator().setVisible(true);
    }
}
