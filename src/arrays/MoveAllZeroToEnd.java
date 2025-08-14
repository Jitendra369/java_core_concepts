package arrays;

public class MoveAllZeroToEnd {
    public static void main(String[] args) {
        int arr[] = {1,2,0,2,0,1,0,0,1,5,4,7};
        filterNonZeroElement(arr);
    }

    private static void filterNonZeroElement(int[] arr) {
        int[] tempArray = new int[arr.length];

        int count = 0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] != 0){
                tempArray[count++] = arr[i];
            }
        }
        for (int x : tempArray){
            System.out.print(x + ", ");
        }
    }


}
