package BTVN_Day_2;

import java.util.Scanner;

public class Bai_3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        boolean check = true;
        System.out.print("n: ");
        n = scan.nextInt();
        if (n <= 0) {
            System.out.println(n + " Khong phai la so nguyen duong");
        } else {
            System.out.println(n + " La so nguyen duong");
        }
        if (n < 2) {
            check = false;
        } else {
            for (int i = 2; i < Math.sqrt(n); i++) {
                if (n % i == 0) {
                    check = false;
                }
            }
        }
        if (check == true) {
            System.out.println(n + " La so nguyen to ");
        } else {
            System.out.println(n + " Khong la so nguyen to");
        }
        scan.close();
    }
}
