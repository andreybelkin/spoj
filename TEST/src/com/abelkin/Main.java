package com.abelkin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int i;
            try {
                i = sc.nextInt();
            } catch (Exception e) {
                return;
            }
            if (42 == i) {
                return;
            }
            System.out.println(i);
        }
    }
}
