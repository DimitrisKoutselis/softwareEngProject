import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterForm {

    private JLabel registerFormLabel1;
    private JTextField registerFormTextField1;
    private JTextField registerFormTextField2;
    private JButton registerFormButton;





    private void createUIComponents() {
        // TODO: place custom component creation code here

    }

    public RegisterForm(JTextField registerFormTextField1, JTextField registerFormTextField2) {
        this.registerFormTextField1 = registerFormTextField1;
        this.registerFormTextField2 = registerFormTextField2;
    }

    public RegisterForm() {
        registerFormButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String username = (String) registerFormTextField1.getText();
                    String password = (String) registerFormTextField2.getText();
                    if (!username.equals(null) && !password.equals(null)) {
                        Supporter supporter = new Supporter();
                        supporter.Register(username, password);
                    } else if (username.equals(null) || password.equals(null)) {
                        //JOptionPane.showMessageDialog(this,"Παρακαλώ Συμπληρώστε Τα Πεδία Κατάλληλα");
                        registerFormTextField1.setText("ΕΙΣΑΓΕΤΕ ΟΝΟΜΑ ΧΡΗΣΤΗ");
                        registerFormTextField2.setText("ΕΙΣΑΓΕΤΕ ΚΩΔΙΚΟ ΠΡΟΣΒΑΣΗΣ");
                    }
                }catch(RuntimeException ex){
                    //JOptionPane.showMessageDialog(this, "Σφάλμα:" + " " +ex.getMessage().toString());
                }
            }
        });
    }
}
