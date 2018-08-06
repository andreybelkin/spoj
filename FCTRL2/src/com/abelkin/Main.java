package com.abelkin;

import java.util.Scanner;

public class Main {

    private static String[] arr = new String[100];
    private static int maxN = 1;

    static {
        arr[0] = "1";
    }

    private static String buffToString(int res[], int res_size) {
        StringBuffer buff = new StringBuffer();
        for (int i = res_size - 1; i >= 0; i--) {
            buff.append(res[i]);
        }

        return buff.toString();
    }

    private static String factorial(int n, int maxSize) {
        int res[] = new int[maxSize];
        res[0] = 1;
        int res_size = 1;

        for (int x = 2; x <= n; x++) {
            res_size = multiply(x, res, res_size);
            arr[x - 1] = buffToString(res, res_size);
            maxN = res_size;
        }

        return arr[n - 1];
    }

    private static int multiply(int x, int res[], int res_size) {
        int carry = 0;
        for (int i = 0; i < res_size; i++) {
            int prod = res[i] * x + carry;
            res[i] = prod % 10;
            carry = prod / 10;
        }

        while (carry != 0) {
            res[res_size] = carry % 10;
            carry = carry / 10;
            res_size++;
        }

        return res_size;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for (int i = 0; i < t; i++) {
            int n = in.nextInt();

            if (n <= maxN && maxN != 0) {
                System.out.println(arr[n - 1]);
            } else {
                arr[n - 1] = factorial(n, 300);
                System.out.println(arr[n - 1]);
            }


        }
    }
}
