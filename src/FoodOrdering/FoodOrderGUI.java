package FoodOrdering;

import javax.swing.*;

public class FoodOrderGUI extends JFrame{
    private JPanel jpanel;
    private JCheckBox cPizza;
    private JRadioButton rbNone;
    private JButton btnOrder;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;

    public static void main(String[] args) {
        FoodOrderGUI gui = new FoodOrderGUI();
        gui.setVisible(true);
        gui.setSize(700, 500);
        gui.setContentPane(gui.jpanel);
        gui.setDefaultCloseOperation(EXIT_ON_CLOSE);
        gui.setTitle("Food Ordering System");
    }
}
