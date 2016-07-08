

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class replace {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	
	public replace() {
		frame = new JFrame();
		frame.setBounds(100, 100, 447, 203);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblFindWhat = new JLabel("Find What");
		lblFindWhat.setBounds(10, 23, 55, 22);
		frame.getContentPane().add(lblFindWhat);
		
		textField = new JTextField();
		textField.setBounds(108, 24, 183, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Replace with");
		lblNewLabel.setBounds(10, 62, 68, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(108, 55, 183, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnFindNext = new JButton("Find Next");
		btnFindNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
			}
		});
		btnFindNext.setBounds(321, 23, 100, 23);
		frame.getContentPane().add(btnFindNext);
		
		JButton btnReplace = new JButton("Replace");
		btnReplace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});
		btnReplace.setBounds(321, 62, 100, 23);
		frame.getContentPane().add(btnReplace);
		
		JButton btnReplaceAll = new JButton("Replace All");
		btnReplaceAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});
		btnReplaceAll.setBounds(321, 96, 100, 23);
		frame.getContentPane().add(btnReplaceAll);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});
		btnCancel.setBounds(321, 130, 100, 23);
		frame.getContentPane().add(btnCancel);
		
		JCheckBox chckbxMatchCase = new JCheckBox("Match Case");
		chckbxMatchCase.setBounds(26, 130, 97, 23);
		frame.getContentPane().add(chckbxMatchCase);
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		new replace();
	}
}
