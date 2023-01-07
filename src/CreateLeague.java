import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class CreateLeague {
    private JButton createLeagueButton;
    private JCheckBox checkBox3;
    private JCheckBox checkBox4;
    private JCheckBox checkBox2;
    private JCheckBox checkBox1;
    private JCheckBox checkBox5;
    private JCheckBox checkBox6;
    private JCheckBox checkBox7;
    private JCheckBox checkBox8;
    private JLabel teamsIconLabel;


    public CreateLeague(ArrayList<Team> teams, User currentUser, League league) {
        checkBox1.setText(teams.get(0).getTeam_Name());
        checkBox2.setText(teams.get(1).getTeam_Name());
        checkBox3.setText(teams.get(2).getTeam_Name());
        checkBox4.setText(teams.get(3).getTeam_Name());
        checkBox5.setText(teams.get(4).getTeam_Name());
        checkBox6.setText(teams.get(5).getTeam_Name());
        checkBox7.setText(teams.get(6).getTeam_Name());
        checkBox8.setText(teams.get(7).getTeam_Name());


        createLeagueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                league.draw((Admin)currentUser );
            }
        });

        checkBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                teamsIconLabel = new JLabel(teams.get(0).getEmblem());
            }
        });
        checkBox5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                teamsIconLabel = new JLabel(teams.get(4).getEmblem());
            }
        });
        checkBox2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                teamsIconLabel = new JLabel(teams.get(1).getEmblem());
            }
        });
        checkBox6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                teamsIconLabel = new JLabel(teams.get(5).getEmblem());
            }
        });
        checkBox3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                teamsIconLabel = new JLabel(teams.get(2).getEmblem());
            }
        });
        checkBox7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                teamsIconLabel = new JLabel(teams.get(6).getEmblem());
            }
        });
        checkBox4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                teamsIconLabel = new JLabel(teams.get(3).getEmblem());
            }
        });
        checkBox8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                teamsIconLabel = new JLabel(teams.get(7).getEmblem());
            }
        });
    }
}
