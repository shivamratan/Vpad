

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class find{

	private JFrame frame;
	private JTextField textField;

	/*
	 * Launch the application.
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					find window = new find();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 
	public void find() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public find() {
		frame = new JFrame();
		frame.setBounds(100, 100, 400, 190);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblFind = new JLabel("Find :");
		lblFind.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblFind.setBounds(10, 28, 104, 34);
		frame.getContentPane().add(lblFind);
		
		textField = new JTextField();
		textField.setBounds(69, 37, 144, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnFindPrevious = new JButton("Find Previous");
		btnFindPrevious.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});
		btnFindPrevious.setBounds(282, 28, 89, 23);
		frame.getContentPane().add(btnFindPrevious);
		
		JButton btnFindNext = new JButton("Find Next");
		btnFindNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});
		btnFindNext.setBounds(282, 72, 89, 23);
		frame.getContentPane().add(btnFindNext);
		
		JRadioButton rdbtnUp = new JRadioButton("Up");
		rdbtnUp.setBounds(120, 110, 49, 23);
		frame.getContentPane().add(rdbtnUp);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Down");
		rdbtnNewRadioButton.setBounds(171, 110, 81, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JLabel lblDirection = new JLabel("Direction");
		lblDirection.setBounds(120, 96, 81, 14);
		frame.getContentPane().add(lblDirection);
		
		JCheckBox chckbxMatchCase = new JCheckBox("Match Case");
		chckbxMatchCase.setBounds(6, 110, 97, 23);
		frame.getContentPane().add(chckbxMatchCase);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
			}
		});
		btnCancel.setBounds(282, 110, 89, 23);
		frame.getContentPane().add(btnCancel);
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		new find();
	}
}
