package com.abelkin;

public class Precomputer {

    public static void main(String[] args) {
        long[] arr = new long[8_000];
        System.out.print("long arr[] = {");
        for (int i = 0; i < 8_000; i++) {
            long sum = arr[i/2] + arr[i/3] + arr[i/4];
            arr[i] = (sum > i) ? sum : i;
            System.out.print(arr[i] + ",");
        }
        System.out.println("};");
    }

}
