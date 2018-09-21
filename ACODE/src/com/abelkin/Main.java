package com.abelkin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str;
        long[] oneDigitSum = new long[5001];
        long[] twoDigitsSum = new long[5001];
        while (!(str = in.next()).equals("0")) {
            if (str.charAt(0) == '0') {
                System.out.println("0");
                continue;
            }
            if (str.length() == 1) {
                System.out.println("1");
                continue;
            }
            oneDigitSum[0] = 1;
            twoDigitsSum[0] = 0;
            int twoDigits = Byte.valueOf(str.substring(0, 2));
            byte ai = Byte.valueOf(str.substring(1, 2));
            oneDigitSum[1] = (oneDigitSum[0] + twoDigitsSum[0]) * (ai > 0 ? 1 : 0);
            twoDigitsSum[1] = (twoDigits > 9 && twoDigits < 27 ? 1 : 0);
            for (int i = 2; i < str.length(); i++) {
                ai = Byte.valueOf(str.substring(i, i+1));
                twoDigits = Byte.valueOf(str.substring(i-1, i+1));
                // 1 и 2 варианты по черновику
                oneDigitSum[i] = (oneDigitSum[i-1] + twoDigitsSum[i-1]) * (ai > 0 ? 1 : 0);
                twoDigitsSum[i] = (twoDigits > 9 && twoDigits < 27 ? 1 : 0) * (oneDigitSum[i-2] + twoDigitsSum[i-2]);
                // чтобы не перебирать все цифры до конца, если это уже бессмысленно
                if (oneDigitSum[i] + twoDigitsSum[i] == 0) {
                    oneDigitSum[str.length()-1] = 0;
                    twoDigitsSum[str.length()-1] = 0;
                    break;
                }
            }
            System.out.println(oneDigitSum[str.length()-1] + twoDigitsSum[str.length()-1]);
        }
    }
}
