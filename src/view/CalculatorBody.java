package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import control.Db;
import control.Function;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class CalculatorBody extends JFrame {
	public String text = "";
	private JPanel contentPane;
	private JTextField txtScreen;
	static boolean isDecimal = false;

	/**
	 * Launch the application.
	 */
	public void CalculatorBody(){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorBody frame = new CalculatorBody();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public CalculatorBody() {
		
		setResizable(false);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 709, 519);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblScreen = new JLabel("");
		lblScreen.setHorizontalAlignment(SwingConstants.RIGHT);
		lblScreen.setForeground(new Color(0, 250, 154));
		lblScreen.setFont(new Font("Segoe UI", Font.BOLD, 27));
		lblScreen.setBounds(34, 11, 635, 53);
		contentPane.add(lblScreen);

		JButton button = new JButton("0");
		button.setFont(new Font("Segoe UI", Font.BOLD, 18));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblScreen.setText(lblScreen.getText() + "0");
				text += "0";
			}
		});
		button.setBounds(348, 325, 71, 29);
		contentPane.add(button);

		JButton btnNewButton = new JButton("1");
		btnNewButton.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblScreen.setText(lblScreen.getText() + "1");
				text += "1";

			}
		});
		btnNewButton.setBounds(265, 281, 71, 29);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("4");
		btnNewButton_1.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblScreen.setText(lblScreen.getText() + "4");
				text += "4";
			}
		});
		btnNewButton_1.setBounds(265, 237, 71, 29);
		contentPane.add(btnNewButton_1);

		JButton button_1 = new JButton("7");
		button_1.setFont(new Font("Segoe UI", Font.BOLD, 18));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblScreen.setText(lblScreen.getText() + "7");
				text += "7";
			}
		});
		button_1.setBounds(265, 197, 71, 29);
		contentPane.add(button_1);

		JButton btnNewButton_2 = new JButton("8");
		btnNewButton_2.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblScreen.setText(lblScreen.getText() + "8");
				text += "8";
			}
		});
		btnNewButton_2.setBounds(348, 197, 71, 29);
		contentPane.add(btnNewButton_2);

		JButton button_2 = new JButton("5");
		button_2.setFont(new Font("Segoe UI", Font.BOLD, 18));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblScreen.setText(lblScreen.getText() + "5");
				text += "5";
			}
		});
		button_2.setBounds(348, 237, 71, 29);
		contentPane.add(button_2);

		JButton button_3 = new JButton("2");
		button_3.setFont(new Font("Segoe UI", Font.BOLD, 18));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblScreen.setText(lblScreen.getText() + "2");
				text += "2";
			}
		});
		button_3.setBounds(348, 281, 71, 29);
		contentPane.add(button_3);

		JButton button_4 = new JButton(".");
		button_4.setFont(new Font("Segoe UI", Font.BOLD, 18));
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (isDecimal == false) {
					lblScreen.setText(lblScreen.getText() + ".");
					text += ".";
					isDecimal = true;
				}

			}
		});
		button_4.setBounds(431, 325, 71, 29);
		contentPane.add(button_4);

		JButton button_5 = new JButton("9");
		button_5.setFont(new Font("Segoe UI", Font.BOLD, 18));
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblScreen.setText(lblScreen.getText() + "9");
				text += "9";
			}
		});
		button_5.setBounds(431, 197, 71, 29);
		contentPane.add(button_5);

		JButton button_6 = new JButton("6");
		button_6.setFont(new Font("Segoe UI", Font.BOLD, 18));
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblScreen.setText(lblScreen.getText() + "6");
				text += "6";
			}
		});
		button_6.setBounds(431, 237, 71, 29);
		contentPane.add(button_6);

		JButton button_7 = new JButton("3");
		button_7.setFont(new Font("Segoe UI", Font.BOLD, 18));
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblScreen.setText(lblScreen.getText() + "3");
				text += "3";
			}
		});
		button_7.setBounds(431, 281, 71, 29);
		contentPane.add(button_7);

		JButton button_9 = new JButton("(");
		button_9.setFont(new Font("Segoe UI", Font.BOLD, 18));
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblScreen.setText(lblScreen.getText() + "(");
				text += "(";
				isDecimal = false;
			}
		});
		button_9.setBounds(348, 155, 71, 29);
		contentPane.add(button_9);

		JButton button_10 = new JButton(")");
		button_10.setFont(new Font("Segoe UI", Font.BOLD, 18));
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblScreen.setText(lblScreen.getText() + ")");
				text += ")";
				isDecimal = false;
			}
		});
		button_10.setBounds(431, 155, 71, 29);
		contentPane.add(button_10);

		JButton button_11 = new JButton("%");
		button_11.setFont(new Font("Segoe UI", Font.BOLD, 18));
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_11.setBounds(514, 155, 71, 29);
		contentPane.add(button_11);

		JButton button_12 = new JButton("+");
		button_12.setFont(new Font("Segoe UI", Font.BOLD, 18));
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblScreen.setText(lblScreen.getText() + "+");
				text += "+";
				isDecimal = false;

			}
		});
		button_12.setBounds(514, 325, 71, 29);
		contentPane.add(button_12);

		JButton button_13 = new JButton("-");
		button_13.setFont(new Font("Segoe UI", Font.BOLD, 18));
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblScreen.setText(lblScreen.getText() + "-");
				text += "-";
				isDecimal = false;
			}
		});
		button_13.setBounds(514, 281, 71, 29);
		contentPane.add(button_13);

		JButton btnX = new JButton("x");
		btnX.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblScreen.setText(lblScreen.getText() + "*");
				text += "*";
				isDecimal = false;
			}
		});
		btnX.setBounds(514, 237, 70, 29);
		contentPane.add(btnX);

		JButton button_14 = new JButton("\u00F7");
		button_14.setFont(new Font("Segoe UI", Font.BOLD, 18));
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblScreen.setText(lblScreen.getText() + "/");
				text += "/";
				isDecimal = false;
			}
		});
		button_14.setBounds(514, 197, 71, 29);
		contentPane.add(button_14);

		JButton btnSin = new JButton("sin");
		btnSin.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblScreen.setText(lblScreen.getText() + "sin(");
				text += "sin(";
				isDecimal = false;
			}
		});
		btnSin.setBounds(16, 155, 71, 29);
		contentPane.add(btnSin);

		JButton btnNewButton_3 = new JButton("cos");
		btnNewButton_3.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblScreen.setText(lblScreen.getText() + "cos(");
				text += "cos(";
				isDecimal = false;
			}
		});
		btnNewButton_3.setBounds(16, 197, 71, 29);
		contentPane.add(btnNewButton_3);

		JButton btnTan = new JButton("tan");
		btnTan.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblScreen.setText(lblScreen.getText() + "tan(");
				text += "tan(";
				isDecimal = false;
			}
		});
		btnTan.setBounds(16, 237, 71, 29);
		contentPane.add(btnTan);

		JButton btnLog = new JButton("log");
		btnLog.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btnLog.setBounds(16, 281, 71, 29);
		contentPane.add(btnLog);

		JButton button_15 = new JButton("\u221A");
		button_15.setFont(new Font("Segoe UI", Font.BOLD, 13));
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblScreen.setText(lblScreen.getText() + "\u221A");
				text += "sqrt(";
				isDecimal = false;
			}
		});
		button_15.setBounds(182, 155, 71, 29);
		contentPane.add(button_15);

		txtScreen = new JTextField();
		txtScreen.setEditable(false);
		txtScreen.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtScreen.setHorizontalAlignment(SwingConstants.RIGHT);
		txtScreen.setBounds(34, 77, 635, 40);
		contentPane.add(txtScreen);
		txtScreen.setColumns(10);

		JButton btnX_1 = new JButton("^");
		btnX_1.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btnX_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblScreen.setText(lblScreen.getText() + "^");
				text += "^";
				isDecimal = false;
			}
		});
		btnX_1.setBounds(265, 155, 71, 29);
		contentPane.add(btnX_1);

		JButton btnC = new JButton("C");
		btnC.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblScreen.setText("");
				txtScreen.setText("");
				text = "";

			}
		});
		btnC.setBounds(597, 197, 71, 29);
		contentPane.add(btnC);
		JButton button_8 = new JButton("=");
		button_8.setFont(new Font("Segoe UI", Font.BOLD, 18));
		button_8.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				try {
					Function func = new Function();
					Db db = new Db();
					txtScreen.setText(lblScreen.getText() + " = " + func.eval(text));
					String toHistory = txtScreen.getText();
					db.input(toHistory);
					lblScreen.setText("");
					text = "";
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Syntax Error");
					text = "";
					txtScreen.setText("");
					lblScreen.setText("");
				}
			}
		});
		button_8.setForeground(Color.BLACK);
		button_8.setBackground(new Color(64, 224, 208));
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Function func = new Function();
					Db db = new Db();
					txtScreen.setText(lblScreen.getText() + " = " + func.eval(text));
					String toHistory = txtScreen.getText();
					db.input(toHistory);
					lblScreen.setText("");
					text = "";
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Syntax Error");
					text = "";
					txtScreen.setText("");
					lblScreen.setText("");
				}
			}
		});

		button_8.setBounds(597, 237, 71, 117);
		contentPane.add(button_8);

		JButton btnHistory = new JButton("History");
		btnHistory.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btnHistory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				History hist = new History();
				hist.setVisible(true);
				setVisible(false);
			}
		});
		btnHistory.setBounds(182, 412, 97, 30);
		contentPane.add(btnHistory);

		JButton button_16 = new JButton("<-");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button_16.setFont(new Font("Segoe UI", Font.BOLD, 18));
		button_16.setBounds(597, 155, 71, 29);
		contentPane.add(button_16);

		JButton btnCsc = new JButton("csc");
		btnCsc.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btnCsc.setBounds(99, 155, 71, 29);
		contentPane.add(btnCsc);

		JButton btnSec = new JButton("sec");
		btnSec.setFont(new Font("Segoe UI", Font.BOLD, 19));
		btnSec.setBounds(99, 197, 71, 29);
		contentPane.add(btnSec);

		JButton btnCot = new JButton("cot");
		btnCot.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btnCot.setBounds(99, 237, 71, 29);
		contentPane.add(btnCot);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu menu=new Menu();
				setVisible(false);
				menu.setVisible(true);
			}
		});
		btnBack.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btnBack.setBounds(413, 412, 97, 30);
		contentPane.add(btnBack);
	}
}
