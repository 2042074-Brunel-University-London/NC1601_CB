import javax.swing.*;
import java.awt.event.*;

public class myfraim extends JFrame implements ActionListener {
    // Fields

    JPanel panel;
    JButton button;
    JLabel label;
    JTextField textField;

    int count = 0;

    // Constructors
    public myfraim() {
        panel = new JPanel();
        button = new JButton("Add");
        label = new JLabel("0");
        textField = new JTextField(25);
        textField.setText("0");
        textField.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();
                }
            }
        });

        // change lable bounds
        button.addActionListener(this);

        add(panel);
        panel.add(button);
        panel.add(label);
        panel.add(textField);
    }

    // Methods
    public static void main(String[] args) {
        JFrame frame = new myfraim();

        frame.setSize(300, 300);
        frame.setTitle("GUI App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            String n = textField.getText();
            int num = Integer.parseInt(n);
            count += num;
            label.setText(Integer.toString(count));
            textField.setText("0");
        }
    }
}