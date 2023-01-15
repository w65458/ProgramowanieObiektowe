package Lab5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingExample extends JFrame {
    private JPanel JPanel1;
    private JButton suma;
    private JButton roznica;
    private JButton wyjscie;
    private JTextField textField1;
    private JTextField textField2;
    private JLabel JLabelWynik;

    double liczbaA, liczbaB, wynik;

    public static void main(String[] args) {
        SwingExample swingExample = new SwingExample();
        swingExample.setVisible(true);
    }

    public SwingExample() throws HeadlessException {
        super("Moje okienko");
        this.setContentPane(this.JPanel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 500);
        this.pack();
        suma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                liczbaA = Double.parseDouble(textField1.getText());
                liczbaB = Double.parseDouble(textField2.getText());
                wynik = liczbaA + liczbaB;
                JLabelWynik.setText("Suma: " + wynik);
            }
        });
        roznica.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                liczbaA = Double.parseDouble(textField1.getText());
                liczbaB = Double.parseDouble(textField2.getText());
                wynik = liczbaA - liczbaB;
                JLabelWynik.setText("Suma: " + wynik);
            }
        });
        wyjscie.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }
}
