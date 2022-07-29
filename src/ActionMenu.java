import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ActionMenu extends JFrame {

	private JPanel contentPane;
	private Job PlayerJob;
	private MainMenu PlayerClass = new MainMenu();
	private JLabel lblHP;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					ActionMenu frame = new ActionMenu();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
	/**
	 * Create the frame.
	 */
	
	public void setPlayer(Job PlayerClass) {
		PlayerJob = PlayerClass;
	}	
	
	public ActionMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Klik");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblHP.setText(PlayerJob.getName());
			}
		});
		btnNewButton.setBounds(10, 95, 89, 23);
		contentPane.add(btnNewButton);
		
		lblHP = new JLabel("");
		lblHP.setBounds(10, 11, 46, 14);
		contentPane.add(lblHP);
		
		
	}
	


}
