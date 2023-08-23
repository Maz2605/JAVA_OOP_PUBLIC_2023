package BTVN_Day_2;

import java.util.Scanner;

public class Bai_5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, c;
        int x = 1, y = 2, z = 4;
        int i = 1;
        int Sum = 0;
        boolean Check = true;
        System.out.print("Chanh: ");
        a = scan.nextInt();
        System.out.print("Tao: ");
        b = scan.nextInt();
        System.out.print("Le: ");
        c = scan.nextInt();
        if (a < x || b < y || c < 4) {
            System.out.println("Khong du nguyen lieu");
        } else {
            while (Check == true) {
                int a1 = 1, b1 = 2, c1 = 4;
                a1 *= i;
                b1 *= i;
                c1 *= i;
                if (a1 > a || b1 > b || c1 > c) {
                    Check = false;
                    i--;
                } else {
                    i++;
                }
            }
            Sum = (x * i) + (y * i) + (z * i);
            System.out.println("Tong so qua toi da: " + Sum);
            System.out.println("(Chanh: " + (x * i) + ", Tao: " + (y * i) + ", Le: " + (z * i) + ")");
        }
        scan.close();
    }
}
