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
	private JLabel lblName;
	private JLabel lblArmor;
	private JLabel lblAtk;
	private JLabel lblStr;
	private JLabel lblAgi;
	private JLabel lblint;
	
	private int currentEXPBar = 0;
	private int currentFloor = 1;
	private JLabel lblLine1;
	private JLabel lblLine2;
	private JLabel lblNewLabel;
	private JLabel lblActionText;
	
	private int level;
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
	
	public void setPlayer(Job PlayerClass, int level) {
		PlayerJob = PlayerClass;
		this.level = level;
	}	
	
	public void setText() {
		lblLine1.setText("You have battled a total of: " + currentEXPBar + " times");
		lblLine2.setText("You are at Floor " + currentFloor);
		lblHP.setText("");
		lblName.setText("");
		lblArmor.setText("");
		lblAtk.setText("");
		lblStr.setText("");
		lblAgi.setText("");
		lblint.setText("");
	}
	
	public ActionMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblHP = new JLabel("");
		lblHP.setBounds(249, 11, 175, 14);
		contentPane.add(lblHP);
		
		lblName = new JLabel("");
		lblName.setBounds(249, 36, 175, 14);
		contentPane.add(lblName);
		
		lblArmor = new JLabel("");
		lblArmor.setBounds(249, 61, 175, 14);
		contentPane.add(lblArmor);
		
		lblAtk = new JLabel("");
		lblAtk.setBounds(249, 86, 175, 14);
		contentPane.add(lblAtk);
		
		lblStr = new JLabel("");
		lblStr.setBounds(249, 111, 175, 14);
		contentPane.add(lblStr);
		
		lblAgi = new JLabel("");
		lblAgi.setBounds(249, 136, 175, 14);
		contentPane.add(lblAgi);
		
		lblint = new JLabel("");
		lblint.setBounds(249, 161, 175, 14);
		contentPane.add(lblint);
		
		JButton btnNewButton = new JButton("View Profile");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PlayerJob.setStat(level);
				lblHP.setText("You are a " + PlayerJob.getName());
				lblName.setText("Your HP: " + PlayerJob.getHp());
				lblArmor.setText("Your Armor: " + PlayerJob.getArmor());
				lblAtk.setText("Your Attack: " + PlayerJob.getAttack());
				lblStr.setText("Your Str: " + PlayerJob.getStr());
				lblAgi.setText("Your Agi: " + PlayerJob.getAgi());
				lblint.setText("Your Int: " + PlayerJob.getIntel());
			}
		});
		btnNewButton.setBounds(10, 161, 152, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Grind EXP");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				currentEXPBar++;
				level = (int) (1 + Math.floor(currentEXPBar / 2));
				lblActionText.setText("You killed a monster! You gained an amount of EXP");
				setText();
			}
		});
		btnNewButton_1.setBounds(10, 91, 152, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Fight Boss");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(PlayerJob.getHp() - (currentFloor*1000) >= 0) {
					currentFloor++;
					lblActionText.setText("You advanced to the next floor");
					setText();
				}else {
					currentEXPBar = currentEXPBar/2;
					level = (int) (1 + Math.floor(currentEXPBar / 2));
					lblActionText.setText("You have died and your battle progress is halved...");
					setText();
				}
			}
		});
		btnNewButton_2.setBounds(10, 127, 152, 23);
		contentPane.add(btnNewButton_2);
		
		lblLine1 = new JLabel("You have battled a total of: " + currentEXPBar + " times");
		lblLine1.setBounds(10, 11, 207, 14);
		contentPane.add(lblLine1);
		
		lblLine2 = new JLabel("You are at Floor " + currentFloor);
		lblLine2.setBounds(10, 36, 169, 14);
		contentPane.add(lblLine2);
		
		lblNewLabel = new JLabel("What would you like to do?");
		lblNewLabel.setBounds(10, 61, 169, 14);
		contentPane.add(lblNewLabel);
		
		lblActionText = new JLabel("");
		lblActionText.setBounds(10, 217, 444, 14);
		contentPane.add(lblActionText);
		
		
	}
}
