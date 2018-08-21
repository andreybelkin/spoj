package com.abelkin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);

	    int n;
	    while ((n = in.nextInt()) != 0) {
            String st = in.next();
            int m = st.length() / n;
	        char[][] arr = new char[m][n];
	        int go = 1;
	        int counter = 0;
	        for (int i = 0; i < m; i++) {
	            if (go == 1) {
	                for (int k = 0; k < n; k++) {
	                    arr[i][k] = st.charAt(counter++);
                    }
                } else {
                    for (int k = n-1; k >= 0; k--) {
                        arr[i][k] = st.charAt(counter++);
                    }
                }
	            go *= -1;
            }
            for (int i = 0; i < n; i++) {
	            for (int j = 0; j < m; j++) {
                    System.out.print(arr[j][i]);
                }
            }
            System.out.println("");
        }
    }
}
