

public class FuncRev{
    public static void main(String[] args) {
        //Call the toLowerCase
        //string function
        String word = "TREE";
        String ans = word.toLowerCase();
        System.out.println(ans);
        
        //Call the log fcn
        //From the math class
        double result = Math.log(40);
        System.out.println(result);
        
        //Call parseInt fcn
        //From the integer class
        
        int num1 = Integer.parseInt("3");
        System.out.println(num1);

        //write a function 
        //that takes in an integer(param)
        //returns the param didvided by 100
        double num2 = division(20);
        System.out.println(num2);

        
    }
    public static double division(int num2){
        return num2/100.0;

    }
    
}