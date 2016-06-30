/**
 * Created by phujcn on 30/06/2016 example file.
 */

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Application extends JFrame implements  ActionListener{
    private static JFrame frame;
    private static JPanel panel;
    private static GridBagLayout grid;
    private static JButton bNewPannel,bExit;
    public Application (){
        frame = new JFrame("Application");
        panel = new JPanel();
        grid = new GridBagLayout();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(panel);
        panel.setLayout(grid);

        bNewPannel = new JButton();
        bNewPannel.setText("New Panel");
        bNewPannel.addActionListener(this);

        bExit = new JButton();
        bExit.setText("Exit");
        bExit.addActionListener(this);

        panel.add(bNewPannel);
        panel.add(bExit);

        frame.pack();
    }
    public static void main (String[] args){
        Application app = new Application();
        //frame.setSize(800,400);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent actionEvent) {
         if (actionEvent.getSource()== bExit){
             System.exit(0);
         }
        else if (actionEvent.getSource() == bNewPannel){
             Child child = new Child();
             child.setSize(200,200);
             child.setVisible(true);
        }
    }
}
