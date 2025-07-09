import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class Calculator {

    int boarderWidth = 360;
    int boarderHeight = 540;

    JFrame frame = new JFrame("Calculator App");

    Calculator() {
        frame.setVisible(true);
        frame.setSize(boarderWidth, boarderHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
