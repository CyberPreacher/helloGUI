/**
 * Created by phujcn on 30/06/2016.
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
    public Application (){
        frame = new JFrame("Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main (String[] args){
        Application app = new Application();
        frame.setSize(800,400);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        //
    }
}
