package electricity;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class About extends JFrame implements ActionListener {
    JButton b1;
    JLabel l1;
    Font f,f1,f2;
    TextArea t1;
    String s;
   public About() {
       setLayout(null);
       JButton b1=new JButton();
       add(b1);
       b1.setBounds(180,430,120,20);
       b1.addActionListener(this);

       Font f= new Font("Railway",Font.BOLD,180);
       setFont(f);

       String s = "About Project\n"
               + "An Electricity Management System (EMS) is a digital solution used to monitor, control, and optimize the generation, distribution, and consumption of electricity.\n"
               + "EMS aims to enhance energy efficiency, reduce operational costs, and ensure a stable and reliable power supply.\n"
               + "EMS enables the integration of solar, wind, and other renewable energy sources into the power grid.\n"
               + "It works with smart grids to automate power distribution and enhance resilience.\n\n";
       TextArea t1=new TextArea(s,10,40,Scrollbar.VERTICAL);
       t1.setEditable(false);
       t1.setBounds(20,100,450,300);
       add(t1);

       Font f1= new Font("Railway",Font.BOLD,16);
       setFont(f1);

       Container contentPane=this.getContentPane();
       t1= new TextArea();

       JLabel l1= new JLabel("new project");
       add(l1);
       l1.setBounds(170,10,180,80);
       l1.setForeground(Color.red);

       Font f2=new Font("Railway",Font.BOLD,20);
       l1.setFont(f2);

       setBounds(700,220,500,550);

       setLayout(null);
       setVisible(true);
   }
       @Override
       public void actionPerformed (ActionEvent e){
          dispose();
       }

    public static void main(String[] args) {
       new About().setVisible(true);
    }
}
