package SimpleCalc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class SimpleCalcGUI extends JFrame {
    private JPanel jpanel;
    private JTextField tfNumber1;
    private JButton computeResultButton;
    private JTextField tfNumber2;
    private JTextField lblResult;

    private JComboBox cbOperations;
    /* SimpleCalcGUI() {
        lblResult.setEditable(false);
        computeResultButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                doOperation();
            }
        });
    }*/
    public static void main(String[] args) {
        SimpleCalcGUI gui = new SimpleCalcGUI();
        gui.setVisible(true);
        gui.setSize(650, 350);
        gui.setContentPane(gui.jpanel);
        gui.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    /*public void doOperation() {
        float number1 = Float.parseFloat(tfNumber1.getText());
        float number2 = Float.parseFloat(tfNumber2.getText());
        float result = 0;
        String[] ops = {"+", "-", "*", "/"};
        switch(ops[cbOperations.getSelectedIndex()]) {
            case "+":
                result = number1 + number2;
                int final_result = (int)result;
                lblResult.setText(String.valueOf(final_result));
                break;
            case "-":
                result = number1 - number2;
                final_result = (int)result;
                lblResult.setText(String.valueOf(final_result));
                break;
            case "*":
                result = number1 * number2;
                final_result = (int)result;
                lblResult.setText(String.valueOf(final_result));
                break;
            case "/":
                result = (number1 / number2);
                lblResult.setText(String.valueOf(result));
                break;
        }
    } */
}
