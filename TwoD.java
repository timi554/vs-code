public class TwoD{
    public static void main(String[] args) {
        String[][] words = new String[3][2]; //2D array of strings
        //3 rows 2 col or 3 arrays of 2
        words[0][0] ="This";
        words[0][1] ="is";
        words[1][0] ="a";
        words[1][1] ="2";
        words[2][0] ="D";
        words[2][1] ="array";
        System.out.println(words.length);
        System.out.println(words[0].length);
        for(int row = 0; row<words.length; row++){
            for(int col = 0; col<words[0].length; col++){
                System.out.print(words[row][col]+ " ");
            }
            System.out.println(" "); //drop down a line
        }
        int[][] nums = {{8,4}, {10,-4}, {90,35}, {2,17}, {55,0}};
        System.out.println("cols "+ nums[0].length);
        for(int col = 0; col < nums[0].length; col++){
            for(int row = 0; row < nums.length; row++){
                System.out.print(nums[row][col] + " ");
            }
            System.out.println(" ");
        }


        
    }
}