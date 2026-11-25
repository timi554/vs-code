public class TwoDPractice{
    public static void main(String[] args) {
        // String[][] table = new String [3][6];
        int[][] values = new int[4][5];
        for(int row = 0; row<values.length; row++){
            for(int col = 0; col<values[0].length; col++){
                values[row][col] = col+1;
               System.out.print(values[row][col] );
            }
            System.out.println();

        }

    }
}