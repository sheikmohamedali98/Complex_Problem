package com.game.fourte;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class GameFourte {

    static Scanner scan = new Scanner(System.in);
    static List<Integer> list = new ArrayList<>();
    static int[] numbers = new int[4];
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
        premutation(numbers,0, numbers.length-1);
    }

    private static int[] swap(int[] arr, int start,int end) {

       int  temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        return arr;
    }

    public static void premutation(int[] arr,int start,int end) {
        if(start == end) {
            System.out.println(Arrays.toString(arr));
        }else {
            for(int i =0;i<=end;i++) {
                arr = swap(arr, i, end);
                premutation(arr, start+1, end);
                arr = swap(arr, start, i);
            }
        }
    }
}
