package Lab9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PEnerge extends JFrame {

    JTextField m;
    JTextField v;
    public PEnerge() {

        super("Кінетична енергія тіла");
        super.setBounds(700, 300, 450, 300);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container cont = super.getContentPane();
        cont.setLayout(new GridLayout(3, 2, 5, 5));

        JLabel mr = new JLabel("Введіть велечину m= ");
        m = new JTextField(2);
        JLabel vr = new JLabel("Введіть велечину v= ");
        v = new JTextField(2);
        cont.add(mr);
        cont.add(m);
        cont.add(vr);
        cont.add(v);


        JButton butt = new JButton("Порахувати");

        cont.add(butt);

        butt.addActionListener(new Button_());
    }

    class Button_ implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                double mass = Double.parseDouble(m.getText());
                double vaw = Double.parseDouble(v.getText());
                double result = (mass*vaw*vaw)/2;
                JOptionPane.showMessageDialog(null, "Результат: " + result + " Дж");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Введіть коректне число.");
            }
        }
    }
}


