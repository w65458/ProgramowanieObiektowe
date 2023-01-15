package Lab5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class SwingExample2 extends JFrame {
    private JPanel JPanel1;
    private JPanel JLabelA;
    private JRadioButton linuxRadioButton;
    private JRadioButton windowsRadioButton;
    private JRadioButton macRadioButton;
    private JButton okButton;
    private JLabel ImageLabel;

    ImageIcon linuxIcon = new ImageIcon(Objects.requireNonNull(getClass().getClassLoader().getResource("Linux.png")));
    ImageIcon windowsIcon = new ImageIcon(Objects.requireNonNull(getClass().getResource("Windows.png")));
    ImageIcon macIcon = new ImageIcon(Objects.requireNonNull(getClass().getResource("Apple.png")));

    public static void main(String[] args) {
        SwingExample2 swingExample = new SwingExample2();
        swingExample.setVisible(true);
    }

    public SwingExample2() throws HeadlessException {
        super("Moje okienko");
        this.setContentPane(this.JPanel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 500);
        this.pack();

        linuxRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (linuxRadioButton.isSelected()) {
                    ImageLabel.setIcon(resize(linuxIcon, 120, 120));
                }
            }
        });
    }

    public static ImageIcon resize(ImageIcon src, int destWidth, int destHeight) {
        Image scaledImage = src.getImage().getScaledInstance(destWidth, destHeight, Image.SCALE_SMOOTH);
        return new ImageIcon(scaledImage);
    }
}
