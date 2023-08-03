import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    public class Calculator implements ActionListener {

        JFrame frame;
        JTextField textfield;
        Font myfont;
        JButton[] numberBut = new JButton[10];
        JButton[] functionBut = new JButton[8];
        JButton addButton, subButton, mulButton, divButton;
        JButton decButton, equButton, delButton, clearButton;
        JPanel panel;


        double num1=0,num2=0,result=0;
        char operator;

        Calculator(){

            frame = new JFrame("Calculator");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(420, 550);
            frame.setLayout(null);


            textfield = new JTextField();
            textfield.setBounds(50, 25, 300, 50);
            myfont = new Font("Ink free", Font.BOLD, 30);
            textfield.setFont(myfont);
            textfield.setEditable(false);

            addButton = new JButton("+");
            subButton = new JButton("-");
            mulButton = new JButton("x");
            divButton = new JButton("%");
            decButton = new JButton(".");
            equButton = new JButton("=");
            delButton = new JButton("Delete");
            clearButton = new JButton("Clear");

            functionBut[0] = addButton;
            functionBut[1] = subButton;
            functionBut[2] = mulButton;
            functionBut[3] = divButton;
            functionBut[4] = decButton;
            functionBut[5] = equButton;
            functionBut[6] = delButton;
            functionBut[7] = clearButton;

            for(int i=0;i<0;i++) {
                functionBut[i].addActionListener(this);
                functionBut[i].setFont(myfont);
                functionBut[i].setFocusable(false);
            }

            for(int i=0;i<10;i++){
                numberBut[i] = new JButton(String.valueOf(i));
                numberBut[i].addActionListener(this);
                numberBut[i].setFont(myfont);
                numberBut[i].setFocusable(false);
            }

            delButton.setBounds(50, 430, 145, 50);
            clearButton.setBounds(205, 430, 145, 50);

            panel = new JPanel();
            panel.setBounds(50, 100, 300, 300);
            panel.setLayout(new GridLayout(4, 4, 8, 8));
            //panel.setBackground(Color.black);

            panel.add(numberBut[1]);
            panel.add(numberBut[2]);
            panel.add(numberBut[3]);
            panel.add(addButton);
            panel.add(numberBut[4]);
            panel.add(numberBut[5]);
            panel.add(numberBut[6]);
            panel.add(subButton);
            panel.add(numberBut[7]);
            panel.add(numberBut[8]);
            panel.add(numberBut[9]);
            panel.add(mulButton);
            panel.add(decButton);
            panel.add(numberBut[0]);
            panel.add(equButton);
            panel.add(divButton);

            frame.add(panel);
            frame.add(delButton);
            frame.add(clearButton);
            frame.add(textfield);
            frame.setVisible(true);

        }

        public static void main(String[] args) {

            Calculator calc = new Calculator();
        }

        @Override
        public void actionPerformed(ActionEvent e) {

            for(int i=0 ; i<10 ; i++){
                if(e.getSource() == numberBut[i]) {
                    textfield.setText(textfield.getText().concat(String.valueOf(i)));
                }
            }
            if(e.getSource()==decButton) {
                textfield.setText(textfield.getText().concat("."));
            }
            if(e.getSource()==) {
                num1 = Double.parseDouble(textfield.getText());
            }



        }
    }

