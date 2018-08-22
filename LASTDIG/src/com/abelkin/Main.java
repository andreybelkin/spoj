package com.abelkin;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
int t = in.nextInt();
for (int i=0;i<t;i++) {
int a = in.nextInt();
int b = in.nextInt();
if (b==0) {
    System.out.println("1");
    continue;
}
switch (a % 10) {
case 0:case 1:case 5:case 6:
System.out.println(a % 10);
break;
case 2:case 3:case 7:case 8:
b = b % 4;
b = (b == 0) ? 4 : b;
int res = a;
for (int k = 0; k < b-1; k++) {
    res *= a;
}
System.out.println(res % 10);
break;
case 4:case 9:
if (b % 2 == 0) {
    res=a*a%10;
} else {
    res=a%10;
}
System.out.println(res);
break;
}
}
}
}
