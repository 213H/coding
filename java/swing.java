// test20
// swing
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class swing{
    JFrame frame;
    JLabel label;
    JButton button;
    JTextField tf;
    swing(){
        frame = new JFrame("GUI");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        label = new JLabel("hello");
        button = new JButton("clear");
        tf = new JTextField("null");
        frame.add(label);
        frame.add(button);
        frame.add(tf);
        frame.setVisible(true);
        frame.setLayout(new FlowLayout());
        frame.setSize(400, 400);
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                button.setText("cleared");
                //label.setBackground(Color.yellow);
                tf.setText("    ");
            }
        });
    }
    public static void main(String[] args){
        new swing();
    }
}