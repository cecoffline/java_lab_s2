import java.awt.*;
import java.awt.event.*;

public class calculator extends Frame implements ActionListener {

    Label lbl;
    TextField tf;
    Button b1, b2, b3, b4, b5;

    double num1, num2, result;
    String operator;

    calculator() {
        setTitle("Simple AWT Calculator");
        setSize(300, 200);
        setLayout(new FlowLayout());

        lbl = new Label("Enter Expression:");
        add(lbl);

        tf = new TextField(20);
        add(tf);

        b1 = new Button("+");
        b2 = new Button("-");
        b3 = new Button("*");
        b4 = new Button("/");
        b5 = new Button("=");

        add(b1); add(b2); add(b3); add(b4); add(b5);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        String input = tf.getText();

        try {
            if (ae.getSource() == b1) {
                num1 = Double.parseDouble(input);
                operator = "+";
                tf.setText("");
            }
            else if (ae.getSource() == b2) {
                num1 = Double.parseDouble(input);
                operator = "-";
                tf.setText("");
            }
            else if (ae.getSource() == b3) {
                num1 = Double.parseDouble(input);
                operator = "*";
                tf.setText("");
            }
            else if (ae.getSource() == b4) {
                num1 = Double.parseDouble(input);
                operator = "/";
                tf.setText("");
            }
            else if (ae.getSource() == b5) {
                num2 = Double.parseDouble(input);

                if (operator.equals("+"))
                    result = num1 + num2;
                else if (operator.equals("-"))
                    result = num1 - num2;
                else if (operator.equals("*"))
                    result = num1 * num2;
                else if (operator.equals("/"))
                    result = num1 / num2;

                tf.setText(String.valueOf(result));
            }
        } catch (Exception e) {
            tf.setText("Error");
        }
    }

    public static void main(String[] args) {
        new calculator();
    }
}
