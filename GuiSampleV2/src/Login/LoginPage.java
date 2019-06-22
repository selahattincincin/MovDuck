package Login;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import Main.MainPage;

import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class LoginPage {

	private JFrame frame;
	private JTextField txtUsername;
	private JTextField txtPassword;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage window = new LoginPage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("88px"),
				ColumnSpec.decode("51px"),
				ColumnSpec.decode("130px"),},
			new RowSpec[] {
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("16px"),
				RowSpec.decode("34px"),
				RowSpec.decode("26px"),
				RowSpec.decode("40px"),
				RowSpec.decode("26px"),
				RowSpec.decode("95px"),
				RowSpec.decode("29px"),}));
		
		JLabel lblLoginSystem = new JLabel("Login System");
		frame.getContentPane().add(lblLoginSystem, "4, 2, right, top");
		
		JLabel lblUsername = new JLabel("Username:");
		frame.getContentPane().add(lblUsername, "2, 4, fill, center");
		
		JLabel lblPassword = new JLabel("Password:");
		frame.getContentPane().add(lblPassword, "2, 6, fill, center");
		
		txtUsername = new JTextField();
		frame.getContentPane().add(txtUsername, "4, 4, left, top");
		txtUsername.setColumns(10);
		
		txtPassword = new JTextField();
		frame.getContentPane().add(txtPassword, "4, 6, left, top");
		txtPassword.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = txtUsername.getText();
				String password = txtPassword.getText();

				if (password.contains("s") && username.contains("s")) {
					txtPassword.setText(null);
					txtUsername.setText(null);
					MainPage.main(null);	
					frame.dispose();
					
							
				} else {
					JOptionPane.showMessageDialog(null, "Invalid Password", "Login Error", JOptionPane.ERROR_MESSAGE);
					txtPassword.setText(null);
					txtUsername.setText(null);
				}
			}
		});
		frame.getContentPane().add(btnLogin, "4, 8, fill, top");
	}

	protected static void dispose() {
		// TODO Auto-generated method stub
		
	}

}
