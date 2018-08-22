package com.abelkin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int a1, a2, a3;

	    while (((a1 = in.nextInt()) != 0) | ((a2 = in.nextInt()) != 0) | ((a3 = in.nextInt()) != 0)) {
	        if (a2 * 2 == a1 + a3) {
                System.out.println("AP " + (a3 * 2 - a2));
            } else {
                System.out.println("GP " + (a3 / a2 * a3));
            }
        }
    }
}
