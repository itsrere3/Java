import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentRegistrationGUI {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Student Registration");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(5, 2));

        // Labels
        JLabel nameLabel = new JLabel("Name:");
        JLabel ageLabel = new JLabel("Age:");
        JLabel collegeLabel = new JLabel("College:");
        JLabel idLabel = new JLabel("Student ID:");

        // Input fields
        JTextField nameField = new JTextField();
        JTextField ageField = new JTextField();
        JTextField collegeField = new JTextField();
        JTextField idField = new JTextField();

        // Button
        JButton submitButton = new JButton("Submit");

        // Add components
        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(ageLabel);
        frame.add(ageField);
        frame.add(collegeLabel);
        frame.add(collegeField);
        frame.add(idLabel);
        frame.add(idField);
        frame.add(new JLabel());
        frame.add(submitButton);

        // Button action
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String age = ageField.getText();
                String college = collegeField.getText();
                String id = idField.getText();

                JOptionPane.showMessageDialog(frame,
                        "Welcome, " + name + "!\nAge: " + age +
                        "\nCollege: " + college +
                        "\nStudent ID: " + id);
            }
        });

        frame.setVisible(true);
    }
}
