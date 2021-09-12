package view;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import control.Db;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
public class History extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public void History(){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					History frame = new History();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public History() {
		
		Db db=new Db();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 590, 491);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHistory = new JLabel("History (Last 10 Calculations):");
		lblHistory.setFont(new Font("Sitka Text", Font.BOLD, 19));
		lblHistory.setBounds(27, 28, 311, 16);
		contentPane.add(lblHistory);
		
		JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("Sitka Display", Font.BOLD, 19));
		textPane.setEditable(false);
		textPane.setBounds(27, 57, 506, 328);
		contentPane.add(textPane);
		
		JButton btnClose = new JButton("Go Back");
		btnClose.setFont(new Font("Segoe UI", Font.BOLD, 11));
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Menu menu=new Menu();
				menu.setVisible(true);
				setVisible(false);
				
			}
		});
		btnClose.setBounds(220, 398, 97, 25);
		contentPane.add(btnClose);
		
		
			for(int x=db.theList().size()-1;x>9;x--){
				db.theList().remove(x);
			}
			int size=db.theList().size();
			for(int x=0; x<size;x++){
				textPane.setText(textPane.getText()+(x+1)+": "+db.output(x)+"\n");
			}
		
		
	}
}
