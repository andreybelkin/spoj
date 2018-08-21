package com.abelkin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n;
        long[] arr = new long[100];
        arr[0] = 1;
        int maxN = 1;
        while ((n = in.nextInt()) != 0) {
            if (n > maxN) {
                for (int k = maxN; k < n; k++) {
                    arr[k] = (k+1) * (k+1) + arr[k - 1];
                }
            }
            System.out.println(arr[n - 1]);
        }
    }
}
