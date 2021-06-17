// test19
// 事件处理

import java.awt.*;
import java.awt.event.*;

public class event{
    Frame frame;
    Label label;
    Button button;
    Checkbox checkbox;
    TextField tf;
    event(){
        frame = new Frame("GUI");
        label = new Label("label");
        button = new Button("button");
        checkbox = new Checkbox("subscribe");
        checkbox.setState(true);
        tf = new TextField("email");
        frame.setLayout(new FlowLayout());
        frame.add(label);
        frame.add(button);
        frame.add(checkbox);
        frame.add(tf);
        frame.setSize(300, 200);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                label.setBackground(Color.yellow);
            }
        });

        checkbox.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent e){
                if(checkbox.getState()){
                    tf.setEnabled(true);
                }
                else{
                    tf.setEnabled(false);
                }
            }
        });
    }
    public static void main(String[] args){
        new event();
    }
}