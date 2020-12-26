package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int max = -1;
        int min = Integer.MAX_VALUE;
        int x = 0;
        int y = 0;
        for(int i = 0; i < n;i++){
        a[i] = in.nextInt();
        if(a[i] > max) {
            max = a[i];
            x = i;
        }
        if(a[i] < min) {
            min = a[i];
            y = i;
        }
        }
        a[x] = min;
        a[y] = max;
        System.out.println("Массив после изменения");
        for (int  i =0; i < n;i++){
            System.out.println(a[i] + "\n");
        }
    }
}
