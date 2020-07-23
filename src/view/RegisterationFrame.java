package view;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Myform extends JFrame{
	
	JLabel label1,label2,label3,label4,label5,label6,label7;
	JTextField t1,t2,t3,t4,t5,t6;
	JRadioButton Male,Female;
	JButton submit;
	JLabel msg;
	Myform(){
		setTitle("Registration Form");
		setSize(700,500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(null);
		
		
		label1=new JLabel("First Name:");
		label1.setBounds(20,50,100,20);
		c.add(label1);
		t1=new JTextField();
		t1.setBounds(130,50,100,20);
		c.add(t1);
		
		
		label2=new JLabel("Last Name:");
		label2.setBounds(20,100,100,20);
		c.add(label2);
		t2=new JTextField();
		t2.setBounds(130,100,100,20);
		c.add(t2);
		
		
		label7=new JLabel("Gender");
		label7.setBounds(20,150,100,20);
		c.add(label7);
		Male=new JRadioButton("Male");
		Female=new JRadioButton("Female");
		Male.setBounds(130,150,80,20);
		Female.setBounds(220,150,80,20);
		c.add(Male);
		c.add(Female);
		
		
		label3=new JLabel("Email Id:");
		label3.setBounds(20,200,100,20);
		c.add(label3);
		t3=new JTextField();
		t3.setBounds(130,200,100,20);
		c.add(t3);
		
		
		label4=new JLabel("User ID:");
		label4.setBounds(20,250,100,20);
		c.add(label4);
		t4=new JTextField();
		t4.setBounds(130,250,100,20);
		c.add(t4);
		
		
		label5=new JLabel("Password:");
		label5.setBounds(20,300,100,20);
		c.add(label5);
		t5=new JTextField();
		t5.setBounds(130,300,100,20);
		c.add(t5);
		
		
		label6=new JLabel("Mobile no.:");
		label6.setBounds(20,350,100,20);
		c.add(label6);
		t6=new JTextField();
		t6.setBounds(130,350,100,20);
		c.add(t6);
		
		submit=new JButton("Submit");
		submit.setBounds(150,400,80,20);
		c.add(submit);
		
		
		
		setVisible(true);
	}
}
public class RegisterationFrame {

	public static void main(String args[]) {
		new Myform();

	}

}
