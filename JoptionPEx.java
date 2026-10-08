
import javax.swing.JOptionPane;

//Timi
//Sept.16
//Calling Functions

public class JoptionPEX{
public static void main(String[] args) {
    System.out.println("Hello World");
    JOptionPane.showMessageDialog(null, "Yes sir");
    String name = JOptionPane.showInputDialog("Enter your Name: ");
    JOptionPane.showMessageDialog(null ,"Hello " +name);
    String num = JOptionPane.showInputDialog("Enter a number: ");
    int intNum = Integer.parseInt(num);
    JOptionPane.showMessageDialog(null, intNum*10);
    

        
    }
}