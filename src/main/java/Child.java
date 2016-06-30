import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by phujcn on 30/06/2016.
 */
public class Child extends JFrame implements ActionListener{
    private static JPanel panel;
    private static JButton bExit;

    public void actionPerformed(ActionEvent actionEvent){
        if (actionEvent.getSource()==bExit){
            System.exit(0);
        }
    }

    public Child(){
        panel = new JPanel();
        this.setTitle("Child");

        this.getContentPane().add(panel);

        bExit = new JButton();
        bExit.setText("Exit");
        bExit.addActionListener(this);

        panel.add(bExit);

        this.pack();
    }
}
