package com.game.fourte;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Game {

    static Scanner scan = new Scanner(System.in);
    static List<Integer> list = new ArrayList<>();
    static int[] numbers = new int[4];
    static int[] subarray ;
    static char[] Operator = {'+', '-', '*', '/'};

    public static void main(String[] args) {

        System.out.println("Enter the Four  Number");

        for (int count = 0; count < 4; count++) {
            numbers[count] = scan.nextInt();
        }
        System.out.println(Arrays.toString(numbers));

        System.out.println("Enter the Result Number");
        int result = scan.nextInt();
        System.out.println(result);
        subArray(numbers);
        System.out.println(list.toString());
    }

    private static void subArray(int[] array) {
        int length = array.length;
        for (int index = length; index >= 1; index--) {
            for (int start = 0, end = index - 1; end < length; start++, end++) {
               subarray =  printArray(start, end, array);
                System.out.println(Arrays.toString(printArray(start,end,array)));
               int num = convertNumber(subarray);
//               num = reverseConvertNumber(subarray);
            }
        }
    }

    private static int[] printArray(int start, int end, int[] arr) {
        int[] array = new int[arr.length];
        int index = 0;
        for (int i = start; i <= end; i++) {
            array[index++] = arr[i];
        }
        return Arrays.copyOf(array, index);
    }


    private static int convertNumber(int[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans += (int) Math.pow(10, i) * arr[i];
        }
        list.add(ans);
        return ans;
    }
    private static int reverseConvertNumber(int[] arr) {
        int ans = 0;
        for (int i = arr.length-1; i >0; i--) {
            ans += (int) Math.pow(10, i) * arr[i];
        }
        list.add(ans);
        return ans;
    }
}


