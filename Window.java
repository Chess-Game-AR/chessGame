import javax.swing.*;
import java.awt.*;

public class Window extends JFrame{
    private final int WIDTH = (int)Toolkit.getDefaultToolkit().getScreenSize().getWidth();
    private final int HEIGHT = (int)Toolkit.getDefaultToolkit().getScreenSize().getHeight();

    public Window(){
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
    public static void main(String[]args){
        Window a = new Window();
    }
}
