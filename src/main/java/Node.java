import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Node extends JButton implements ActionListener {

    Node parent;
    int col;
    int row;
    int gCost;
    int hCost;
    int fCost;
    boolean start;
    boolean goal;
    boolean solid;
    boolean open;
    boolean checked;

    public Node (int col, int row) {

        this.col = col;
        this.row = row;

        setBackground(Color.black);
        setForeground(Color.white);
        addActionListener(this);
    }

    public void setAsStart () {
        setBackground(Color.green);
        setForeground(Color.black);
        setText("Start");
        start = true;
    }

    public void setAsGoal () {
        setBackground(Color.yellow);
        setForeground(Color.black);
        setText("Goal");
        goal = true;
    }

    public void setAsSolid () {
        setBackground(new Color(120,220,180));
        setForeground(Color.gray);
        solid = true;
    }

    @Override
    public void actionPerformed (ActionEvent e) {

        setBackground(Color.orange);
    }
}
