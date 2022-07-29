import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {

	private JPanel btnSubmit;
	private JTextField TfName;
	
	private MainMenu Menu= new MainMenu();
	
	private JLabel lblName;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setTitle("MainMenu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		btnSubmit = new JPanel();
		btnSubmit.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(btnSubmit);
		btnSubmit.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Test");
		lblNewLabel.setBounds(10, 11, 46, 14);
		btnSubmit.add(lblNewLabel);
		
		TfName = new JTextField();
		TfName.setBounds(10, 30, 86, 20);
		btnSubmit.add(TfName);
		TfName.setColumns(10);
		
		lblName = new JLabel("");
		lblName.setBounds(10, 110, 46, 14);
		btnSubmit.add(lblName);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = TfName.getText();
				lblName.setText(text);
				Menu.main(null);
			}
		});
		btnNewButton.setBounds(7, 186, 89, 23);
		btnSubmit.add(btnNewButton);
	}
}
