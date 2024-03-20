package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;

public class signup2 extends JFrame implements ActionListener {
    String form_no;
    JComboBox comboBox,comboBox2,comboBox3,comboBox4,comboBox5;
    JTextField textaadhar,textpan;
    JRadioButton r1,r2;
    signup2(String form_no){
super("APPLICATION FORM");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150, 5, 100, 100);
        add(image);

        this.form_no=form_no;


JLabel l1=new JLabel("Page 2");
l1.setFont(new Font("Ralway",Font.BOLD,22));
l1.setBounds(300,30,600,40);
add(l1);
JLabel l2=new JLabel("Addition Details");
l2.setFont(new Font("Ralway",Font.BOLD,22));
l2.setBounds(300,60,600,40);
add(l2);

JLabel l3=new JLabel("Religion:");
l3.setFont(new Font("Ralway",Font.BOLD,18));
l3.setBounds(100,120,100,30);
add(l3);
String religion[]={"Hindu","Muslim","Sikh","Christian","Other"};comboBox = new JComboBox(religion);
comboBox.setBackground(new Color(252,208,76 ));
comboBox.setFont(new Font("Ralway",Font.BOLD,14));
comboBox.setBounds(350,120,320,30);
add(comboBox);

        JLabel l4=new JLabel("Category:");
        l4.setFont(new Font("Ralway",Font.BOLD,18));
        l4.setBounds(100,180,100,30);
        add(l4);

        String categ[]={"General","OBC(non-creamy layer)","SC","ST","Other"};
         comboBox2= new JComboBox(categ);
        comboBox2.setBackground(new Color(252,208,76 ));
        comboBox2.setFont(new Font("Ralway",Font.BOLD,14));
        comboBox2.setBounds(350,180,320,30);
        add(comboBox2);

        JLabel l5=new JLabel(" Income:");
        l5.setFont(new Font("Ralway",Font.BOLD,18));
        l5.setBounds(100,240,100,30);
        add(l5);

        String income[]={"Null","<<5,00,000","<<8,50,000","10,00,000","Above 10,00,000"};
        comboBox3 = new JComboBox(income);
        comboBox3.setBackground(new Color(252,208,76 ));
        comboBox3.setFont(new Font("Ralway",Font.BOLD,14));
        comboBox3.setBounds(350,240,320,30);
        add(comboBox3);

        JLabel l6=new JLabel("Education:");
        l6.setFont(new Font("Ralway",Font.BOLD,18));
        l6.setBounds(100,300,100,30);
        add(l6);

        String edu[]={"Null","Graduation","Post-Graduate","Phd","other"};
        comboBox4 = new JComboBox(edu);
        comboBox4.setBackground(new Color(252,208,76 ));
        comboBox4.setFont(new Font("Ralway",Font.BOLD,14));
        comboBox4.setBounds(350,300,320,30);
        add(comboBox4);


            JLabel l7=new JLabel("Occupation:");
            l7.setFont(new Font("Ralway",Font.BOLD,18));
            l7.setBounds(100,360,120,30);
            add(l7);

            String occ[]={"Null","Student","Government","Corporate","Farmer","Other"};
             comboBox5 = new JComboBox(occ);
            comboBox5.setBackground(new Color(252,208,76 ));
            comboBox5.setFont(new Font("Ralway",Font.BOLD,14));
            comboBox5.setBounds(350,360,320,30);
            add(comboBox5);


            JLabel l8=new JLabel("Aadhar No:");
            l8.setFont(new Font("Ralway",Font.BOLD,18));
            l8.setBounds(100,420,320,30);
            add(l8);
            textaadhar = new JTextField();
            textaadhar.setFont(new Font("Ralway", Font.BOLD, 14));
            textaadhar.setBounds(350, 420, 320, 30);
            add(textaadhar);



            JLabel l9=new JLabel("PAN No:");
            l9.setFont(new Font("Ralway",Font.BOLD,18));
            l9.setBounds(100,480,320,30);
            add(l9);
            textpan = new JTextField();
            textpan.setFont(new Font("Ralway", Font.BOLD, 14));
            textpan.setBounds(350, 480, 320, 30);
            add(textpan);



            JLabel l10=new JLabel("Existing Account:");
            l10.setFont(new Font("Ralway",Font.BOLD,18));
            l10.setBounds(100,540,320,30);
            add(l10);
        r1 = new JRadioButton("YES");
        r1.setBackground(new Color(243, 212, 99));
        r1.setFont(new Font("railway", Font.BOLD, 14));
        r1.setBounds(350, 540, 60, 30);
        add(r1);

        r2 = new JRadioButton("NO");
        r2.setBackground(new Color(237, 205, 84));
        r2.setFont(new Font("Ralway", Font.BOLD, 14));
        r2.setBounds(450, 540, 90, 30);
        add(r2);
        ButtonGroup buttongroup = new ButtonGroup();
        buttongroup.add(r1);
        buttongroup.add(r2);


        JLabel l11=new JLabel("Form No:");
        l11.setFont(new Font("Ralway",Font.BOLD,16));
        l11.setBounds(700,10,90,30);
        add(l11);

        JLabel l12=new JLabel(form_no);
        l12.setFont(new Font("Ralway",Font.BOLD,16));
        l12.setBounds(780,10,120,30);
        add(l12);


        JButton next = new JButton(" Next");
        next.setFont(new Font("Ralway", Font.BOLD, 14));
        next.setBackground(Color.white);
        next.setBounds(600, 600, 100, 30);
        next.setForeground(Color.BLACK);
next.addActionListener(this);
        add(next);






        setLayout(null);

        setSize(850,750);
        setLocation(450,80);
        getContentPane().setBackground(new Color(0xE8BD51));

        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String religion=(String) comboBox.getSelectedItem();
        String category=(String) comboBox2.getSelectedItem();
        String income=(String) comboBox3.getSelectedItem();
        String education=(String) comboBox4.getSelectedItem();
        String occupation=(String) comboBox5.getSelectedItem();

String aadhar_no=textaadhar.getText();
String pan_no=textpan.getText();
String existing_account=null;
if (r1.isSelected()){
    existing_account="YES";

} else if (r2.isSelected()) {
    existing_account="NO";

}

try{
    if(textpan.getText().equals("")||textaadhar.getText().equals("")){
        JOptionPane.showMessageDialog(null,"Fill all the fields");
    }else {
        Con c1=new Con();
        String q = "INSERT INTO signuptwo (form_no, religion, category, income, education, occupation, aadhar_no, pan_no, existing_account) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement pst = c1.connection.prepareStatement(q);
        pst.setString(1, form_no);
        pst.setString(2, religion);
        pst.setString(3, category);
        pst.setString(4, income);
        pst.setString(5, education);
        pst.setString(6, occupation);
        pst.setString(7, aadhar_no);
        pst.setString(8, pan_no);
        pst.setString(9,existing_account);

        pst.executeUpdate();
        new signup3(form_no);
        setVisible(false);
    }

}catch (Exception E){
    E.printStackTrace();
}
    }

    public static void main(String[] args){

        String first;
        new signup2("");
    }

}
