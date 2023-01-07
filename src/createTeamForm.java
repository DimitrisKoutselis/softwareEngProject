import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class createTeamForm {

    private JTextField teamNameTextField;
    private JTextField teamCityTextField;
    private JTextField teamPointsTextField;
    private JButton CREATETEAMButton;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JRadioButton radioButton3;
    private JRadioButton radioButton4;
    private JRadioButton radioButton5;
    private JRadioButton radioButton6;
    private JRadioButton radioButton7;
    private JRadioButton radioButton8;
    private JRadioButton radioButton9;
    private JRadioButton radioButton10;
    private JComboBox comboBox1;

    public createTeamForm() {
        CREATETEAMButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String team_Name = teamNameTextField.getText().toString();
                String team_City = teamCityTextField.getText().toString();
                Integer team_Points = Integer.valueOf(teamPointsTextField.getText());
                Admin admin = new Admin();
                ImageIcon team_icon;


                try {
                    if (!team_Name.equals(null) && !team_City.equals(null) && !team_Points.equals(null)) {
                        admin.Create_Team(team_Name, team_City, team_Points, team_Icon);
                        //JOptionPane.showConfirmDialog(this,"Η Δημιουργία Ομάδας Πραγματοποιήθηκε Με Επιτυχία!");
                    } else if (team_Name.equals(null) || !team_City.equals(null) || team_Points.equals(null)) {
                        //JOptionPane.showMessageDialog(this,"Παρακαλώ Συμπληρώστε Τα Πεδία Κατάλληλα");
                        //katharismos olwn twn textfields
                    }
                } catch (RuntimeException ex) {
                    //JOptionPane.showMessageDialog(this, "Σφάλμα:" + " " +ex.getMessage().toString());
                }
            }
        });


    }
}


