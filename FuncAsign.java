//Timi A
//Sept 23
//Functions Assignment #1
import java.util.*;
public class FuncAsign{
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a Word: ");
        String word = scan.next();
        swap(word);


        
    }
    public static String swap (String word){
        char first = word.charAt(0);
        String middle = word.substring(1, word.length()-1);
        char last = word.charAt(word.length()-1);
        System.out.println(word);
        String finalWord = first + middle + last;
        return finalWord;



        


    }
}