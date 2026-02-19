package arrays;

import java.util.*;

public class DSAMainClass {
    public static void main(String[] args) {
        String str1 = "trangle";
        String str2 = "ntegral";

//        checkForAnagramUsingHashMap(str1, str2);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        reverseElementUsingStack(arr);
//        reverseUsingTwoPointerApprach(arr);

        int[] pairArr = {3, 7, 9, 2, 8, 10, 11};
        int sumTarget = 17;

//        findPariSum(pairArr, sumTarget);
//        findMissingNumber();
//        unionOfArray();

//        usingHashMap(str1, str2);
//        longestSubString();
        boolean isPalidrom = checkPalidrom("madam");
        System.out.println(isPalidrom);
    }

    private static boolean checkPalidrom(String value) {
//        String value = "madam";
        int start = 0;
        int end = value.length() -1 ;

        while (end > start) {
            if (value.charAt(start) == value.charAt(end)) {
                start++;
                end--;
            }else{
                return false;
            }
        }
        return true;
    }

    private static void longestSubString() {
        String str = "abcabcbb";

        int[] arr = new int[1024];
        char[] chars = str.toCharArray();
        int repeatIndex = 0;

        for (int i = 0; i < chars.length - 1; i++) {
            if (arr[chars[i]] == 1) {
                repeatIndex = i;
                break;
            } else {
                arr[chars[i]] = 1;
            }
        }
        System.out.println("longest substring ");
        printArray(arr, repeatIndex);

    }

    public static void printArray(int[] arr, int limit) {
        if (limit == 0) {
            limit = arr.length;
        }
        for (int i = 0; i < limit; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void unionOfArray() {
        int[] arr1 = {1, 2, 4, 5, 6, 7, 7, 7};
        int[] arr2 = {2, 3, 5, 7};


    }

    private static void findMissingNumber() {
        int[] arr = {1, 2, 4, 6, 3, 7, 8};
        int totalDigit = 8;

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        int totalSum = (totalDigit * (totalDigit + 1)) / 2;
        int missingnumber = totalSum - sum;
        System.out.println(missingnumber);
    }

    private static void findPariSum(int[] arr, int sumTarget) {

//        int initialElement = arr[0];
        for (int element : arr) {
            int secondElement = sumTarget - element;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == secondElement) {
                    String message = "the pair is " + secondElement + "and " + (arr[i] - secondElement);
                    System.out.println(message);
                    return;
                }
            }
        }


//        int start = 0;
//        int end = arr.length -1;
//
//        while (end >= start){
//
//            if(arr[start] + arr[end] == sumTarget){
//                return;
//            }else{
//                start++;
//            }
//        }
    }

    private static void reverseUsingTwoPointerApprach(int[] arr) {
        int startIndex = 0;
        int endIndex = arr.length - 1;

        while (endIndex > startIndex) {
            swapElement(arr, startIndex, endIndex);
            startIndex++;
            endIndex--;
        }
        startIndex++;
        endIndex--;
    }

    public static void swapElement(int[] arr, int x, int y) {
        int tmp = arr[y];
        arr[y] = arr[x];
        arr[x] = tmp;
    }

    private static void reverseElementUsingStack(int[] arr) {
        Stack<Integer> intStack = new Stack<>();
        for (int a : arr) {
            intStack.push(a);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(intStack.pop());
        }
    }

    public static void checkForAnagramUsingHashMap(String str1, String str2) {
        if (usingHashMap(str1, str2)) {
            System.out.println("both string are anagram");
        }
    }

    private static boolean usingHashMap(String str1, String str2) {
        Map<Character, Integer> countMap = new HashMap<>();

        for (char c : str1.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        for (char c : str2.toCharArray()) {
            if (!countMap.containsKey(c)) {
                return false;
            }
        }

        return true;
    }

    private static void usingArrysMethod(String str1, String str2) {
        char[] charArray = str1.toCharArray();
        char[] charArray1 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray);

        System.out.println(charArray1);
        System.out.println(charArray);
        if (charArray1.equals(charArray)) {
            System.out.println("both are anagram");
        }
    }
}
