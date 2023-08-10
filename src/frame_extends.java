import javax.swing.*;
import java.awt.*;

public class frame_extends extends JFrame {

    public frame_extends(){
        setLayout(null);
        setVisible(true);
        setSize(400,400);
        setTitle("JFRAME");
    }

    public static void main(String[] args) {

        frame_extends newframe = new frame_extends();
        frame_extends ns = new frame_extends();
        ns.setTitle("Another Intances");

    }
}
