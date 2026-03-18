import java.awt.*;
import java.awt.event.*;

public class awt24 extends Frame implements ActionListener {
    Label l1, l2, l3, result;
    TextField t1, t2, t3, tResult;
    Button btn;

    awt24() {
        setTitle("Maximum of Three Numbers");

        l1 = new Label("Enter First Number:");
        l2 = new Label("Enter Second Number:");
        l3 = new Label("Enter Third Number:");
        result = new Label("Maximum:");

        t1 = new TextField();
        t2 = new TextField();
        t3 = new TextField();
        tResult = new TextField();
        tResult.setEditable(false);

        btn = new Button("Find Maximum");
        btn.addActionListener(this);

        setLayout(new GridLayout(5, 2, 10, 10));

        add(l1); add(t1);
        add(l2); add(t2);
        add(l3); add(t3);
        add(result); add(tResult);
        add(btn);

        setSize(300, 200);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int num1 = Integer.parseInt(t1.getText());
            int num2 = Integer.parseInt(t2.getText());
            int num3 = Integer.parseInt(t3.getText());

            int max = num1;

            if (num2 > max) {
                max = num2;
            }
            if (num3 > max) {
                max = num3;
            }

            tResult.setText(String.valueOf(max));
        } catch (NumberFormatException ex) {
            tResult.setText("Invalid Input");
        }
    }

    public static void main(String[] args) {
        new awt24();
    }
}
