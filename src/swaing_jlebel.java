import javax.swing.*;

public class swaing_jlebel {

    public swaing_jlebel() {
        JFrame jFrame = new JFrame();

        jFrame.setTitle("First DeskTop App");
        jFrame.setLayout(null);
        jFrame.setSize(400,400);
        jFrame.setVisible(true);

        JLabel label = new JLabel("This Is First Java DESKTOP APP");
        label.setBounds(40,40,300 , 30);

        jFrame.add(label);

    }

    public static void main(String[] args) {
        swaing_jlebel obj = new swaing_jlebel();
    }
}
