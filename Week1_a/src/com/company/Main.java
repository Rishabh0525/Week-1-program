package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String input = "java";
        char search_a = 'a';

        int count_a=0;
        for(int i=0; i<input.length(); i++)
        {
            if(input.charAt(i) == search_a)
                count_a++;
        }

        char search_j = 'j';
        int count_j=0;
        for(int i=0; i<input.length(); i++)
        {
            if(input.charAt(i) == search_j)
                count_j++;
        }

        char search_v = 'v';
        int count_v=0;
        for(int i=0; i<input.length(); i++)
        {
            if(input.charAt(i) == search_v)
                count_v++;
        }

        System.out.printf("j = %d,a = %d, v = %d ",count_j,count_a,count_v);

    }
}
