package com.abelkin;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    private static boolean isPolindrom(String number) {
        for (int i = 0; i < number.length() / 2; i++) {
            if (number.charAt(i) != number.charAt(number.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            BigInteger k = in.nextBigInteger();
            do {
                k = k.add(BigInteger.ONE);
            } while (!isPolindrom(k.toString()));
            System.out.println(k);
        }
    }
}
