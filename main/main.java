import javax.swing.*;
import java.awt.*;

public class main {
    public static void main(String[] args) {
        System.out.println("obligatory hello world message");

        JFrame jFrame = new JFrame("test window wow");
        jFrame.setSize(640,360);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setFocusable(true);

        JLabel sampleText = new JLabel("yooo text??");
        sampleText.setForeground(Color.BLUE);
        sampleText.setFont(new Font("Arial", Font.BOLD, 30));

        JPanel jPanel = new JPanel();
        jPanel.add(sampleText);
        jFrame.add(jPanel);
        jFrame.setVisible(true);
    }
}
