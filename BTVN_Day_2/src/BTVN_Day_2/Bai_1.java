package btvn_day_2;

import java.util.Scanner;

public class Bai_1 {
        static long Sum(int a,int arr[]){
            int S = 0;
            for(int i=1;i<=a;i++){
                S+=i;
            }
            return S;
        }
    public static void main(String[] args) {
        int a;
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap canh hinh: ");
        a = scan.nextInt();
        System.out.println("Ket qua: ");
        for (int i = 1; i <= a; i++) {
            if (i == 1 || i == a) {
                for (int j = 1; j <= a; j++) {
                    System.out.print('*' + " ");
                }
                System.out.println();
            } else {
                for (int j = 1; j <= a; j++) {
                    if (j == 1 || j == a) {
                        System.out.print('*' + " ");
                    } else {
                        System.out.print(" " + " ");
                    }
                }
                System.out.println();
            }
        }
        scan.close();

    }

}
