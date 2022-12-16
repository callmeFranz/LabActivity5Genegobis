package FoodOrdering;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

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

    private List<JCheckBox> menu;
    private List<JRadioButton> discounts;
    private final int[] price_lists = {100, 80, 65, 55, 50, 40};

    FoodOrderGUI() {
        menu = new ArrayList<>();
        menu.add(cPizza);
        menu.add(cBurger);
        menu.add(cFries);
        menu.add(cSoftDrinks);
        menu.add(cTea);
        menu.add(cSundae);
        discounts = new ArrayList<>();
        discounts.add(rbNone);
        discounts.add(rb5);
        discounts.add(rb10);
        discounts.add(rb15);
        clearSelection();
        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                payment();
                clearSelection();
            }
        });
    }

    public static void main(String[] args) {
        FoodOrderGUI gui = new FoodOrderGUI();
        gui.setVisible(true);
        gui.setSize(700, 500);
        gui.setContentPane(gui.jpanel);
        gui.setDefaultCloseOperation(EXIT_ON_CLOSE);
        gui.setTitle("Food Ordering System");
    }
    public void payment() {
        try {
            double total = 0;
            int index = 0;
            boolean selected = false;
            for (JCheckBox cb : menu) {
                if (cb.isSelected()) {
                    total +=  price_lists[index];
                    selected = true;
                }
                index++;
            }
            if(!selected) {
                throw new NoSelectionException("You haven't chosen any food yet");
            }
            index = 0;
            for (JRadioButton rb : discounts) {
                if (rb.isSelected()) {
                    break;
                }
                index++;
            }
            switch (index) {
                case 0:
                    break;
                case 1:
                    total = total - (0.05 * total);
                    break;
                case 2:
                    total = total - (0.1 * total);
                    break;
                case 3:
                    total = total - (0.15 * total);
                    break;
            }
            JOptionPane.showMessageDialog(jpanel, String.format("The total price is PHP %.2f", total));

        } catch(NoSelectionException nse) {
            JOptionPane.showMessageDialog(jpanel, nse.getMessage());

        }
    }
    public void clearSelection() {
        rbNone.setSelected(true);
        for(JCheckBox cb : menu) {
            cb.setSelected(false);
        }
    }
    public static class NoSelectionException extends Exception {
        NoSelectionException(String s) {
            super(s);
        }
    }
}
