package com.abelkin;

import java.util.Scanner;

public class Main {

    private static int getI(String str, int i) {
        return (i < str.length()) ? Integer.parseInt(str.substring(i, i + 1)) : 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            String str1 = in.next();
            String str2 = in.next();
            boolean wasNonZero = false;
            int addition = 0;
            for (int k = 0; k < str1.length() || k < str2.length(); k++) {
                int sum = getI(str1, k) + getI(str2, k) + addition;
                if (sum % 10 > 0) {
                    wasNonZero = true;
                }
                if (wasNonZero) {
                    System.out.print(sum % 10);
                }
                addition = sum / 10;
            }
            if (addition > 0) {
                System.out.print(addition);
            }
            System.out.println("");
        }
    }
}
