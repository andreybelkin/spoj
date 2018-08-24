package com.abelkin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);

	    int t = in.nextInt();
	    for (int i = 0; i < t; i++) {
            long n = in.nextLong();
            long ostatok = 0;
            for (long k = 0; k < n; k++) {
                long child = in.nextLong();
                ostatok += child % n;
                ostatok = ostatok % n;
            }
            if (ostatok == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
