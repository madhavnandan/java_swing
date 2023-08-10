import javax.swing.*;

public class frame_using_constructor {

    public frame_using_constructor() {
        JFrame jFrame = new JFrame();

        jFrame.setTitle("First DeskTop App");
        jFrame.setLayout(null);
        jFrame.setSize(400,400);
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        frame_using_constructor obj = new frame_using_constructor();
    }
}
