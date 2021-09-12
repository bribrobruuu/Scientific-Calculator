package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import control.Db;

import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class NumberSystem extends JFrame {

	private JPanel contentPane;
	private JTextField txtLefttext;
	private JTextField txtRightText;

	/**
	 * Launch the application.
	 */
	public static void NumberSystem() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NumberSystem frame = new NumberSystem();
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
	public NumberSystem() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 623, 685);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		txtLefttext = new JTextField();
		txtLefttext.setHorizontalAlignment(SwingConstants.TRAILING);
		txtLefttext.setFont(new Font("Segoe UI", Font.BOLD, 18));
		txtLefttext.setEditable(false);
		txtLefttext.setBounds(69, 89, 470, 46);
		contentPane.add(txtLefttext);
		txtLefttext.setColumns(10);

		txtRightText = new JTextField();
		txtRightText.setHorizontalAlignment(SwingConstants.TRAILING);
		txtRightText.setFont(new Font("Segoe UI", Font.BOLD, 18));
		txtRightText.setEditable(false);
		txtRightText.setBounds(69, 252, 470, 46);
		contentPane.add(txtRightText);
		txtRightText.setColumns(10);

		JButton btnOne = new JButton("1");
		btnOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtLefttext.setText(txtLefttext.getText() + "1");
			}
		});
		btnOne.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btnOne.setBounds(69, 442, 61, 23);
		contentPane.add(btnOne);

		JButton btnTwo = new JButton("2");
		btnTwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtLefttext.setText(txtLefttext.getText() + "2");
			}
		});
		btnTwo.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btnTwo.setBounds(160, 442, 61, 23);
		contentPane.add(btnTwo);

		JButton btnThree = new JButton("3");
		btnThree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtLefttext.setText(txtLefttext.getText() + "3");
			}
		});
		btnThree.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btnThree.setBounds(250, 442, 61, 23);
		contentPane.add(btnThree);

		JButton btnFour = new JButton("4");
		btnFour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtLefttext.setText(txtLefttext.getText() + "4");
			}
		});
		btnFour.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btnFour.setBounds(69, 476, 61, 23);
		contentPane.add(btnFour);

		JButton btnFive = new JButton("5");
		btnFive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtLefttext.setText(txtLefttext.getText() + "5");
			}
		});
		btnFive.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btnFive.setBounds(160, 476, 61, 23);
		contentPane.add(btnFive);

		JButton btnSix = new JButton("6");
		btnSix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtLefttext.setText(txtLefttext.getText() + "6");
			}
		});
		btnSix.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btnSix.setBounds(250, 476, 61, 23);
		contentPane.add(btnSix);

		JButton btnSeven = new JButton("7");
		btnSeven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtLefttext.setText(txtLefttext.getText() + "7");
			}
		});
		btnSeven.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btnSeven.setBounds(69, 510, 59, 23);
		contentPane.add(btnSeven);

		JButton btnEight = new JButton("8");
		btnEight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtLefttext.setText(txtLefttext.getText() + "8");
			}
		});
		btnEight.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btnEight.setBounds(160, 510, 61, 23);
		contentPane.add(btnEight);

		JButton btnNine = new JButton("9");
		btnNine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtLefttext.setText(txtLefttext.getText() + "9");
			}
		});
		btnNine.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btnNine.setBounds(248, 510, 61, 23);
		contentPane.add(btnNine);

		JButton btnZero = new JButton("0");
		btnZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtLefttext.setText(txtLefttext.getText() + "0");
			}
		});
		btnZero.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btnZero.setBounds(160, 544, 61, 23);
		contentPane.add(btnZero);

		JButton btnA = new JButton("A");
		btnA.setEnabled(false);
		btnA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtLefttext.setText(txtLefttext.getText() + "a");
			}
		});
		btnA.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btnA.setBounds(337, 442, 61, 23);
		contentPane.add(btnA);

		JButton btnB = new JButton("B");
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtLefttext.setText(txtLefttext.getText() + "b");
			}
		});
		btnB.setEnabled(false);
		btnB.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btnB.setBounds(337, 476, 61, 23);
		contentPane.add(btnB);

		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtLefttext.setText(txtLefttext.getText() + "c");
			}
		});
		btnC.setEnabled(false);
		btnC.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btnC.setBounds(335, 510, 61, 23);
		contentPane.add(btnC);

		JButton btnD = new JButton("D");
		btnD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtLefttext.setText(txtLefttext.getText() + "d");
			}
		});
		btnD.setEnabled(false);
		btnD.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btnD.setBounds(337, 544, 61, 23);
		contentPane.add(btnD);

		JButton btnE = new JButton("E");
		btnE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtLefttext.setText(txtLefttext.getText() + "e");
			}
		});
		btnE.setEnabled(false);
		btnE.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btnE.setBounds(337, 578, 61, 23);
		contentPane.add(btnE);

		JButton btnF = new JButton("F");
		btnF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtLefttext.setText(txtLefttext.getText() + "f");
			}
		});
		btnF.setEnabled(false);
		btnF.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btnF.setBounds(337, 612, 61, 23);
		contentPane.add(btnF);
		JComboBox cmbRight = new JComboBox();
		cmbRight.setFont(new Font("Segoe UI", Font.BOLD, 18));
		cmbRight.setBounds(69, 202, 187, 39);
		contentPane.add(cmbRight);

		JComboBox cmbLeft = new JComboBox();
		cmbLeft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (cmbLeft.getSelectedItem().equals("Hexadecimal")) {
					btnTwo.setEnabled(true);
					btnThree.setEnabled(true);
					btnFour.setEnabled(true);
					btnFive.setEnabled(true);
					btnSix.setEnabled(true);
					btnSeven.setEnabled(true);
					btnNine.setEnabled(true);
					btnEight.setEnabled(true);
					btnA.setEnabled(true);
					btnB.setEnabled(true);
					btnC.setEnabled(true);
					btnD.setEnabled(true);
					btnE.setEnabled(true);
					btnF.setEnabled(true);
					cmbRight.removeAllItems();
					cmbRight.addItem("Binary");
					cmbRight.addItem("Octal");
					cmbRight.addItem("Decimal");
					txtLefttext.setText("");
					txtRightText.setText("");
				}
				if (cmbLeft.getSelectedItem().equals("Decimal")) {
					btnTwo.setEnabled(true);
					btnThree.setEnabled(true);
					btnFour.setEnabled(true);
					btnFive.setEnabled(true);
					btnSix.setEnabled(true);
					btnSeven.setEnabled(true);
					btnNine.setEnabled(true);
					btnEight.setEnabled(true);
					btnA.setEnabled(false);
					btnB.setEnabled(false);
					btnC.setEnabled(false);
					btnD.setEnabled(false);
					btnE.setEnabled(false);
					btnF.setEnabled(false);
					cmbRight.removeAllItems();
					cmbRight.addItem("Binary");
					cmbRight.addItem("Octal");
					cmbRight.addItem("Hexadecimal");
					txtLefttext.setText("");
					txtRightText.setText("");
				}
				if (cmbLeft.getSelectedItem().equals("Octal")) {
					btnTwo.setEnabled(true);
					btnThree.setEnabled(true);
					btnFour.setEnabled(true);
					btnFive.setEnabled(true);
					btnSix.setEnabled(true);
					btnSeven.setEnabled(true);
					btnNine.setEnabled(false);
					btnEight.setEnabled(false);
					btnA.setEnabled(false);
					btnB.setEnabled(false);
					btnC.setEnabled(false);
					btnD.setEnabled(false);
					btnE.setEnabled(false);
					btnF.setEnabled(false);
					cmbRight.removeAllItems();
					cmbRight.addItem("Binary");
					cmbRight.addItem("Decimal");
					cmbRight.addItem("Hexadecimal");
					txtLefttext.setText("");
					txtRightText.setText("");

				}
				if (cmbLeft.getSelectedItem().equals("Binary")) {
					btnTwo.setEnabled(false);
					btnThree.setEnabled(false);
					btnFour.setEnabled(false);
					btnFive.setEnabled(false);
					btnSix.setEnabled(false);
					btnSeven.setEnabled(false);
					btnEight.setEnabled(false);
					btnNine.setEnabled(false);
					btnA.setEnabled(false);
					btnB.setEnabled(false);
					btnC.setEnabled(false);
					btnD.setEnabled(false);
					btnE.setEnabled(false);
					btnF.setEnabled(false);
					cmbRight.removeAllItems();
					cmbRight.addItem("Octal");
					cmbRight.addItem("Decimal");
					cmbRight.addItem("Hexadecimal");
					txtLefttext.setText("");
					txtRightText.setText("");
				}
			}
		});
		cmbLeft.setFont(new Font("Segoe UI", Font.BOLD, 18));
		cmbLeft.setBounds(69, 39, 187, 39);
		contentPane.add(cmbLeft);
		cmbLeft.addItem("Binary");
		cmbLeft.addItem("Decimal");
		cmbLeft.addItem("Octal");
		cmbLeft.addItem("Hexadecimal");

		JButton btnConvert = new JButton("Convert");
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Db db = new Db();
				String Left = cmbLeft.getSelectedItem().toString();
				String Right = cmbRight.getSelectedItem().toString();
				String value = txtLefttext.getText();
				if (Left.equals("Binary") && Right.equals("Octal")) {
					int bin = Integer.parseInt(value, 2);
					String oct = Integer.toOctalString(bin);
					txtRightText.setText(oct);

					String hist = "Binary: " + txtLefttext.getText() + " to Octal: " + txtRightText.getText();
					db.input(hist);
				}
				if (Left.equals("Binary") && Right.equals("Decimal")) {
					int decimal = Integer.parseInt(value, 2);
					String dec = Integer.toString(decimal);
					txtRightText.setText(dec);
					String hist = "Binary: " + txtLefttext.getText() + " to Decimal: " + txtRightText.getText();
					db.input(hist);
				}
				if (Left.equals("Binary") && Right.equals("Hexadecimal")) {
					int decimal = Integer.parseInt(value,2);
					String hexStr = Integer.toString(decimal,16);
					txtRightText.setText(hexStr);
					String hist = "Binary: " + txtLefttext.getText() + " to HexaDecimal: " + txtRightText.getText();
					db.input(hist);
				}
				if (Left.equals("Decimal") && Right.equals("Binary")) {
					int decimal = Integer.parseInt(value);
					String bin = Integer.toString(decimal,2);
					txtRightText.setText(bin);
					String hist = "Decimal: " + txtLefttext.getText() + " to Binary: " + txtRightText.getText();
					db.input(hist);
				}
				if (Left.equals("Decimal") && Right.equals("Octal")) {
					int decimal = Integer.parseInt(value);
					String oct = Integer.toString(decimal,8);
					txtRightText.setText(oct);
					String hist = "Decimal: " + txtLefttext.getText() + " to Octal: " + txtRightText.getText();
					db.input(hist);
				}
				if (Left.equals("Decimal") && Right.equals("Hexadecimal")) {
					int decimal = Integer.parseInt(value);
					String hex = Integer.toString(decimal,16);
					txtRightText.setText(hex);
					String hist = "Decimal: " + txtLefttext.getText() + " to Octal: " + txtRightText.getText();
					db.input(hist);
				}
				if (Left.equals("Octal") && Right.equals("Binary")) {
					int decimal = Integer.parseInt(value,8);
					String bin = Integer.toString(decimal,2);
					txtRightText.setText(bin);
					String hist = "Octal: " + txtLefttext.getText() + " to Binary: " + txtRightText.getText();
					db.input(hist);
				}
				if (Left.equals("Octal") && Right.equals("Decimal")) {
					int decimal = Integer.parseInt(value,8);
					String dec = Integer.toString(decimal);
					txtRightText.setText(dec);
					String hist = "Octal: " + txtLefttext.getText() + " to Decimal: " + txtRightText.getText();
					db.input(hist);
				}
				if (Left.equals("Octal") && Right.equals("Hexadecimal")) {
					int decimal = Integer.parseInt(value,8);
					String hex = Integer.toString(decimal,16);
					txtRightText.setText(hex);
					String hist = "Octal: " + txtLefttext.getText() + " to Hexadecimal: " + txtRightText.getText();
					db.input(hist);
				}
				
				if (Left.equals("Hexadecimal") && Right.equals("Binary")) {
					int decimal = Integer.parseInt(value,16);
					String hex = Integer.toBinaryString(decimal);
					txtRightText.setText(hex);
					String hist = "Hexadecimal: " + txtLefttext.getText() + " to Binary: " + txtRightText.getText();
					db.input(hist);
				}
				if (Left.equals("Hexadecimal") && Right.equals("Octal")) {
					int decimal = Integer.parseInt(value,16);
					String hex = Integer.toOctalString(decimal);
					txtRightText.setText(hex);
					String hist = "Hexadecimal: " + txtLefttext.getText() + " to Octal: " + txtRightText.getText();
					db.input(hist);
				}
				
				if (Left.equals("Hexadecimal") && Right.equals("Decimal")) {
					int decimal = Integer.parseInt(value,16);
					String hex = Integer.toString(decimal);
					txtRightText.setText(hex);
					String hist = "Hexadecimal: " + txtLefttext.getText() + " to Octal: " + txtRightText.getText();
					db.input(hist);
				}
				
			}
		});
		btnConvert.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btnConvert.setBounds(230, 356, 146, 23);
		contentPane.add(btnConvert);

		JLabel lblTo = new JLabel("To");
		lblTo.setHorizontalAlignment(SwingConstants.LEFT);
		lblTo.setFont(new Font("Segoe UI", Font.BOLD, 18));
		lblTo.setBounds(69, 157, 46, 27);
		contentPane.add(lblTo);

		JButton btnDel = new JButton("Del");
		btnDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String temp = txtLefttext.getText();
				if (temp.equals("")) {

				} else {
					txtLefttext.setText(removeLastChar(temp));
				}

			}
		});
		btnDel.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btnDel.setBounds(478, 442, 106, 23);
		contentPane.add(btnDel);

		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String temp = txtLefttext.getText();
				if (temp.equals("")) {

				} else {
					txtLefttext.setText("");
				}
			}
		});
		btnClear.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btnClear.setBounds(478, 476, 106, 23);
		contentPane.add(btnClear);

		JButton btnHistory = new JButton("History");
		btnHistory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				History hist = new History();
				hist.setVisible(true);
				setVisible(false);
			}
		});
		btnHistory.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btnHistory.setBounds(478, 548, 106, 23);
		contentPane.add(btnHistory);

		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu menu = new Menu();
				setVisible(false);
				menu.setVisible(true);
			}
		});
		btnBack.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btnBack.setBounds(478, 582, 106, 23);
		contentPane.add(btnBack);
	}

	public static String removeLastChar(String str) {
		return removeLastChars(str, 1);
	}

	public static String removeLastChars(String str, int chars) {

		return str.substring(0, str.length() - chars);

	}
}
