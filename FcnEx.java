//Timi A
//Sept 21

public class FcnEx{
    public static void main(String[] args) {
        //call the function here
        int answer = number(5);
        System.out.println(answer);
        convert("Hello", 5);

        
    }
    //create a function that
    //takes in a number using a parameter
    //and returns the number squared
    public static int number(int num){
        return num*num;

    }
     //create a function that
    //in a string and an int as parameters
    //Then prints the string that many times
public static void convert(String words, int numTimes){
    for(int i=0; i<numTimes; i++){
        System.out.println(words);

    }


    }

   
}