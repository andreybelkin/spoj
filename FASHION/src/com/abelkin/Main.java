package com.abelkin;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);

	    int t = in.nextInt();
	    for (int i = 0; i < t; i++) {
	        int n = in.nextInt();
	        int[] men = new int[n];
	        int[] wom = new int[n];
	        for (int k = 0; k < n; k++) {
	            men[k] = in.nextInt();
            }
            for (int k = 0; k < n; k++) {
                wom[k] = in.nextInt();
            }
            Arrays.sort(men);
	        Arrays.sort(wom);
	        long res = 0;
	        for (int k = 0; k < n; k++) {
	            res += men[k] * wom[k];
            }
            System.out.println(res);
        }
    }
}
