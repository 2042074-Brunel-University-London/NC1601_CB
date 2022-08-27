import java.awt.event.*;
import javax.swing.*;

// Calculator
public class Ex9 extends JFrame implements ActionListener {
    private int[] states = { 0, 0 };
    private JLabel result;
    private JLabel history;

    public Ex9() {
        // Create two panels:
        // 1. Buttons
        // 2. Result and history

        // 1. Buttons
        JPanel panel = new JPanel(new GridLayout(4, 4));

        for (int i = 1; i <= 9; i++) {
            JButton button = new JButton(String.valueOf(i));
            button.addActionListener(this);
            panel.add(button);
        }

        JButton button0 = new JButton("0");
        button0.addActionListener(this);
        panel.add(button0);

        

    }

    public static void main(String[] args) {
        new Ex9().setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        String text = button.getText();
        int state = states[0];
        int value = Integer.parseInt(text);
    }
}
