package com.tugas1;

import java.util.*;

public class Soal2 {
    public static void main(String[] args){
        int i, j, n,f1,f2,f3, f4, f5, f6;
        Scanner inputUser = new Scanner(System.in);

        System.out.println("========================");
        System.out.println("======== Case 1 ========");
        System.out.println("=== Deret Fibonacci ====");
        System.out.println("========================");
        f1=f2=1;
        f3=0;
        System.out.print("Masukkan Nilai N : ");
        n = inputUser.nextInt();
        System.out.println("========================");
        for(i = 0 ; i < n ; i++){
            System.out.print(f1 + " ");
            f1 = f2+f3;
            f3 = f2;
            f2 = f1;
        }
        System.out.println();
        System.out.println("========================");

        System.out.print("\n\n");

        System.out.println("=======================");
        System.out.println("======= Case 2a =======");
        System.out.println("===== Deret Cermin ====");
        System.out.println("=======================");
        System.out.print("Masukkan Nilai N : ");
        n = inputUser.nextInt();
        System.out.println("=======================");
        for(i = 1 ; i <= (n+1)/2 ; i++){
            System.out.print(i + " ");
        }
        for(i = (n-1)/2 ; i>=1 ; i--){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("=======================");

        System.out.print("\n\n");

        System.out.println("============================");
        System.out.println("========= Case 2b ==========");
        System.out.println("== Deret Fibonacci Cermin ==");
        System.out.println("============================");
        System.out.print("Masukkan Nilai N : ");
        n = inputUser.nextInt();
        System.out.println("============================");

        f1=f2=1;
        f3=0;

        for(i = 1 ; i <= n ; i++) {
            if (i <= (n + 1) / 2) {
                System.out.print(f1 + " ");
                f1 = f2 + f3;
                f3 = f2;
                f2 = f1;
            }
            else {
                f1 = f2 - f3;
                f2 = f3;
                f3 = f1;
                System.out.print(f1 + " ");

            }
        }
        System.out.println();
        System.out.println("============================");

        System.out.print("\n\n");

        System.out.println("==============================");
        System.out.println("=========== Case 3 ===========");
        System.out.println("== Deret X Fibonacci Cermin ==");
        System.out.println("==============================");
        System.out.print("Masukkan Nilai N : ");
        n = inputUser.nextInt();
        System.out.println("==============================");

        f1=f2=1;
        f3=0;

        f4=f5=1;
        f6=0;

        for (i = 1 ; i <= n ; i++){
            for (j = 1 ; j <= n ; j++){
                if( i == j) {
                    if (i <= (n + 1) / 2) {
                        System.out.print(f1 + " ");
                        f1 = f2 + f3;
                        f3 = f2;
                        f2 = f1;
                    } else {
                        f1 = f2 - f3;
                        f2 = f3;
                        f3 = f1;
                        System.out.print(f1 + " ");
                    }
                }

                else if (i == n-j+1) {
                    if (i <= (n + 1) / 2) {
                        System.out.print(f4 + " ");
                        f4 = f5 + f6;
                        f6 = f5;
                        f5 = f4;
                    } else {
                        f4 = f5 - f6;
                        f5 = f6;
                        f6 = f4;
                        System.out.print(f5 + " ");
                    }
                }

                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("==============================");
    }

}
