
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.*;

public class open {
	private  String filecontent="Empty file";

	private JFrame frame;
	private JTextField txt_dir;
	private JTextField txt_fname;
	static String path;
	static String data="";

	
	 public open()
	 {
		frame = new JFrame();
		frame.setBounds(100, 100, 431, 274);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblEnterTheDirectory = new JLabel("Enter the directory ::");
		lblEnterTheDirectory.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblEnterTheDirectory.setBounds(10, 10, 254, 37);
		frame.getContentPane().add(lblEnterTheDirectory);
		
		txt_dir = new JTextField();
		txt_dir.setBounds(10, 47, 358, 20);
		frame.getContentPane().add(txt_dir);
		txt_dir.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("File name :");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(10, 78, 74, 37);
		frame.getContentPane().add(lblNewLabel);
		
		txt_fname = new JTextField();
		txt_fname.setBounds(94, 87, 274, 20);
		frame.getContentPane().add(txt_fname);
		txt_fname.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("File type:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(10, 108, 74, 50);
		frame.getContentPane().add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		
		comboBox.setBounds(94, 124, 274, 20);
		comboBox.setEditable(true);
		comboBox.addItem(".txt");
		comboBox.addItem(".java");
		comboBox.addItem(".c");
		comboBox.addItem(".cpp");
		comboBox.addItem(".js");
		comboBox.addItem(".html");
		comboBox.addItem(".css");
		comboBox.addItem(".jquery");
		comboBox.addItem(".php");
		comboBox.addItem(".pl");
		comboBox.addItem(".py");
		comboBox.addItem(".sql");
		comboBox.addItem(".xml");
		comboBox.addItem(".hxml");
		comboBox.addItem("other");
		
		
		
		frame.getContentPane().add(comboBox);
		
		JButton btnopen = new JButton("Open");
		btnopen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				

                     
                     String s1=txt_dir.getText();
                     String s2=txt_fname.getText();
                     String s3=comboBox.getSelectedItem().toString();

                     if(s3=="other")
                       path=s1+"\\"+s2;
                     else
                       path=s1+"\\"+s2+s3;
                   File f1=new File(path);
                     FileInputStream fis=null;
                     try
                     {
                     	fis=new FileInputStream(f1);
                     	int content;
                     	while((content=fis.read())!=-1)
                     	{
                     		data+=(char)content;         
                     	}
                     	note n1=new note();
                     	n1.txtarea1.setText(data);
                     	//System.out.println(content1);
                     	//note.txtarea1.setText(content1);
                     	frame.setVisible(false);

                     }
                     catch(Exception e234)
                     {
                     	JOptionPane.showMessageDialog(null,"IOException occurred");
                     }



						
				
			}
		});
		btnopen.setBounds(191, 181, 97, 30);
		frame.getContentPane().add(btnopen);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
			}
		});
		btnCancel.setBounds(298, 181, 97, 30);
		frame.getContentPane().add(btnCancel);
		frame.setSize(433,276);
		frame.setVisible(true);
		frame.setResizable(false);
	}
	public String getstring1()
	{
		return data;

	}
	public static void main(String args[])
	{
		new open();
	}
	
}
