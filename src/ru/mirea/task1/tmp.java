package ru.mirea.task1;

import java.util.Scanner;

public class tmp {
    public static void main(String[] args) {
        int[] a = new int[10];
        int sum=0;
        int c=0;
        Scanner b = new Scanner(System.in);
        for(int i=0;i<a.length;i++){
            a[i]=b.nextInt();
            sum+=a[i];
            c++;
        }
        System.out.println(sum/c);
        b.close();
    }
}
