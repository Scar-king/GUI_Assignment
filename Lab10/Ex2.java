package Lab10;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Ex2 {
    public static void main(String[] args) {
        ImageIcon icon = new ImageIcon("itc.png");
        JFrame frame = new JFrame("Quadratic Equation Solver");
        frame.setIconImage(icon.getImage());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 250);
        frame.setLayout(null); 
        frame.setLocationRelativeTo(null);

        JLabel labelA = new JLabel("Enter a:");
        labelA.setBounds(30, 20, 80, 25);
        JTextField textA = new JTextField();
        textA.setBounds(120, 20, 150, 25);

        JLabel labelB = new JLabel("Enter b:");
        labelB.setBounds(30, 60, 80, 25);
        JTextField textB = new JTextField();
        textB.setBounds(120, 60, 150, 25);

        JLabel labelC = new JLabel("Enter c:");
        labelC.setBounds(30, 100, 80, 25);
        JTextField textC = new JTextField();
        textC.setBounds(120, 100, 150, 25);

        JButton solveButton = new JButton("Solve");
        solveButton.setBounds(120, 150, 100, 30);
        solveButton.setFocusable(false);

        frame.add(labelA);
        frame.add(textA);
        frame.add(labelB);
        frame.add(textB);
        frame.add(labelC);
        frame.add(textC);
        frame.add(solveButton);

        solveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double a = Double.parseDouble(textA.getText());
                    double b = Double.parseDouble(textB.getText());
                    double c = Double.parseDouble(textC.getText());

                    double discriminant = b * b - 4 * a * c;
                    String message;

                    if (discriminant > 0) {
                        double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                        double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                        message = "Roots are: " + root1 + " and " + root2;
                    } else if (discriminant == 0) {
                        double root = -b / (2 * a);
                        message = "Root is: " + root;
                    } else {
                        message = "No real roots (complex roots)";
                    }

                    JOptionPane.showMessageDialog(frame, message, "Solution", JOptionPane.INFORMATION_MESSAGE);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Invalid input! Please enter numbers.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        frame.setVisible(true);
    }
}
