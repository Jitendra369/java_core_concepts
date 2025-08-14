package arrays;

public class ClockWiseRotateArray {
    public static void main(String[] args) {
         int[]  arr = {1, 2, 3, 4, 5, 6};
         int rotation = 2;
         while (rotation > 0){
             methodOne(arr, rotation);
             rotation--;
         }
    }

    private static void methodOne(int[] arr, int rotation) {
        int firstEle = arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            swap(arr, i ,i+1);
        }

        System.out.println("");
        for (int x : arr){
            System.out.print(x + ", ");
        }
    }
    private static void swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
