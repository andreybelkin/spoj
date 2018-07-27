package com.abelkin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int k = 0; k < t; k++) {
            boolean wasNumbers = false;
            int n = in.nextInt();
            int m = in.nextInt();
            if (n == 1) {
                n++;
            }
            if (n == 2 && n < m) {
                System.out.println("2");
                n++;
                wasNumbers = true;
            }
            if (m == 2) {
                System.out.println("2");
                m--;
                wasNumbers = true;
            }
            if (n % 2 == 0) {
                n++;
            }
            if (m % 2 == 0) {
                m--;
            }
            for (int i = n; i <= m; i = i + 2) {
                int j = 3;
                boolean isPrime = true;
                while (j * j <= i) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                    j++;
                }
                if (isPrime) {
                    System.out.println(i);
                    wasNumbers = true;
                }
            }
            if (wasNumbers && k < t - 1) {
                System.out.println("");
            }
        }
    }
}
