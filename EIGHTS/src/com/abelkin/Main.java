package com.abelkin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);

	    int t = in.nextInt();
	    for (int i = 0; i < t; i++) {
	        long k = in.nextLong();
            System.out.println(192 + (k - 1) * 250);
        }
    }
}
