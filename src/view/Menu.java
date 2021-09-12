package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 524, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWelcomeToOur = new JLabel("Welcome to my Scientific Calculator");
		lblWelcomeToOur.setFont(new Font("Segoe UI", Font.BOLD, 25));
		lblWelcomeToOur.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcomeToOur.setBounds(15, 11, 488, 54);
		contentPane.add(lblWelcomeToOur);
		
		JButton btnScientificCalculator = new JButton("Scientific Calculator");
		btnScientificCalculator.addActionListener(new ActionListener() {
			CalculatorBody calc=new CalculatorBody();
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				calc.setVisible(true);
			}
		});
		btnScientificCalculator.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btnScientificCalculator.setBounds(131, 112, 256, 27);
		contentPane.add(btnScientificCalculator);
		
		JButton btnNumberSystem = new JButton("Number System");
		btnNumberSystem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NumberSystem num=new NumberSystem();
				setVisible(false);
				num.setVisible(true);
			}
		});
		btnNumberSystem.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btnNumberSystem.setBounds(131, 150, 256, 27);
		contentPane.add(btnNumberSystem);
	}
}
