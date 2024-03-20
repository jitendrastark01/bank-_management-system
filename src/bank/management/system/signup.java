package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.util.Random;


public class signup extends JFrame implements ActionListener {
JRadioButton r1,r2,a1,a2;
  JDateChooser dateChooser;

    Random ran=new Random();//use to generate random form no
    long first4=(ran.nextLong() %9000L) +1000L;
    String first=" "+ Math.abs(first4);
    JTextField textname,textFName,textEmail,textMobile,textCity,textState;


    signup() {

        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25, 10, 100, 100);
        add(image);
        JLabel label1 = new JLabel("APPLICATION FORM NO." + first);
        label1.setBounds(160, 20, 600, 40);
        label1.setFont(new Font("Raleway", Font.BOLD, 38));
        add(label1);


        JLabel label3 = new JLabel("Personal Details");
        label3.setBounds(300, 90, 600, 30);
        label3.setFont(new Font("Arial", Font.BOLD, 22));
        add(label3);

        JLabel labelname = new JLabel("Name:");
        labelname.setBounds(100, 190, 100, 30);
        labelname.setFont(new Font("", Font.BOLD, 20));
        getContentPane().setBackground(new Color(222, 255, 228));
        add(labelname);

        textname = new JTextField();
        textname.setFont(new Font("Ralway", Font.BOLD, 14));
        textname.setBounds(300, 190, 250, 30);
        add(textname);


        JLabel labelFName = new JLabel("Father Name:");
        labelFName.setBounds(100, 250, 200, 32);
        labelFName.setFont(new Font("", Font.BOLD, 20));
        getContentPane().setBackground(new Color(222, 255, 228));
        add(labelFName);
        textFName = new JTextField();
        textFName.setFont(new Font("Ralway", Font.BOLD, 14));
        textFName.setBounds(300, 250, 250, 32);
        add(textFName);


        JLabel dob = new JLabel("DOB:");
        dob.setBounds(100, 300, 200, 32);
        dob.setFont(new Font("", Font.BOLD, 20));
        add(dob);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105, 105, 105));
        dateChooser.setBounds(300, 300, 400, 32);
        add(dateChooser);

        JLabel labelG = new JLabel("Gender:");
        labelG.setFont(new Font("Ralway", Font.BOLD, 20));
        labelG.setBounds(100, 350, 200, 30);
        add(labelG);
        r1 = new JRadioButton("Male");
        r1.setBackground(new Color(222, 255, 228));
        r1.setFont(new Font("railway", Font.BOLD, 14));
        r1.setBounds(300, 350, 60, 30);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setBackground(new Color(222, 255, 228));
        r2.setFont(new Font("Ralway", Font.BOLD, 14));
        r2.setBounds(450, 350, 90, 30);
        add(r2);

        ButtonGroup buttongroup = new ButtonGroup();
        buttongroup.add(r1);
        buttongroup.add(r2);



        JLabel labelEmail = new JLabel("Email address:");
        labelEmail.setFont(new Font("Ralway", Font.BOLD, 20));
        labelEmail.setBounds(100, 400, 250, 30);
        getContentPane().setBackground(new Color(222, 255, 228));
        add(labelEmail);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Ralway", Font.BOLD, 14));
        textEmail.setBounds(300, 400, 300, 30);
        add(textEmail);

        JLabel labelMobile = new JLabel("Mobile no:");
        labelMobile.setFont(new Font("Ralway", Font.BOLD, 20));
        labelMobile.setBounds(100, 450, 250, 30);
        getContentPane().setBackground(new Color(222, 255, 228));
        add(labelMobile);

        textMobile = new JTextField();
        textMobile.setFont(new Font("Ralway", Font.BOLD, 14));
        textMobile.setBounds(300, 450, 250, 30);
        add(textMobile);


        JLabel labelCity = new JLabel("City:");
        labelCity.setFont(new Font("Ralway", Font.BOLD, 20));
        labelCity.setBounds(100, 500, 250, 30);
        getContentPane().setBackground(new Color(222, 255, 228));
        add(labelCity);

        textCity = new JTextField();
        textCity.setFont(new Font("Ralway", Font.BOLD, 14));
        textCity.setBounds(300, 500, 250, 30);
        add(textCity);

        JLabel labelState = new JLabel("State:");
        labelState.setFont(new Font("Ralway", Font.BOLD, 20));
        labelState.setBounds(100, 550, 250, 30);
        getContentPane().setBackground(new Color(222, 255, 228));
        add(labelState);

        textState = new JTextField();
        textState.setFont(new Font("Ralway", Font.BOLD, 14));
        textState.setBounds(300, 550, 250, 30);
        add(textState);

        JLabel labelMs = new JLabel("Marital Status:");
        labelMs.setFont(new Font("Ralway", Font.BOLD, 20));
        labelMs.setBounds(100, 600, 200, 30);
        add(labelMs);


        a1 = new JRadioButton("Married");
        a1.setBackground(new Color(222, 255, 228));
        a1.setFont(new Font("railway", Font.BOLD, 14));
        a1.setBounds(300, 600, 90, 30);
        add(a1);

        a2 = new JRadioButton("Unmarried");
        a2.setBackground(new Color(222, 255, 228));
        a2.setFont(new Font("Ralway", Font.BOLD, 14));
        a2.setBounds(400, 600, 120, 30);
        add(a2);






        JButton next = new JButton(" Next");
        next.setFont(new Font("Ralway", Font.BOLD, 14));
        next.setBackground(Color.black);
        next.setBounds(600, 680, 80, 30);
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);


        getContentPane().setBackground(new Color(222, 255, 228));
        setLayout(null);
        setSize(850, 800);
        setLocation(360, 40);
        setVisible(true);
    }
@Override
        public void actionPerformed(ActionEvent e)
        {

            String form_no=first;
            String name=textname.getText();
            String Fname=textFName.getText();
            String dob=((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
            String gender=null;
            if(r1.isSelected()){
                gender="Male";

            }else if(r2.isSelected()){
                gender="Female";


            }

            String email=textEmail.getText();
            String martial=null;
            if(a1.isSelected())
            {
                martial="Married";

            }
            else if(a2.isSelected()){
                martial="Unmarried";
            }
            String city=textCity.getText() ;
            String mobile=textMobile.getText();
            String state= textState.getText();

            try{
                if(textname.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Fill all the Fields");
                }
                else{
                    Con con1=new Con();
                    String q = "INSERT INTO signup (form_no, name, Fname, dob, gender, email, martial, city, mobile, state) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                    PreparedStatement pst = con1.connection.prepareStatement(q);
                    pst.setString(1, form_no);
                    pst.setString(2, name);
                    pst.setString(3, Fname);
                    pst.setString(4, dob);
                    pst.setString(5, gender);
                    pst.setString(6, email);
                    pst.setString(7, martial);
                    pst.setString(8, city);
                    pst.setString(9, mobile);
                    pst.setString(10, state);
                    pst.executeUpdate();
                new signup2(form_no);
                setVisible(false);
                }
            }catch(Exception E){
                E.printStackTrace();
            }
        }



    public static void main(String[] args){

        new signup();
    }
}



