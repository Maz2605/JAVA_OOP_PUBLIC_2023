package BTVN_Day_2;

import java.util.Scanner;

public class Bai_2 {

    public static int giai_thua(int x) {
        int GT = 1;
        for (int i = 1; i <= x; i++) {
            GT *= i;
        }
        return GT;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double S = 0;
        double P = 0;
        int n;
        System.out.print("n: ");
        n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            S += (float) 1 / i;
            P += giai_thua(i);
        }
        System.out.println("S = " + S);
        System.out.println("P = " + P);
        scan.close();
    }

}
