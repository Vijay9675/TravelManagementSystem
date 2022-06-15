import javax.swing.*;
import java.awt.*;

public class AddCustomer extends JFrame {

    JLabel labelusername;
    JComboBox comboid;
    JTextField tfnumber;
    JRadioButton rmale, rfemale;



    AddCustomer() {
        setBounds(450, 200, 850, 550);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(30, 50, 150, 25);
        add(lblusername);

        JLabel labelusername = new JLabel();
        labelusername.setBounds(220, 50, 150, 25);
        add(labelusername);

        JLabel lblid = new JLabel("ID");
        lblid.setBounds(30, 90, 150, 25);
        add(lblid);

        comboid = new JComboBox(new String[] {"Passport", "Aadhar Card", "Pan Card", "Ration Card"});
        comboid.setBounds(220, 90, 150, 25);
        comboid.setBackground(Color.WHITE);
        add(comboid);

        JLabel lblnumber = new JLabel("Number");
        lblnumber.setBounds(30, 130, 150, 25);
        add(lblnumber);

        tfnumber = new JTextField();
        tfnumber.setBounds(220, 130, 150, 25);
        add(tfnumber);


        JLabel lblname = new JLabel("Name");
        lblname.setBounds(30, 170, 150, 25);
        add(lblname);

        JLabel labelname = new JLabel();
        labelname.setBounds(220, 170, 150, 25);
        add(labelname);

        JLabel lblgemder = new JLabel("Gender");
        lblgemder.setBounds(30, 210, 150, 25);
        add(lblgemder);

        rmale = new JRadioButton("Male");
        rmale.setBounds(220, 210, 70, 25);
        rmale.setBackground(Color.WHITE);
        add(rmale);

        rfemale = new JRadioButton("Female");
        rfemale.setBounds(300, 210, 70, 25);
        rfemale.setBackground(Color.WHITE);
        add(rfemale);

        ButtonGroup bg = new ButtonGroup();
        bg.add(rmale);
        bg.add(rfemale);

        JLabel lblcountry = new JLabel("Country");
        lblcountry.setBounds(30, 250, 150, 25);
        add(lblcountry);

        JTextField tfcountry = new JTextField();
        tfcountry.setBounds(220, 250, 150, 25);
        add(tfcountry);

        JLabel lbladdress = new JLabel("Address");
        lbladdress.setBounds(30, 290, 150, 25);
        add(lbladdress);

        JTextField tfaddress = new JTextField();
        tfaddress.setBounds(220, 290, 150, 25);
        add(tfaddress);

        JLabel lblphone = new JLabel("Phone");
        lblphone.setBounds(30, 330, 150, 25);
        add(lblphone);

        JTextField tfphone = new JTextField();
        tfphone.setBounds(220, 330, 150, 25);
        add(tfphone);

        JLabel lblemail = new JLabel("Email");
        lblemail.setBounds(30, 370, 150, 25);
        add(lblemail);

        JTextField tfemail = new JTextField();
        tfemail.setBounds(220, 370, 150, 25);
        add(tfemail);

        JButton ba = new JButton("Add");
        ba.setBounds(70, 420, 100, 25);
        ba.setBackground(Color.black);
        ba.setForeground(Color.white);
        add(ba);


        JButton bb = new JButton("Back");
        bb.setBounds(240, 420, 100, 25);
        bb.setBackground(Color.black);
        bb.setForeground(Color.white);
        add(bb);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/newcustomer.jpg"));
        Image i2 = i1.getImage().getScaledInstance(400, 500, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(400, 40, 450, 420);
        add(image);

        setVisible(true);

    }


    public static void main(String[] args) {
        new AddCustomer();
    }
}
