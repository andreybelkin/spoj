package com.abelkin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        int arr[] = new int[1000000000 / 5 + 1];
        int maxFive = 0;

        for (int i = 0; i < t; i++) {
            int n = in.nextInt();

            if (n / 5 <= maxFive && maxFive != 0) {
                System.out.println(arr[n / 5]);
            } else {
                int z = 0;
                int currentStart = arr[maxFive];
                int j = (maxFive + 1) * 5;
                while (j <= n) {
                    z++;
                    int k = j / 5;
                    while (k % 5 == 0) {
                        z++;
                        k = k / 5;
                    }
                    arr[j / 5] = currentStart + z;
                    j += 5;
                }
                if (j > n) {
                    j -= 5;
                }
                maxFive = j / 5;
                System.out.println(arr[n / 5]);
            }
        }
    }
}
