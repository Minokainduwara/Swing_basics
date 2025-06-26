import ui.MainUI;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createGUI();
            }
        });
    }

    private static void createGUI() {
        MainUI ui = new MainUI();
        JPanel root = ui.getRootPanel();

        JFrame frame = new JFrame("Anime Database Browser");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(root);

        // Set preferred size and pack for proper layout
        frame.setPreferredSize(new Dimension(800, 600));

        // Center the window on screen
        frame.setLocationRelativeTo(null);

        // Make the window visible
        frame.pack();
        frame.setVisible(true);
    }
}