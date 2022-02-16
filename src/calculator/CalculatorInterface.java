package calculator;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
import java.awt.*;

public class CalculatorInterface extends JFrame {
    private JPanel panel_bot , panel_top, panelMain;
    private JTextArea textArea;
    private JButton button;
    private String listBtnNumber[] ={
            "Ans","C", "Del", "+",
            "7", "8", "9","/",
            "4", "5", "6", "*",
            "1", "2", "3","-",
            "Neg", "0", ".", "="} ;

    public CalculatorInterface(){
        setSize(new Dimension(400,550));
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(panelMain());
    }
    //khởi tạo textArea - vùng hiển thị
    public JPanel panelCalculator(){
        panel_top = new JPanel(new GridLayout(1,1));
        textArea = new JTextArea(10,5);
        textArea.setBackground(Color.CYAN);
        textArea.setForeground(Color.BLACK);
        panel_top.add(textArea);
        panel_top.setBorder(new MatteBorder(2,2,3,2, Color.red));
        return panel_top;
    }
    // khởi tạo button
    public JButton buttonNumber(String listNumber){
        button  = new JButton(listNumber);
        button.setBackground(Color.pink);
        button.setForeground(Color.WHITE);
        button.setSize(20,20);
        button.setFont(new java.awt.Font("Arial", Font.BOLD, 20));
        button.setBorder(new BevelBorder(BevelBorder.RAISED));
        return button;
    }

    // add các button vào Panel
    public JPanel buttonJPanel(){
        panel_bot = new JPanel(new GridLayout(5,4,15,15));
        for (int i=0 ;i<listBtnNumber.length;i++){
            panel_bot.add(buttonNumber(listBtnNumber[i]));
        }
        panel_bot.setBackground(Color.LIGHT_GRAY);
        return panel_bot;
    }
    public JPanel panelMain(){
        setTitle("Calculator");
        panelMain = new JPanel(new BorderLayout(4,3));
        panelMain.add(buttonJPanel(),BorderLayout.CENTER);
        panelMain.add(panelCalculator(),BorderLayout.NORTH);
        panelMain.setBackground(Color.GRAY);
        return panelMain;
    }

    public static void main(String[] args) {
        new CalculatorInterface();
    }

}
