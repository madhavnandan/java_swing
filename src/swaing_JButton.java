import javax.swing.*;

public class swaing_JButton {

    public swaing_JButton() {
        JFrame frame = new JFrame();
        frame.setTitle("DESKTOP App");
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(400,400);

        JButton button = new JButton("click me");
        button.setBounds(100,200,100,30);

        frame.add(button);


    }

    public static void main(String[] args) {

        swaing_JButton ns = new swaing_JButton();

    }
}
