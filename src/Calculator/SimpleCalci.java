package Calculator;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalci extends JFrame{
    private JPanel MainPanel;
    private JFormattedTextField ResultField;
    private JPanel ResultPane;
    private JButton Button9;
    private JButton ButtonC;
    private JButton ButtonB1;
    private JButton ButtonB2;
    private JButton ButtonE;
    private JButton Button8;
    private JButton Button7;
    private JButton Button6;
    private JButton Button5;
    private JButton Button4;
    private JButton Button3;
    private JButton Button2;
    private JButton Button1;
    private JButton Button0;
    private JButton ButtonDot;
    private JButton ButtonAdd;
    private JButton ButtonSub;
    private JButton ButtonMul;
    private JButton ButtonDiv;
    private JButton ButtonRevert;

    SimpleCalci() {
        setSize(400,400);
        setVisible(true);
        setTitle("Calculator");
        setContentPane(MainPanel);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon logo = new ImageIcon("src/Calci_Logo.png");
        setIconImage(logo.getImage());
        Button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ResultField.setText(ResultField.getText()+"9");
            }
        });
        ButtonB1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ResultField.setText(ResultField.getText()+"(");
            }
        });
        ButtonB2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ResultField.setText(ResultField.getText()+")");
            }
        });
        ButtonC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ResultField.setText("");
            }
        });
        Button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ResultField.setText(ResultField.getText()+"8");
            }
        });
        Button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ResultField.setText(ResultField.getText()+"7");
            }
        });
        ButtonAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ResultField.setText(ResultField.getText()+"+");
            }
        });
        Button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ResultField.setText(ResultField.getText()+"6");
            }
        });
        Button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ResultField.setText(ResultField.getText()+"5");
            }
        });
        Button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ResultField.setText(ResultField.getText()+"4");
            }
        });
        ButtonSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ResultField.setText(ResultField.getText()+"-");
            }
        });
        Button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ResultField.setText(ResultField.getText()+"3");
            }
        });
        Button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ResultField.setText(ResultField.getText()+"2");
            }
        });
        Button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ResultField.setText(ResultField.getText()+"1");
            }
        });
        ButtonMul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ResultField.setText(ResultField.getText()+"*");
            }
        });
        Button0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ResultField.setText(ResultField.getText()+"0");
            }
        });
        ButtonDot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ResultField.setText(ResultField.getText()+".");
            }
        });
        ButtonDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { ResultField.setText(ResultField.getText()+"/"); }
        });
        ButtonE.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    setTitle("Calculator");
                    Expression exp = new ExpressionBuilder(ResultField.getText()).build();
                    ResultField.setText(""+(exp.evaluate()));
                } catch (ArithmeticException e1) {
                    ResultField.setText("O Error");
                    setTitle("Error");
                }


            }
        });
        ButtonRevert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ResultField.setText(ResultField.getText()+"^");
            }
        });
    }

    public static void main(String[] args) {
        SimpleCalci Calculate = new SimpleCalci();
    }
}
