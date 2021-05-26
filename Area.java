

package home.servant.finder;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Area extends JFrame 
        
{
    JPanel jpanel=new JPanel();
    JLabel label1,label2;
    JButton btn1,btn2,btn3,btn4,btn5,btn6;
    Component comp=SwingUtilities.getRoot(this);
    public static final Color Color1=new Color(245, 210, 247);
    public static final Color Color2=new Color(242, 10, 107);
       public static final Color Color3=new Color(9, 19, 84);
 Area()
{
   super("Area");   
   setVisible(true);
   setBounds(500,100,550,800);
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   this.setResizable(false);
   jpanel.setLayout(null);
   
   jpanel.setBackground(Color1);
   add(jpanel);
   
   
   label1=new JLabel("Find Your Location");
   label1.setFont(new Font("Arial",Font.ITALIC,40));
   label1.setForeground(Color.black);
   label1.setBounds(120,15,500,200);
   jpanel.add(label1);
   
    label2=new   JLabel("@MobasshiraKhan");
    label2.setFont(new Font("Arial",Font.ITALIC,15));
    label2.setForeground (Color.BLACK);
    label2.setBounds(170,670,300,70);
    jpanel.add(label2);
   
    btn2=new JButton("Zeropoint");
    btn2.setFont(new Font("Time New Roman",Font.PLAIN,14));
    btn2.setBackground(Color3);
    btn2.setForeground(Color.white);   
    btn2.setBounds(190,200,100,40);
    jpanel.add(btn2);


    btn3=new JButton("Sadhurmore");
    btn3.setFont(new Font("Time New Roman",Font.PLAIN,14));
    btn3.setBackground(Color3);
    btn3.setForeground(Color.white);   
    btn3.setBounds(170,270,150,40);
    jpanel.add(btn3);
    
    btn4=new JButton("Alupotty");
    btn4.setFont(new Font("Time New Roman",Font.PLAIN,14));
    btn4.setBackground(Color3);
    btn4.setForeground(Color.white);   
    btn4.setBounds(190,340,100,40);
    jpanel.add(btn4);

    btn5=new JButton("Vodra");
    btn5.setFont(new Font("Time New Roman",Font.PLAIN,14));
    btn5.setBackground(Color3);
    btn5.setForeground(Color.white);   
    btn5.setBounds(190,410,100,40);
    jpanel.add(btn5);
    
    btn1=new JButton("Laxmipur");
    btn1.setFont(new Font("Time New Roman",Font.PLAIN,14));
    btn1.setBackground(Color3);
    btn1.setForeground(Color.white);   
    btn1.setBounds(190,485,100,40);
    jpanel.add(btn1);
    
    btn6=new JButton("Back");
    btn6.setFont(new Font("Time New Roman",Font.PLAIN,14));
    btn6.setBackground(Color.blue);
    btn6.setForeground(Color.white);   
    btn6.setBounds(200,550,70,25);
    
    jpanel.add(btn6);
    
    HandlerClass handler=new HandlerClass();
  
     btn1.addActionListener(handler);
     btn2.addActionListener(handler);
     btn3.addActionListener(handler);
     btn4.addActionListener(handler);
     btn5.addActionListener(handler);
     btn6.addActionListener(handler);
    
}

  
 
public class HandlerClass implements ActionListener
{
    @Override
    public void actionPerformed(ActionEvent event)
    {
        if(event.getSource()==btn1)
        {
          ((Window)comp).dispose();
          Category s=new Category(5);
          s.setVisible(true);
        }
        else if(event.getSource()==btn2)
    {
      {
          ((Window)comp).dispose();
         Category s=new Category(1);
          s.setVisible(true);
        }
    }
        
            else if(event.getSource()==btn3)
    {
      {
          ((Window)comp).dispose();
          Category s=new Category(2);
          s.setVisible(true);
        }
    }
        
        
        else if(event.getSource()==btn4)
    {
      {
          ((Window)comp).dispose();
          Category s=new Category(3);
          s.setVisible(true);
        }
        
    }
        
            else if(event.getSource()==btn5)
    {
      {
          ((Window)comp).dispose();
         Category s=new Category(4);
          s.setVisible(true);
        }
    }
        
          else if(event.getSource()==btn6)
    {
      {
          ((Window)comp).dispose();
         Entry s=new Entry();
          s.setVisible(true);
        }
    }
        
    }
    
}
}