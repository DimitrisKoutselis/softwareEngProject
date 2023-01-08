import javax.swing.*;
import java.awt.*;

public class LogInForm {

    public LogInForm() {
        initComponents();
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - unknown
        createUIComponents();

        var panel1 = new JPanel();
        var label1 = new JLabel();
        LogInFormTextField2 = new JTextField();
        var label2 = new JLabel();

        //======== panel1 ========
        {
            panel1.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border.
            EmptyBorder( 0, 0, 0, 0) , "JF\u006frm\u0044es\u0069gn\u0065r \u0045va\u006cua\u0074io\u006e", javax. swing. border. TitledBorder. CENTER, javax. swing
            . border. TitledBorder. BOTTOM, new java .awt .Font ("D\u0069al\u006fg" ,java .awt .Font .BOLD ,12 ),
            java. awt. Color. red) ,panel1. getBorder( )) ); panel1. addPropertyChangeListener (new java. beans. PropertyChangeListener( )
            { @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062or\u0064er" .equals (e .getPropertyName () ))
            throw new RuntimeException( ); }} );
            panel1.setLayout(new GridLayoutManager(3, 5, new Insets(0, 0, 0, 0), -1, -1));

            //---- label1 ----
            label1.setLabelFor(LogInFormTextField1);
            label1.setText("Username:");
            panel1.add(label1, new GridConstraints(0, 0, 3, 1,
                GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_FIXED,
                GridConstraints.SIZEPOLICY_WANT_GROW,
                null, null, null));

            //---- LogInFormTextField1 ----
            LogInFormTextField1.setText("");
            panel1.add(LogInFormTextField1, new GridConstraints(0, 1, 3, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL,
                GridConstraints.SIZEPOLICY_CAN_GROW | GridConstraints.SIZEPOLICY_WANT_GROW,
                GridConstraints.SIZEPOLICY_FIXED,
                null, null, null));
            panel1.add(LogInFormTextField2, new GridConstraints(0, 3, 3, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL,
                GridConstraints.SIZEPOLICY_CAN_GROW | GridConstraints.SIZEPOLICY_WANT_GROW,
                GridConstraints.SIZEPOLICY_FIXED,
                null, null, null));

            //---- label2 ----
            label2.setLabelFor(LogInFormTextField2);
            label2.setText("Password:");
            label2.setDisplayedMnemonic(80);
            panel1.add(label2, new GridConstraints(1, 2, 1, 1,
                GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_FIXED,
                GridConstraints.SIZEPOLICY_FIXED,
                null, null, null));

            //---- LogInFormButton ----
            LogInFormButton.setText("Log In");
            panel1.add(LogInFormButton, new GridConstraints(2, 4, 1, 1,
                GridConstraints.ANCHOR_SOUTH, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_FIXED,
                null, null, null));
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - unknown
    private JTextField LogInFormTextField1;
    private JTextField LogInFormTextField2;
    private JButton LogInFormButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
