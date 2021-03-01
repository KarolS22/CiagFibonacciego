package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj n");
        int n = scan.nextInt();
        System.out.println("1. 0");
        int[] tab = new int[n+1];
        tab[0]=0;
        tab[1]=1;
        for(int i=1;i<n;i++){
            int liczba=tab[i]+tab[i-1];
            tab[i+1]=tab[i]+tab[i-1];
            System.out.println(i+1+". "+liczba);
        }
    }
}
