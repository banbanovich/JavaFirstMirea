package ru.mirea.task1;
import java.util.Scanner;

public class tmp2 {
    public static void main(String[] args) {
        int[] a = new int[10];
        int sum=0;
        int i=0;
        int min=9999999;
        int max=-9999999;
        Scanner b = new Scanner(System.in);
        while(i<a.length){
            a[i]=b.nextInt();
            if (a[i]>max){
                max=a[i];
            }
            if (a[i]<min){
                min=a[i];
            }
            sum+=a[i];
            i++;
        }
        System.out.println("Сумма элементов "+sum);
        System.out.println("Max элемент "+max);
        System.out.println("Min элемент "+min);
        b.close();
    }

}
