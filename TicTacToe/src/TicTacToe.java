import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class TicTacToe implements ActionListener {

    Random random = new Random();
    JFrame frame = new JFrame();
    JPanel title_panel = new JPanel();
    JPanel button_panel = new JPanel();
    JLabel textfield = new JLabel();
    JButton[] buttons = new JButton[9];
    boolean player1_turn; //true if p1 turn, false if p2 turn, so no need for p2 variable

    TicTacToe() {}

    @Override
    public void actionPerformed(ActionEvent e) {}

    public void firstTurn() {}

    public void check() {}

    public void xWins(int a, int b, int c) {}

    public void oWins(int a, int b, int c) {}

}
