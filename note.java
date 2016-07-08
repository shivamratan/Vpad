import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;
import java.text.*;
import java.util.Date;
public class note extends JFrame 
{
	static String radio="plain";
	JMenuBar menu;
	JTextArea area;
	JCheckBox chkbx1;
	JTabbedPane myTab;
	static int i=2;
	String sr="C:\\users\\user1\\desktop\\temp.txt";
	//String opencontent;
	static JTextArea txtarea1,txtarea2,txtarea3;
	JButton b1_new,b1_open,b1_save;
	JComboBox box1,box2,box3;
	JCheckBox chk_beep,chk_dance;
	JRadioButton rb_bold,rb_italic,rb_plain;
	ButtonGroup bg;
	public note()throws Exception
	{
		
		super("Vpad");
		setLayout(null);
		Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
		int sw=(int )(d.getWidth());
		int sh=(int )(d.getHeight());
		setLocation((sw-1024)/2,0);
		BufferedImage img=ImageIO.read(getClass().getResourceAsStream("sample.png"));
		setIconImage(img);
       b1_new=new JButton("N");
        b1_new.setBounds(10,3,45,25);
        add(b1_new);
         b1_new.addActionListener(new ActionListener()
		      	{
		      		public void actionPerformed(ActionEvent e)
		      		{
		      			i++;
		      			 txtarea3=new JTextArea("");
		      			 txtarea3.setBounds(10,40,993,650);
		      			// txtarea.setEditable(true);
		      			 Font f3=new Font("Tahoma",Font.PLAIN,15);
		      			 txtarea3.setFont(f3);
		      			 //add(txtarea);
		      			// txtarea.setLineWrap(true);
		      			 //txtarea.setWrapStyleWord(true);
		      			 JScrollPane scroll =new JScrollPane(txtarea3,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		      			 scroll.setBounds(1000,51,20,610);
		      			 add(scroll);
		      			 add(txtarea3);
		      			 String s="tab"+i;
		      			 myTab.add(s,txtarea3);
		      		}
		      	});
        b1_open=new JButton("O");
        b1_open.setBounds(60,3,45,25);
        add(b1_open);
        b1_open.addActionListener(new ActionListener()
		          {
		          	public void actionPerformed(ActionEvent e100)
		          	{
		          		try
		          		{
		          		open o=new open();
		          		setVisible(false);
		          		//parentJFrame.disable();		   
		          		String temp=o.getstring1();  
		          		//parentJFrame.disable();
		          		//System.out.println(temp);
		          		txtarea1.setText(temp);
		          	    }
		          	    catch(Exception e230)
		          	    {
		          	    	JOptionPane.showMessageDialog(null,"Interrupted Exception occured");
		          	    }
		          	}
		          });

        b1_save=new JButton("S");
        b1_save.setBounds(110,3,45,25);
        add(b1_save);
         b1_save.addActionListener(new ActionListener()
		        		  {
		        	  public void actionPerformed(ActionEvent e5)
		        	  {
		        	  	try
		        	  	{
		        		  save s=new save();
		        		  
		        		 String content=txtarea1.getText();
		        		  s.getstring(content);
		        		   sr=s.path;
		        		   setTitle(sr);
		        		}
		        		catch(Exception e4)
		        		{
		        			JOptionPane.showMessageDialog(null,"exception occured");
		        		}
		        		  
		        	  }
		        		  });
       

       chk_beep=new JCheckBox("Beep",false);
            chk_beep.setBounds(200,3,60,25);
            add(chk_beep);
        chk_dance=new JCheckBox("Dance",false);
            chk_dance.setBounds(265,3,65,25);
            add(chk_dance);
	

       box1=new JComboBox();
        box1.setBounds(360,3,200,25);
          box1.setEditable(true);
         	box1.addItem("Microsoft Sans Serif");
         	box1.addItem("Monotype Corsiva");
         	box1.addItem("Arial");
         	box1.addItem("Gill Sans");
         	box1.addItem("Perpetua Titling MT");
         	box1.addItem("Segoe Script");
         	box1.addItem("Zorque");
         	box1.addItem("Brush Script Std");
        add(box1); 

         box1.addActionListener(new ActionListener()
             {
                public void actionPerformed(ActionEvent e) 
                {
                	String result=txtarea1.getText();
                  String s_type=box1.getSelectedItem().toString();
                  int size=Integer.parseInt(box2.getSelectedItem().toString());
                  Font font1=new Font(s_type,Font.PLAIN,size);
                
                  txtarea1.setFont(font1);
                  txtarea1.setText(result);

                }
              });


        rb_bold=new JRadioButton("Bold");
          rb_bold.setBounds(570,3,50,25);
          //rb_bold.setActionCommand("Bold");

        rb_italic=new JRadioButton("Italics");
          rb_italic.setBounds(623,3,60,25);
          //rb_italic.setActionCommand("Italics");
        rb_plain=new JRadioButton("Plain");
          rb_plain.setBounds(686,3,60,25);
          //rb_plain.setActionCommand("Plain");


          ActionListener sliceActionListener = new ActionListener() {
      public void actionPerformed(ActionEvent actionEvent) {
    		
    		String fonttype=box1.getSelectedItem().toString();
    		int fontsize=Integer.parseInt(box2.getSelectedItem().toString());
    		Font f1=new Font(fonttype,Font.PLAIN,fontsize);
    		String result=txtarea1.getText();
    		AbstractButton aButton = (AbstractButton) actionEvent.getSource();
    		radio=aButton.getText();
    		if(radio=="Bold")
              f1=new Font(fonttype,Font.BOLD,fontsize);
            else if(radio=="Italics")
              f1=new Font(fonttype,Font.ITALIC,fontsize);
             txtarea1.setFont(f1);
             txtarea1.setText(result);
    		}


    	};
          bg=new ButtonGroup();
          bg.add(rb_bold);
          bg.add(rb_italic);
          bg.add(rb_plain);
         add(rb_bold);
         add(rb_italic);
         add(rb_plain); 
         rb_italic.setSelected(true);
               rb_italic.addActionListener(sliceActionListener);
               rb_plain.addActionListener(sliceActionListener);
               rb_bold.addActionListener(sliceActionListener);

           box2=new JComboBox();
              box2.setBounds(756,3,60,25);	
         box2.setEditable(true);
            box2.addItem("14");
            box2.addItem("15");
            box2.addItem("16");
            box2.addItem("17");
            box2.addItem("18");
            box2.addItem("19");
            box2.addItem("20");
            box2.addItem("21");
            box2.addItem("22");
            box2.addItem("23");
            box2.addItem("24");
            box2.addItem("48");
            box2.addItem("78");
            box2.addItem("96");
        add(box2);
          box2.addActionListener(new ActionListener()
          {
          	public void actionPerformed(ActionEvent e9856)
          	{
          		String temp=txtarea1.getText();
          		String fonttype=box1.getSelectedItem().toString();
          		int fontsize=Integer.parseInt(box2.getSelectedItem().toString());
          		Font f1=new Font(fonttype,Font.PLAIN,fontsize);
          		  if(radio=="Bold")
          		  	f1=new Font(fonttype,Font.BOLD,fontsize);
          		  else if(radio=="Italics")
          		  	f1=new Font(fonttype,Font.ITALIC,fontsize);
          		  
          		  	
          		  txtarea1.setFont(f1);
          		  txtarea1.setText(temp);

          	}

          });
        box3=new JComboBox();
           box3.setBounds(831,3,100,25);
             box3.setEditable(true);
             box3.addItem("Black");
           box3.addItem("white");
           box3.addItem("Green");
           box3.addItem("yellow");
           box3.addItem("red");
           box3.addItem("blue");
           box3.addItem("orange");
           box3.addItem("random colour");
          add(box3);
          box3.addActionListener(new ActionListener()
          {
          	public void actionPerformed(ActionEvent s)
          	{
          		String temp=txtarea1.getText();
          		String s_color=box3.getSelectedItem().toString();
                    if(s_color=="Black")
                      txtarea1.setForeground(Color.black);
                    else if(s_color=="white")
                      txtarea1.setForeground(Color.white);             
                    else if(s_color=="Green")
                      txtarea1.setForeground(Color.green);
                    else if(s_color=="yellow")
                      txtarea1.setForeground(Color.yellow);
                    else if(s_color=="red")
                      txtarea1.setForeground(Color.red);
                    else if(s_color=="blue")
                     txtarea1.setForeground(Color.blue);
                    else if(s_color=="orange")
                      txtarea1.setForeground(Color.orange);
                    else if(s_color=="random colour")
                    {
                        int r=(int )(255*Math.random());
                        int g=(int )(255*Math.random());
                        int b=(int )(255*Math.random());
                              Color c1=new Color(r,g,b);
                      txtarea1.setForeground(c1);
                    }
                    txtarea1.setText(temp);
          	}
          });

 	
	//	txtarea1.addKeyListener(new mylistener());
		menu=new JMenuBar();
	
		 JMenu m_file=new JMenu("File");
		        JMenuItem m1=new JMenuItem("   New       ");
		        
		          m_file.add(m1);
		          m1.addActionListener(new ActionListener()
		      	{
		      		public void actionPerformed(ActionEvent e)
		      		{
		      			i++;
		      			 txtarea3=new JTextArea("");
		      			 txtarea3.setBounds(10,40,993,650);
		      			// txtarea.setEditable(true);
		      			 Font f3=new Font("Tahoma",Font.PLAIN,15);
		      			 txtarea3.setFont(f3);
		      			 //add(txtarea);
		      			// txtarea.setLineWrap(true);
		      			 //txtarea.setWrapStyleWord(true);
		      			 JScrollPane scroll =new JScrollPane(txtarea3,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		      			 scroll.setBounds(1000,51,20,610);
		      			 add(scroll);
		      			 add(txtarea3);
		      			 String s="tab"+i;
		      			 myTab.add(s,txtarea3);
		      		}
		      	});
		          
		          
		          
		          
		        JMenuItem m2=new JMenuItem("   Open       ");
		          m_file.add(m2);
		          m2.addActionListener(new ActionListener()
		          {
		          	public void actionPerformed(ActionEvent e100)
		          	{
		          		try
		          		{
		          		open o=new open();
		          		setVisible(false);
		          		//parentJFrame.disable();		   
		          		String temp=o.getstring1();  
		          		//parentJFrame.disable();
		          		//System.out.println(temp);
		          		txtarea1.setText(temp);
		          	    }
		          	    catch(Exception e230)
		          	    {
		          	    	JOptionPane.showMessageDialog(null,"Interrupted Exception occured");
		          	    }
		          	}
		          });
		        JMenuItem m3=new JMenuItem("   Open Recent");
		          m_file.add(m3);
		        JMenuItem m4=new JMenuItem("   Save   ");
		          m_file.add(m4);
		          m4.addActionListener(new ActionListener()
		          {
		          	public void actionPerformed(ActionEvent e64)
		          	{
		          		sr=save.path;
		          		try
		          		{
		          		if(sr==null)
		          		{
		          			JOptionPane.showMessageDialog(null,"Please \"save as\" before saving");
		          		}
		          		else
		          		{
		          			FileOutputStream fout=new FileOutputStream(sr);  
     						String content1=txtarea1.getText();  
     							byte b[]=content1.getBytes();//converting string into byte array  
   						  fout.write(b);  
     						fout.close();

		          		}
		             	}
		             	catch(Exception e53)
		             	{
		             		JOptionPane.showMessageDialog(null,"Exception occured");
		             	}

		          	}
		          });
		        JMenuItem m5=new JMenuItem("   Save as...   ");
		          m_file.add(m5);
		          m5.addActionListener(new ActionListener()
		        		  {
		        	  public void actionPerformed(ActionEvent e5)
		        	  {
		        	  	try
		        	  	{
		        		  save s=new save();
		        		  
		        		 String content=txtarea1.getText();
		        		  s.getstring(content);
		        		   sr=s.path;
		        		   setTitle(sr);
		        		}
		        		catch(Exception e4)
		        		{
		        			JOptionPane.showMessageDialog(null,"exception occured");
		        		}
		        		  
		        	  }
		        		  });
		        JMenuItem m6=new JMenuItem("   Exit   ");

		          m_file.add(m6);
		          m6.addActionListener(new ActionListener()
		          {
		          	public void actionPerformed(ActionEvent e45)
		          	{
		          		System.out.println("Halting the programme... exit code:0");
		          		System.exit(0);
		          	}
		          });
		     menu.add(m_file);







		 JMenu m_edit=new JMenu("Edit");
		        JMenu m7=new JMenu("   Find      ");
		           JMenuItem m7_next=new JMenuItem("   Find Next ");
		              m7_next.addActionListener(new ActionListener()
		              {
		              	public void actionPerformed(ActionEvent e21)
		              	{
		              		new find();
		              	}
		              });

		           JMenuItem m7_previous=new JMenuItem("   Find previous");
		             m7_previous.addActionListener(new ActionListener()
		              {
		              	public void actionPerformed(ActionEvent e21)
		              	{
		              		new find();
		              	}
		              });
		           JMenuItem m7_all=new JMenuItem("    Find All");
		             m7_all.addActionListener(new ActionListener()
		              {
		              	public void actionPerformed(ActionEvent e21)
		              	{
		              		new find();
		              	}
		              });
		          m7.add(m7_previous);
		          m7.add(m7_next);
		          m7.add(m7_all);
		            m_edit.add(m7);
		        JMenu m8=new JMenu("  Replace   ");
		           JMenuItem m8_next=new JMenuItem("   Replace Next ");
		            m8_next.addActionListener(new ActionListener()
		            {
		            	public void actionPerformed(ActionEvent e345)
		            	{
		            		new replace();
		            	}
		            });
		           JMenuItem m8_previous=new JMenuItem("   Replace previous");
		             m8_previous.addActionListener(new ActionListener()
		            {
		            	public void actionPerformed(ActionEvent e346)
		            	{
		            		new replace();
		            	}
		            });
		           JMenuItem m8_all=new JMenuItem("  Replace All");
		             m8_all.addActionListener(new ActionListener()
		            {
		            	public void actionPerformed(ActionEvent e347)
		            	{
		            		new replace();
		            	}
		            });
		          m8.add(m8_next);
		          m8.add(m8_previous);
		          m8.add(m8_all);
		            m_edit.add(m8);
		         JMenuItem m9=new JMenuItem("   Time/Date     ");
		           m_edit.add(m9);
		           m9.addActionListener(new ActionListener()
		           {
		           	public void actionPerformed(ActionEvent e34560)
		           	{
		           		String temp=txtarea1.getText();

		           		DateFormat df=new SimpleDateFormat("DD/MM/yyyy HH:mm:SS");
		           		Date date=new Date();
		           		temp+="\n"+(df.format(date));
		           		txtarea1.setText(temp);

		           	}

		           });

		        menu.add(m_edit);
		       
		 JMenu m_format=new JMenu("Format");
		          chkbx1= new JCheckBox(" Word Wrap");
		           m_format.add(chkbx1);
		      
		          m_format.addSeparator();
		          JMenuItem m10=new JMenuItem("   Font...  ");

		            m_format.add(m10);
		            m10.addActionListener(new ActionListener()
		            {
		            	public void actionPerformed(ActionEvent e99)
		            	{
		                   try
		                   {
		            		textformatter txtformat=new textformatter();
		            		txtformat.content=txtarea1.getText();
		            		setVisible(false);
		            	   }
		            	   catch(Exception e234598)
		            	   {
		            	   	JOptionPane.showMessageDialog(null,"unreported exception occured");
		            	   }

		            		
		            	}
		            });
		         menu.add(m_format);
		 JMenu m_view=new JMenu("View");
		    JMenuItem m11=new JMenuItem("Random Colour");
		     m_view.add(m11);
		     m11.addActionListener(new ActionListener()
		     {
		     	public void actionPerformed(ActionEvent e1234)
		     	{
		     	int r=(int )(255*Math.random());
		     	int g=(int )(255*Math.random());
		     	int b=(int )(255*Math.random());
		     	 Color c1=new Color(r,g,b);
		     	 txtarea1.setForeground(c1);
		     	 txtarea2.setForeground(c1);
		     	}
		     });
		    menu.add(m_view);
		 JMenu m_help=new JMenu("Help");
		    JMenuItem m12=new JMenuItem(" view Help");
		     m_help.add(m12);
		     m_help.addSeparator();
		    JMenuItem m13=new JMenuItem(" Register ");
		     m_help.add(m13);
		     m_help.addSeparator();
		    JMenuItem m14=new JMenuItem("About Notepad");
		     m_help.add(m14);
		   menu.add(m_help);
		 setJMenuBar(menu);
		  myTab=new JTabbedPane();
		 myTab.setBounds(10,30,993,630);
		 add(myTab);
		 txtarea1=new JTextArea("");
		 txtarea1.setBounds(10,40,993,630);
		// txtarea.setEditable(true);
		 Font f1=new Font("Tahoma",Font.PLAIN,17);
		 txtarea1.setFont(f1);
		 //add(txtarea);
		// txtarea.setLineWrap(true);
		 //txtarea.setWrapStyleWord(true);
		 JScrollPane scroll =new JScrollPane(txtarea1,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		 scroll.setBounds(1000,51,20,610);
		 add(scroll);
		 add(txtarea1);
		 myTab.add("tab1",txtarea1);
		 txtarea2=new JTextArea("");
		 txtarea2.setBounds(10,50,993,640);
		// txtarea.setEditable(true);
		 Font f2=new Font("Tahoma",Font.PLAIN,17);
		 txtarea2.setFont(f2);
		 //add(txtarea);
		// txtarea.setLineWrap(true);
		 //txtarea.setWrapStyleWord(true);
		 JScrollPane scroll1 =new JScrollPane(txtarea2,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		 scroll.setBounds(1000,51,20,610);
		 add(scroll1);
		 add(txtarea2);
		 myTab.add("tab2",txtarea2);
		 setResizable(false);
		 
		 
		 
		
		 
		 
		 
		
		 
		 setSize(1024,725);
		// setResizable(false);
		
		 setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			txtarea1.addKeyListener(new mylistener());
			txtarea1.addKeyListener(new mylistener1());
			//ButtonGroup.addActionListener(this);
		//setLocationRelativeTo(null);
		 
		//p1.add(arg0, arg1);
	}
		public class mylistener extends KeyAdapter
    {
    	public void keyPressed(KeyEvent e)
    	{
    		//char ch;
    		//ch=e.getKeyChar();
    		if(chk_dance.isSelected())
    		{
    		int r=(int )(255*Math.random());
	     	int g=(int )(255*Math.random());
	     	int b=(int )(255*Math.random());
	     	 Color c1=new Color(r,g,b);
	     	 txtarea1.setForeground(c1);
	     	 txtarea2.setForeground(c1);
	     	} 
	     	 
    	}
    }
    public class mylistener1 extends KeyAdapter
    {
    	public void keyPressed(KeyEvent e8)
    	{
    		if(chk_beep.isSelected())
    		{
    		Toolkit t=Toolkit.getDefaultToolkit();
    		t.beep();
    	    }
    	}
    }
    
    
	
	public static void main(String args[])throws Exception
	{
		new note();
			//txtarea1.addKeyListener(new mylistener());
	}
	
}
            // Code designed and developed by Shivam Ratan 