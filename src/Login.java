import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    private JTextField txtUserLogin;
    private JPasswordField pwdUserpassword;
    private JButton btnpassword;
    private JButton btnclear;
    private JPanel mainPanel;

    public Login() {
        btnpassword.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null , txtUserLogin.getText()
                        + " " + new String(pwdUserpassword.getPassword()));
            }
        });
        btnclear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtUserLogin.setText("");
                pwdUserpassword.setText("");
            }
        });
    }
    public JPanel getMainpanel() {
        return mainPanel;
    }
}