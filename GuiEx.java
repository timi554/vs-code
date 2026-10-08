
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.*;


//Timi
//Sept 17 2026
//Java Swing

public class GuiEx{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Test");
        
        URL img1 = GuiEx.class.getResource("/bird.png");
        ImageIcon imageIcon = new ImageIcon(img1);
        
        JTextField textField = new JTextField("Text Field");
        textField.setBounds(10,50,100,25);
        frame.add(textField);

        JLabel results = new JLabel("Results Here");
        results.setBounds(10,200,200,50);
        frame.add(results);
        JButton button = new JButton("Click Me!"); 
        button.setBounds(100, 100, 100, 50);
        JLabel label = new JLabel("I am a Label");
        label.setBounds(10, 10, 100, 25);
        frame.add(label);
        JTextArea textArea = new JTextArea("This is a textbox.");
        textArea.setBounds(125, 10, 100, 25);
        frame.add(textArea);
        frame.add(button);
        frame.setSize(300,300);
        frame.setLayout(null);
        frame.setVisible(true);
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                String msg = textField.getText();
                results.setText("You entered "+msg);



            }


        });



    }
}