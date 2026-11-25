//Timi A
//Nov 9
public class ArraysEx{
    public static void main(String[] args) {
        int num = 0;
        int[] arr = new int[5];
        System.out.println(arr[0]);
        boolean[] arrbool = new boolean[3];
        System.out.println(arrbool[0]);
        double[] nums = {1.0, 2.0, 3.0, 4.0, 5.0};
        System.out.println(nums[4]);
        System.out.println(nums.length); 
        addTen(nums);
        System.out.println(nums[4]);
    }
    public static void addTen(double[] arr){
        // u cant use less than or equals to for the loop
        for(int i = 0; i < arr.length; i++){
            arr[i] += 10;
        }
    }
}