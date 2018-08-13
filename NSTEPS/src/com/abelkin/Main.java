package com.abelkin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);

	    int n = in.nextInt();
	    for (int i = 0; i < n; i++) {
	        int x = in.nextInt();
	        int y = in.nextInt();

	        if (x % 2 == 0) {
	            if (x == y || x - 2 == y) {
                    System.out.println(x + y);
                } else {
                    System.out.println("No Number");
                }
            } else {
	            if (x == y || x - 2 == y) {
                    System.out.println(x + y - 1);
                } else {
                    System.out.println("No Number");
                }
            }
        }
    }
}
