package com.abelkin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int n;
	    int[] arr = new int[10000];
	    while ((n = in.nextInt()) != -1) {
	        int sum = 0;
	        for (int k = 0; k < n; k++) {
	            arr[k] = in.nextInt();
	            sum += arr[k];
            }
            if (sum % n == 0) {
	            int mediana = sum / n;
	            int count = 0;
	            for (int k = 0; k < n; k++) {
	                count += Math.abs(arr[k] - mediana);
                }
                System.out.println(count / 2);
            } else {
                System.out.println("-1");
            }
        }
    }
}
