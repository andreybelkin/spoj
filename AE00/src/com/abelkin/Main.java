package com.abelkin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);

	    int n = in.nextInt();
	    int counter = 0;
	    for (float iQuad = 2; iQuad * iQuad <= n; iQuad++) {
	        counter += (int)((n - iQuad * iQuad) / iQuad) + 1;
        }
        System.out.print(counter + n);
    }
}
