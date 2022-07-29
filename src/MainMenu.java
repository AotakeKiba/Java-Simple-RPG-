import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainMenu extends JFrame {

	private JPanel contentPane;
	private int ClassChosen;
	private JLabel lbltest;
	private Job playerClass;
	private int level = 1;

	private String[][] job = {
			{"Warrior","STR"},
			{"Priest","INT"},
			{"Archer","AGI"}
	};
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu frame = new MainMenu();
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
	public MainMenu() {		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Select your class");
		lblNewLabel.setBounds(5, 5, 424, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Warrior");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ClassChosen = 0;
				lbltest.setText("Warrior");
				playerClass = MakeClass(ClassChosen);
//				ChangePanel(playerClass);
				ChangePanel();
			}
		});
		btnNewButton.setBounds(5, 30, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Priest");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ClassChosen = 1;
				lbltest.setText("Priest");
				playerClass = MakeClass(ClassChosen);
//				ChangePanel(playerClass);
				ChangePanel();
			}
		});
		btnNewButton_1.setBounds(5, 64, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Archer");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ClassChosen = 2;
				lbltest.setText("Archer");
				playerClass = MakeClass(ClassChosen);
//				ChangePanel(playerClass);
				ChangePanel();
			}
		});
		btnNewButton_2.setBounds(5, 98, 89, 23);
		contentPane.add(btnNewButton_2);
		
		lbltest = new JLabel("");
		lbltest.setBounds(5, 146, 354, 14);
		contentPane.add(lbltest);
	}
	
		private Job MakeClass(int number) {
			playerClass = new Job();
			playerClass.setName(job[number][0]);
			playerClass.setHeroType(job[number][1]);
			playerClass.setStat(level);
			return playerClass;
		}
	
//		private Job ChangePanel(Job playerClass) {
//			playerClass.setStat(level);
//			lbltest.setText("You are a " + playerClass.getName());
//			System.out.println("Your HP: " + playerClass.getHp());
//			System.out.println("Your Armor: " + playerClass.getArmor());
//			System.out.println("Your Attack: " + playerClass.getAttack());
//			System.out.println("Your Str: " + playerClass.getStr());
//			System.out.println("Your Agi: " + playerClass.getAgi());
//			System.out.println("Your Int: " + playerClass.getIntel());
//			System.out.println("Press enter to continue...");
//			return null;
//		}
		private void ChangePanel() {
			ActionMenu action = new ActionMenu();
			action.setPlayer(playerClass);
			action.setVisible(true);
		}
		
		public Job getPlayerClass() {			
			return playerClass;
		}

}
