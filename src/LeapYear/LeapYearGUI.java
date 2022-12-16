package LeapYear;

import javax.swing.*;

public class LeapYearGUI extends JFrame{
    private JPanel jpanel;
    private JTextField tfYear;
    private JButton btnCheckYear;

    public static void main(String[] args) {
        LeapYearGUI gui = new LeapYearGUI();
        gui.setSize(550,600);
        gui.setVisible(true);
        gui.setDefaultCloseOperation(EXIT_ON_CLOSE);
        gui.setContentPane(gui.jpanel);
    }
}
