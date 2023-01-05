import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeleteUserForm {
    private JPasswordField passwordField1;
    private JPanel DeleteUserPanel;
    private JButton confirmButton;

    public DeleteUserForm() {
        confirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String password = passwordField1.getText();

            }
        });
    }
}
