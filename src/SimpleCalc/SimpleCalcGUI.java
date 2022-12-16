package SimpleCalc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.List;

public class SimpleCalcGUI extends JFrame {
    private JPanel jpanel;
    private JTextField tfNumber1;
    private JButton computeResultButton;
    private JComboBox cbOperations;
    private JTextField tfNumber2;
    private JTextField lblResult;

    SimpleCalcGUI() {
        lblResult.setEditable(false);
        computeResultButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                doOperation();
                clearInputs();
            }
        });
        tfNumber1.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_ENTER) {
                    doOperation();
                    clearInputs();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
        tfNumber2.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_ENTER) {
                    doOperation();
                    clearInputs();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
    }
    public static void main(String[] args) {
        SimpleCalcGUI gui = new SimpleCalcGUI();
        gui.setVisible(true);
        gui.setSize(650, 350);
        gui.setContentPane(gui.jpanel);
        gui.setDefaultCloseOperation(EXIT_ON_CLOSE);
        gui.setTitle("Simple Calculator");
    }
    public void doOperation() {
        try {
            float number1 = Float.parseFloat(tfNumber1.getText());
            float number2 = Float.parseFloat(tfNumber2.getText());
            float result = 0;
            String[] ops = {"+", "-", "*", "/"};
            switch (ops[cbOperations.getSelectedIndex()]) {
                case "+":
                    result = number1 + number2;
                    int final_result = (int) result;
                    lblResult.setText(String.valueOf(final_result));
                    break;
                case "-":
                    result = number1 - number2;
                    final_result = (int) result;
                    lblResult.setText(String.valueOf(final_result));
                    break;
                case "*":
                    result = number1 * number2;
                    final_result = (int) result;
                    lblResult.setText(String.valueOf(final_result));
                    break;
                case "/":
                    result = (number1 / number2);
                    lblResult.setText(String.valueOf(result));
                    break;
            }
        } catch(NumberFormatException nfe) {
            JOptionPane.showMessageDialog(jpanel,"Invalid input");
        } catch(ArithmeticException ae) {
            JOptionPane.showMessageDialog(jpanel, "Arithmetic error");
        }
    }
    public void clearInputs() {
        tfNumber1.setText("");
        tfNumber2.setText("");
    }
}
