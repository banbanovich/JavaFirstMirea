package ru.mirea.task1;

import java.util.Scanner;

public class tmp5 {
    public static long fuctr(int n) {
        int a=1;
        for(int i=1;i<=n;i++){
            a*=i;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner b = new Scanner(System.in);
        int a=b.nextInt();
        System.out.println("Факториал "+fuctr(a));

    }
}
