package com.company;
import java.util.Scanner;
class Largest{

    static void print2largest(int arr[], int arr_size)
    {
        int i, first, second;

        if (arr_size < 2)
        {
            System.out.printf(" Invalid Input ");
            return;
        }

        int largest = second = Integer.MIN_VALUE;

        for(i = 0; i < arr_size; i++)
        {
            largest = Math.max(largest, arr[i]);
        }

        for(i = 0; i < arr_size; i++)
        {
            if (arr[i] != largest)
                second = Math.max(second, arr[i]);
        }
        if (second == Integer.MIN_VALUE)
            System.out.printf("There is no second " +
                    "largest element\n");
        else
            System.out.printf("The second largest " +
                    "element is %d\n", second);
    }


    public static void main(String[] args)
    {
        int arr[] = { 1 , 18, 20, 1 , 14 , 16 , 18 , 9 , 01 };
        int n = arr.length;

        print2largest(arr, n);
    }
}
