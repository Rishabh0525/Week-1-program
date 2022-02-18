package com.company;

public class Main {
    static void firstNonRepeatingElement(int A[])
    {
        int n = A.length;
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j <= n; j++)
            {
                if (j == n)
                {
                    System.out.printf("First non-repeating element is: %d ",A[i]);
                    return;
                }
                if (j != i && A[i] == A[j])
                {
                    break;
                }
            }
        }
        System.out.println("All the elements are repeating.");
    }

    public static void main(String[] args) {
        int A[]={1 , 18, 20, 1 , 14 , 16 , 18 , 9 , 0};
        firstNonRepeatingElement(A);    }
}