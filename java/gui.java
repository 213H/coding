// test17
// awt控件
import java.awt.*;
import java.awt.event.*;

public class gui{
    Frame frame;
    Label label;
    Button button;
    Checkbox checkbox;
    gui(){
        frame = new Frame("GUI");
        label = new Label("label");
        button = new Button("button");
        checkbox = new Checkbox("checkbox");
        frame.setLayout(new BorderLayout());
        frame.add(label, BorderLayout.LINE_END);
        frame.add(button, BorderLayout.CENTER);
        frame.add(checkbox, BorderLayout.PAGE_END);
        frame.setSize(300, 200);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
       

        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                button.setLabel("clicked");
                label.setBackground(Color.yellow);
            }
        });
    }
    public static void main(String[] args){
        new gui();
    }
}