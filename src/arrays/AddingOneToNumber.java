package arrays;

public class AddingOneToNumber {
    public static void main(String[] args) {
        int[] num = {1,2,4};
        int[] num2 = {1,2,9};
        int[] num3 = {1,9,9};
        int add = 1;

        addToNumb(num3, add);

        for (int x : num3){
            System.out.print(x + ", ");
        }
    }

    private static void addToNumb(int[] num, int add) {
        int addition = num[num.length - 1] + add;
        num[num.length -1 ] = num[num.length -1 ] + add;
        int carry = 0;
        if (addition >= 10) {
            num[num.length - 1] = addition % 10;
            carry = addition / 10;
            num[num.length - 2] = carry + num[num.length - 2];
        }
    }

}