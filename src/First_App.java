import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class First_App {

    public First_App() {
        JFrame frame = new JFrame();
        JLabel label = new JLabel("Enter Your Name");
        JButton button = new JButton("SET NAME");
        JLabel name = new JLabel("Your Name Is : ");
        JLabel name1 = new JLabel("..........");
        JTextField entername = new JTextField();

        frame.setTitle("First DeskTop Application");
        frame.setSize(400,300);
        frame.setVisible(true);
        frame.setLayout(null);

        label.setBounds(40,40,200,30);
        entername.setBounds(165,40,200,30);
        button.setBounds(145,90,100,30);
        name.setBounds(40 , 150 , 200 , 30);
        name1.setBounds(165,150 , 200 , 30 );

        frame.add(label);
        frame.add(entername);
        frame.add(button);
        frame.add(name);
        frame.add(name1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String yourname = entername.getText();
                name1.setText(yourname);
            }
        });
    }

    public static void main(String[] args) {

        First_App ns = new First_App();

    }
}
