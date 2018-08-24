package com.abelkin;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            BigInteger a1 = in.nextBigInteger();
            BigInteger a2 = in.nextBigInteger();
            BigInteger x = a1.add(a2).divide(BigInteger.valueOf(2));
            System.out.println(x);
            x = x.subtract(a2);
            System.out.println(x);
        }
    }
}
