package LeapYear;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class LeapYearGUI extends JFrame{
    private JPanel jpanel;
    private JTextField tfYear;
    private JButton btnCheckYear;

    LeapYearGUI() {
        btnCheckYear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkLeapYear();
                clearInput();
            }
        });
        tfYear.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_ENTER) {
                    checkLeapYear();
                    clearInput();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        LeapYearGUI gui = new LeapYearGUI();
        gui.setSize(400,250);
        gui.setVisible(true);
        gui.setDefaultCloseOperation(EXIT_ON_CLOSE);
        gui.setContentPane(gui.jpanel);
        gui.setTitle("Leap Year Checker");
    }

    public void checkLeapYear() {
        try {
            int year = Integer.parseInt(tfYear.getText());
            if (year % 4 == 0 && year % 100 != 0) {
                JOptionPane.showMessageDialog(jpanel, "Leap year");
            } else if (year % 400 == 0) {
                JOptionPane.showMessageDialog(jpanel, "Leap year");
            } else {
                JOptionPane.showMessageDialog(jpanel, "Not a leap year");
            }
        }catch(NumberFormatException nfe) {
            JOptionPane.showMessageDialog(jpanel, "Invalid input");
        }
    }
    public void clearInput() {
        tfYear.setText("");
    }
}
