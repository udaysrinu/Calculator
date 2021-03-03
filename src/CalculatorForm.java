import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatorForm extends JFrame implements ActionListener,MouseListener {
    double value1,value2,result;
    char op;
    JLabel label;
    JButton button1,button2,button3,button4,button5,button6,button7,button8,
    button9,button0,buttonDot,buttonEq,buttonA,buttonS,buttonD,buttonM,buttonBS,
    buttonCL;
    JPanel panel;
    CalculatorForm(){
            super("MyCalculator");
            this.setSize(450,450);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            panel=new JPanel();
            panel.setLayout(null);
            label= new JLabel("");
            label.setOpaque(true);
            label.setBackground(Color.white);
            label.setBounds(100,20,400,25);
            panel.add(label);
            //label.setBackground(Color.red);
            panel.setBackground(Color.lightGray);

            buttonCL= new JButton("Clear");
            buttonCL.setBounds(220,60,110,30);
            buttonCL.addActionListener(this);
            buttonCL.addMouseListener(this);
            panel.add(buttonCL);
        buttonBS = new JButton("BackSpace");

        buttonBS.setBounds(100,60,110,30);
        buttonBS.addActionListener(this);
        buttonBS.addMouseListener(this);
        panel.add(buttonBS);

        button7 = new JButton("7");
        //button1.setID(1);
        button7.setBounds(100,100,50,50);
        button7.addActionListener(this);
        button7.addMouseListener(this);
        panel.add(button7);

        button8 = new JButton("8");
        button8.setBounds(160,100,50,50);
        button8.addActionListener(this);
        button8.addMouseListener(this);
        panel.add(button8);

        button9 = new JButton("9");
        button9.setBounds(220,100,50,50);
        button9.addActionListener(this);
        button9.addMouseListener(this);
        panel.add(button9);

        buttonM = new JButton("*");
        buttonM.setBounds(280,100,50,50);
        buttonM.addActionListener(this);
        buttonM.addMouseListener(this);
        panel.add(buttonM);
        /* 4 5 6 / */
        button4 = new JButton("4");
        button4.setBounds(100,160,50,50);
        button4.addActionListener(this);
        button4.addMouseListener(this);
        panel.add(button4);

        button5 = new JButton("5");
        button5.setBounds(160,160,50,50);
        button5.addActionListener(this);
        button5.addMouseListener(this);
        panel.add(button5);


        button6 = new JButton("6");
        button6.setBounds(220,160,50,50);
        button6.addActionListener(this);
        button6.addMouseListener(this);
        panel.add(button6);

        buttonD = new JButton("/");
        buttonD.setBounds(280,160,50,50);
        buttonD.addActionListener(this);
        buttonD.addMouseListener(this);
        panel.add(buttonD);

        /* 1 2 3 - */
        button1 = new JButton("1");
        button1.setBounds(100,220,50,50);
        button1.addActionListener(this);
        button1.addMouseListener(this);
        panel.add(button1);


        button2 = new JButton("2");
        button2.setBounds(160,220,50,50);
        button2.addActionListener(this);
        button2.addMouseListener(this);
        panel.add(button2);

        button3 = new JButton("3");
        button3.setBounds(220,220,50,50);
        button3.addActionListener(this);
        button3.addMouseListener(this);
        panel.add(button3);

        buttonS = new JButton("-");
        buttonS.setBounds(280,220,50,50);
        buttonS.addActionListener(this);
        buttonS.addMouseListener(this);
        panel.add(buttonS);
        /* 0 . = + */
        button0 = new JButton("0");
        button0.setBounds(100,280,50,50);
        button0.addActionListener(this);
        button0.addMouseListener(this);
        panel.add(button0);

        buttonDot = new JButton(".");
        buttonDot.setBounds(160,280,50,50);
        buttonDot.addActionListener(this);
        buttonDot.addMouseListener(this);
        panel.add(buttonDot);

        buttonEq = new JButton("=");
        buttonEq.setBounds(220,280,50,50);
        buttonEq.addActionListener(this);
        buttonEq.addMouseListener(this);
        panel.add(buttonEq);

        buttonA = new JButton("+");
        buttonA.setBounds(280,280,50,50);
        buttonA.addActionListener(this);
        buttonA.addMouseListener(this);
        panel.add(buttonA);

        this.add(panel);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String str=e.getActionCommand();
        if(str.equals("1"))
            label.setText(label.getText()+"1");
        else if(str.equals("2"))
        {
            label.setText(label.getText()+button2.getText());
        }
        else if(str.equals("3"))
        {
            label.setText(label.getText()+button3.getText());
        }
        else if(str.equals("4"))
        {
            label.setText(label.getText()+button4.getText());
        }
        else if(str.equals("5"))
        {
            label.setText(label.getText()+button5.getText());
        }
        else if(str.equals("6"))
        {
            label.setText(label.getText()+button6.getText());
        }else if(str.equals("7"))
        {
            label.setText(label.getText()+button7.getText());
        }
        else if(str.equals("8"))
        {
            label.setText(label.getText()+button8.getText());
        }
        else if(str.equals("9"))
        {
            label.setText(label.getText()+button9.getText());
        }
        else if(str.equals("0"))
        {
            label.setText(label.getText()+button0.getText());
        }else if(str.equals("."))
        {
            label.setText(label.getText()+buttonDot.getText());
        }else if(str.equals("="))
        {
            //Calculator Es = new Calculator(label.getText());
            //result = Es.Result();
            String ans = Double.toString(result);
            label.setText(ans);

        }
        else if(str.equals("+"))
        {
            label.setText(label.getText()+buttonA.getText());
        }else if(str.equals("-"))
        {
            label.setText(label.getText()+buttonS.getText());
        }else if(str.equals("*"))
        {
            label.setText(label.getText()+buttonM.getText());
        }else if(str.equals("/"))
        {
            label.setText(label.getText()+buttonD.getText());
        }else if(str.equals("BackSpace"))
        {
            String temp = label.getText();
            int len = temp.length();
            temp = temp.substring(0, len-1);
            label.setText(temp);
        }else if(str.equals("Clear"))
        {

            label.setText("");
        }
        else{}
    }

    @Override
    public void mouseClicked(MouseEvent e) {}
    @Override
    public void mousePressed(MouseEvent e) {}
    @Override
    public void mouseReleased(MouseEvent e) {}
    @Override
    public void mouseEntered(MouseEvent e) {

    }
    @Override
    public void mouseExited(MouseEvent e) {}
}
