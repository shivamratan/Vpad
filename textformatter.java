import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class textformatter extends JFrame 
{
	JLabel l;
	JComboBox ch1;
	JComboBox ch2;
	JComboBox ch3;
	JComboBox ch4;
  static String content="";
  String type="Arial";
  int size=16;
	JLabel lbl_col,lbl_type,lbl_style,lbl_size;
	JLabel result;
  JButton btn_ok,btn_cancel;
	String s="The quick brown fox jumps over the lazy dog";
	public textformatter()throws Exception
	{
		super("Text Formatter");
		setLayout(null);
		setResizable(false);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		l=new JLabel("Text Formatter");
		l.setBounds(0,10,550,20);
    int r=(int )(255*Math.random());
    int g=(int )(255*Math.random());
    int b=(int )(255*Math.random());
    Color c=new Color(r,g,b);
    l.setForeground(c);
		Font f=new Font("Tahoma",Font.BOLD,20);
		l.setFont(f);
		l.setHorizontalAlignment(JLabel.CENTER);
		
		lbl_type= new JLabel("FONT TYPE: ");
		  lbl_type.setBounds(10,70,200,20);
          add(lbl_type);
          //ch1.setBackground(Color.white);
         ch1=new JComboBox();
         ch1.setBounds(10,90,200,30);
          ch1.setEditable(true);
         	ch1.addItem("Microsoft Sans Serif");
         	ch1.addItem("Monotype Corsiva");
         	ch1.addItem("Arial");
         	ch1.addItem("Gill Sans");
         	ch1.addItem("Perpetua Titling MT");
         	ch1.addItem("Segoe Script");
         	ch1.addItem("Zorque");
         	ch1.addItem("Brush Script Std");
        add(ch1); 
             ch1.addActionListener(new ActionListener()
             {
                public void actionPerformed(ActionEvent e) 
                {
                  String s_type=ch1.getSelectedItem().toString();
                  Font font1=new Font(s_type,Font.ITALIC,size);
                  type=s_type;
                  result.setFont(font1);

                }
              });

        lbl_size= new JLabel("FONT SIZE: ");
		  lbl_size.setBounds(220,70,70,20);
          add(lbl_size);	
         ch2=new JComboBox();
         ch2.setBounds(220,90,70,30);	
         ch2.setEditable(true);
            ch2.addItem("14");
            ch2.addItem("15");
            ch2.addItem("16");
            ch2.addItem("17");
            ch2.addItem("18");
            ch2.addItem("19");
            ch2.addItem("20");
            ch2.addItem("21");
            ch2.addItem("22");
            ch2.addItem("23");
            ch2.addItem("24");
        add(ch2); 

             ch2.addActionListener(new ActionListener()
             {
                public void actionPerformed(ActionEvent e) 
                {
                 // try
                  //{
                  int s_size=size;
                  String z=(ch2.getSelectedItem()).toString();
                    s_size=Integer.parseInt(z);
                  Font font1=new Font(type,Font.ITALIC,s_size);
                  size=s_size;
                  result.setFont(font1);
                 // }
                 /* catch(Exception e7)
                  {
                    JOptionPane.showMessageDialog(null,"Please enter the valid number");
                  }  */

                }
              });

        lbl_style= new JLabel("FONT STYLE: ");
		  lbl_style.setBounds(300,70,100,20);
          add(lbl_style);   
         
         ch3=new JComboBox();
           ch3.setBounds(300,90,100,30);
           ch3.setEditable(true);
           ch3.addItem("Bold");
           ch3.addItem("Italics");
         add(ch3);
            ch3.addActionListener(new ActionListener()
             {
                public void actionPerformed(ActionEvent e) 
                {
                    Font font1=new Font(type,Font.ITALIC,size);
                  String s_style=ch3.getSelectedItem().toString();
                  if(s_style=="Italics")
                   font1=new Font(type,Font.ITALIC,size);
                  else if(s_style=="Bold")
                   font1=new Font(type,Font.BOLD,size);
                  result.setFont(font1);


                }
              });


        lbl_col= new JLabel("FONT COLOR: ");
		  lbl_col.setBounds(410,70,100,20);
          add(lbl_col);

         ch4=new JComboBox();
           ch4.setBounds(410,90,120,30);
           ch4.setEditable(true);
           ch4.addItem("Black");
           ch4.addItem("White");
           ch4.addItem("Green");
           ch4.addItem("yellow");
           ch4.addItem("red");
           ch4.addItem("blue");
           ch4.addItem("orange");
           ch4.addItem("random colour");
          add(ch4);
         ch4.addActionListener(new ActionListener()
             {
                public void actionPerformed(ActionEvent e) 
                {
                  String s_type=ch1.getSelectedItem().toString();
                  Font font1=new Font(s_type,Font.ITALIC,size);
                  result.setFont(font1);
                  String s_color=ch4.getSelectedItem().toString();
                    if(s_color=="Black")
                      result.setForeground(Color.black);
                    else if(s_color=="White")
                      result.setForeground(Color.white);             
                    else if(s_color=="Green")
                      result.setForeground(Color.green);
                    else if(s_color=="yellow")
                      result.setForeground(Color.yellow);
                    else if(s_color=="red")
                      result.setForeground(Color.red);
                    else if(s_color=="blue")
                      result.setForeground(Color.blue);
                    else if(s_color=="orange")
                      result.setForeground(Color.orange);
                    else if(s_color=="random colour")
                    {
                        int r=(int )(255*Math.random());
                        int g=(int )(255*Math.random());
                        int b=(int )(255*Math.random());
                              Color c1=new Color(r,g,b);
                      result.setForeground(c1);
                    }
                      

                }
              });
          

         result =new JLabel("The quick brown fox jumps over the lazy dog");
         result.setBounds(0,240,500,40);
         result.setHorizontalAlignment(JButton.CENTER);
         Font f1=new Font("Arial",Font.ITALIC,16);
         result.setForeground(Color.black);
         result.setFont(f1);
         add(result);
          add(l);


          btn_ok=new JButton("Ok");
          btn_ok.setBounds(350,310,90,30);
          btn_ok.addActionListener(new mylistener1());
          //btn_ok.insets=new insets(0,10,10,0);
          add(btn_ok);
             

          
          btn_cancel=new JButton("cancel");
          btn_cancel.setBounds(450,310,90,30);
          btn_cancel.addActionListener(new mylistener2());
          //btn_cancel.insets=new insets(0,10,10,0);
          add(btn_cancel);
          
           

         setSize(550,380);
         setVisible(true);


	}
   class mylistener1 implements ActionListener
              {
                public void actionPerformed(ActionEvent e3)
                {
                  try
                  {
                  note n=new note();
                  Font font11=new Font(type,Font.ITALIC,size);
                  String fnt_type=ch1.getSelectedItem().toString();
                    int fnt_size=Integer.parseInt(ch2.getSelectedItem().toString());
                    String fnt_style=ch3.getSelectedItem().toString();
                    String s_color=ch4.getSelectedItem().toString();
                    if(fnt_style=="Bold")
                        font11=new Font(fnt_type,Font.BOLD,fnt_size);
                      else
                        font11=new Font(fnt_style,Font.ITALIC,fnt_size);
                      n.txtarea1.setFont(font11);
                      n.txtarea2.setFont(font11);
                     if(s_color=="Black")
                     {
                      n.txtarea1.setForeground(Color.black);
                      n.txtarea2.setForeground(Color.black);
                            }
                    else if(s_color=="White")
                       {
                      n.txtarea1.setForeground(Color.white);
                      n.txtarea2.setForeground(Color.white);
                            }            
                    else if(s_color=="Green")
                       {
                      n.txtarea1.setForeground(Color.green);
                      n.txtarea2.setForeground(Color.green);
                            }
                    else if(s_color=="yellow")
                      {
                      n.txtarea1.setForeground(Color.yellow);
                      n.txtarea2.setForeground(Color.yellow);
                            }
                    else if(s_color=="red")
                       {
                      n.txtarea1.setForeground(Color.red);
                      n.txtarea2.setForeground(Color.red);
                            }
                    else if(s_color=="blue")
                      {
                      n.txtarea1.setForeground(Color.blue);
                      n.txtarea2.setForeground(Color.blue);
                            }
                    else if(s_color=="orange")
                      {
                      n.txtarea1.setForeground(Color.orange);
                      n.txtarea2.setForeground(Color.orange);
                            }
                    else if(s_color=="random colour")
                    {
                        int r=(int )(255*Math.random());
                        int g=(int )(255*Math.random());
                        int b=(int )(255*Math.random());
                              Color c1=new Color(r,g,b);
                      n.txtarea1.setForeground(c1);
                      n.txtarea2.setForeground(c1);
                    }
                   n.txtarea1.setText(content);

                  setVisible(false);
                }
                catch(Exception e2345678)
                {
                  JOptionPane.showMessageDialog(null,"Exception occured");
                }
                }
              }
  class mylistener2 implements ActionListener
              {
                public void actionPerformed(ActionEvent e4)
                {
                  setVisible(false);
                }
              }    

	public static void main(String[] args)throws Exception
   {
		new textformatter();
	}
  /*public void getstring(String temp)
  {
      content=temp;
  }*/

}
