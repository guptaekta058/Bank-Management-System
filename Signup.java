package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup  extends JFrame implements ActionListener {

    JTextField textName, textFname, textEmail, textms, textadd, textcity, textpin, textstate;
    JRadioButton R1, R2, M1, M2, M3;
    JButton next;


    JDateChooser dateChooser;
    Random ran = new Random();

    long first4 = (ran.nextLong() % 9000L) + 1000L;
    String first = " " + Math.abs(first4);


    Signup() {
        super("APPLICATION FORM");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(10, 0, 100, 100);
        setLayout(null);
        add(image);

        JLabel label1 = new JLabel("APPLICATION FORM NO." + first);
        label1.setBounds(160, 20, 600, 40);
        label1.setFont(new Font("Raleway", Font.BOLD, 38));
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setFont(new Font("Raleway", Font.BOLD, 22));
        label2.setBounds(330, 70, 600, 30);
        add(label2);

        JLabel label3 = new JLabel("Personal Details");
        label3.setFont(new Font("Raleway", Font.BOLD, 22));
        label3.setBounds(290, 95, 600, 22);
        add(label3);

        JLabel labelName = new JLabel("Name:");
        labelName.setFont(new Font("Raleway", Font.BOLD, 20));
        labelName.setBounds(100, 184, 100, 30);
        add(labelName);

        textName = new JTextField();
        textName.setFont(new Font("Raleway", Font.BOLD, 14));
        textName.setBounds(300, 190, 400, 30);
        add(textName);

        JLabel labelFname = new JLabel("Father's Name:");
        labelFname.setFont(new Font("Raleway", Font.BOLD, 20));
        labelFname.setBounds(100, 240, 200, 30);
        add(labelFname);

        textFname = new JTextField();
        textFname.setFont(new Font("Raleway", Font.BOLD, 14));
        textFname.setBounds(300, 240, 400, 30);
        add(textFname);

        JLabel DOB = new JLabel("Date Of Birth:");
        DOB.setFont(new Font("Raleway", Font.BOLD, 20));
        DOB.setBounds(100, 340, 200, 30);
        add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105, 105, 105));
        dateChooser.setBounds(300, 340, 400, 30);
        add(dateChooser);

        JLabel labelG = new JLabel("Gender:");
        labelG.setFont(new Font("Raleway", Font.BOLD, 20));
        labelG.setBounds(100, 290, 200, 30);
        add(labelG);

        R1 = new JRadioButton("Male");
        R1.setFont(new Font("Raleway", Font.BOLD, 14));
        R1.setBackground(new Color(222, 255, 228));
        R1.setBounds(300, 290, 68, 30);
        add(R1);

        R2 = new JRadioButton("Female");
        R2.setFont(new Font("Raleway", Font.BOLD, 14));
        R2.setBackground(new Color(222, 255, 228));
        R2.setBounds(450, 290, 90, 30);
        add(R2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(R1);
        buttonGroup.add(R2);

        JLabel labelemail = new JLabel("Email address:");
        labelemail.setFont(new Font("Raleway", Font.BOLD, 20));
        labelemail.setBounds(100, 390, 200, 30);
        add(labelemail);


        textEmail = new JTextField();
        textEmail.setFont(new Font("Raleway", Font.BOLD, 14));
        textEmail.setBounds(300, 390, 400, 30);
        add(textEmail);


        JLabel labelms = new JLabel("Married Status:");
        labelms.setFont(new Font("Raleway", Font.BOLD, 20));
        labelms.setBounds(100, 440, 200, 30);
        add(labelms);


        M1 = new JRadioButton("Married");
        M1.setBounds(300, 440, 100, 30);
        M1.setBackground(new Color(222, 255, 228));
        M1.setFont(new Font("Raleway", Font.BOLD, 14));
        add(M1);

        M2 = new JRadioButton("Unmarried");
        M2.setBounds(450, 440, 100, 30);
        M2.setBackground(new Color(222, 255, 228));
        M2.setFont(new Font("Raleway", Font.BOLD, 14));
        add(M2);

        M3 = new JRadioButton("Other");
        M3.setBounds(630, 440, 100, 30);
        M3.setFont(new Font("Raleway", Font.BOLD, 14));
        M3.setBackground(new Color(222, 255, 228));
        add(M3);

        ButtonGroup buttonGroup1 = new ButtonGroup();

        buttonGroup1.add(M1);
        buttonGroup1.add(M2);
        buttonGroup1.add(M3);


        JLabel labeladd = new JLabel("Address:");
        labeladd.setFont(new Font("Raleway", Font.BOLD, 20));
        labeladd.setBounds(100, 490, 200, 30);
        add(labeladd);


        textadd = new JTextField();
        textadd.setFont(new Font("Raleway", Font.BOLD, 14));
        textadd.setBounds(300, 490, 400, 30);
        add(textadd);

        JLabel labelcity = new JLabel("City:");
        labelcity.setFont(new Font("Raleway", Font.BOLD, 20));
        labelcity.setBounds(100, 540, 200, 30);
        add(labelcity);


        textcity = new JTextField();
        textcity.setFont(new Font("Raleway", Font.BOLD, 14));
        textcity.setBounds(300, 540, 400, 30);
        add(textcity);

        JLabel labelpin = new JLabel("Pincode:");
        labelpin.setFont(new Font("Raleway", Font.BOLD, 20));
        labelpin.setBounds(100, 590, 200, 30);
        add(labelpin);


        textpin = new JTextField();
        textpin.setFont(new Font("Raleway", Font.BOLD, 14));
        textpin.setBounds(300, 590, 400, 30);
        add(textpin);


        JLabel labelstate = new JLabel("State:");
        labelstate.setFont(new Font("Raleway", Font.BOLD, 20));
        labelstate.setBounds(100, 640, 200, 30);
        add(labelstate);


        textstate = new JTextField();
        textstate.setFont(new Font("Raleway", Font.BOLD, 14));
        textstate.setBounds(300, 640, 400, 30);
        add(textstate);

        next = new JButton("Next");
        next.setFont(new Font("Arial", Font.BOLD, 14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(300,650 , 80, 30);
        next.addActionListener(this);
        add(next);


        getContentPane().setBackground(new Color(222, 255, 228));
        setLayout(null);
        setSize(850, 800);
        setLocation(360, 40);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formno = first;
        String name = textName.getText();
        String fname = textFname.getText();
        Object  dateChooser=null;
        String dob = ((JTextField)this.dateChooser.getDateEditor().getUiComponent()).getText();
        String gender=null;
        if(R1.isSelected())
        {
            gender="Male";

        }
        else if(R2.isSelected())
        {
            gender="Female";
        }
       String email=textEmail.getText();
        String marital=null;
        if(M1.isSelected())
        {
            marital="Married";
        }
        else if(M2.isSelected())
        {
            marital="Unmarried";
        }
        else {
            marital="other";
        }
        String address= textadd.getText();
        String city=textcity.getText();
        String pincode=textpin.getText();
        String state=textstate.getText();
        try{
            if(textName.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null,"Fill all the field");
            }
            else {
                con con1=new con();
                String q="Insert into signup values('"+formno+"','"+name+"','"+fname+"','"+ dob+"','"+gender+"','"+ email+"','"+marital+"','"+address+"','"+city+"','"+pincode+"','"+state+"' )";
                 con1.statement.executeUpdate(q);
                 new signup2(first);
                 setVisible(false);
            }


        }
        catch(Exception E)
        {
            E.printStackTrace();
        }

    }


    public static void main(String args[]) {
        new Signup();
    }
}

