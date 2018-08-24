package com.abelkin;

import java.util.Scanner;

public class Main {

    private static String str;

    private static long counter(int position) {
        if (position >= str.length()) {
            return 1;
        }
        long sum = 0;
        String firstDigit = str.substring(position, position + 1);
        if (!firstDigit.equals("0")) {
            sum = counter(position + 1);
        }
        if (position < str.length() - 1) {
            String twoDigits = str.substring(position, position + 2);
            byte twoDigitNum = Byte.valueOf(twoDigits);
            if (twoDigitNum < 27) {
                sum += counter(position + 2);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (!(str = in.next()).equals("0")) {
            System.out.println(counter(0));
        }
    }
}
