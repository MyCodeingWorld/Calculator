import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calci extends JFrame{
    Calci (){
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,300);
        setResizable(false);
        setTitle("Button");

        JButton button1 = new JButton("TIE");
        JButton button2 = new JButton("VTU");
        JLabel label1 = new JLabel();

        button1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                label1.setText("TIE");
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label1.setText("VTU");
            }
        });

        add(button1);
        add(button2);
        add(label1);
    }

    public static void main(String[] args) {
        Calci bt = new Calci();
    }
}
