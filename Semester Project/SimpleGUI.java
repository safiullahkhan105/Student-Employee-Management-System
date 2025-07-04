import javax.swing.*;
import java.awt.event.*;
class ButtonClickEvent {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Button Click Event Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JButton
        JButton button = new JButton("Click Me");

        // Add ActionListener to the button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Button Clicked!");
            }
        });

        // Add button to the frame
        frame.add(button);
        frame.setVisible(true);
    }
}
