package Lab10;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ex1 {
    private int count = 0;
    private JLabel label;
    ImageIcon icon = new ImageIcon("itc.png");

    public Ex1() {
        JFrame frame = new JFrame("First Program in GUI");
        frame.setIconImage(icon.getImage());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new BorderLayout());
        frame.setLocationRelativeTo(null);

        // Label to display count
        label = new JLabel("0", JLabel.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 24));
        frame.add(label, BorderLayout.CENTER);

        // Panel to hold buttons
        JPanel buttonPanel = new JPanel(new FlowLayout());
        
        JButton increaseButton = new JButton("Increase");
        increaseButton.setFocusable(false);
        increaseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                label.setText(String.valueOf(count));
            }
        });
        buttonPanel.add(increaseButton);

        JButton decreaseButton = new JButton("Decrease");
        decreaseButton.setFocusable(false);
        decreaseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count--;
                label.setText(String.valueOf(count));
            }
        });
        buttonPanel.add(decreaseButton);

        frame.add(buttonPanel, BorderLayout.SOUTH);
        
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Ex1();
    }
}
