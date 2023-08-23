package BTVN_Day_2;

import java.util.Scanner;

public class Bai_4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a, b, c, t1, t2;
        double Delta;
        double x1, x2, x3, x4;
        int Check;
        System.out.print("Nhap a: ");
        a = scan.nextDouble();
        System.out.print("Nhap b: ");
        b = scan.nextDouble();
        System.out.print("Nhap c: ");
        c = scan.nextDouble();
        System.out.print("=> Phuong trinh");
        Delta = Math.pow(b, 2) - (4 * a * c);
        if (Delta < 0) {
            t1 = 0;
            t2 = 0;
            Check = 1;
        } else if (Delta == 0) {
            t1 = -b / (2 * a);
            t2 = t1;
            Check = 2;
        } else {
            t1 = (-b + Math.sqrt(Delta)) / (2 * a);
            t2 = (-b - Math.sqrt(Delta)) / (2 * a);
            Check = 3;
        }
        if (Check == 1) {
            System.out.println(" vo nghiem");
        } else if (Check == 2) {
            if (t1 < 0 && t2 < 0) {
                System.out.println(" vo nghiem");
            } else if (t1 == 0 && t2 == 0) {
                System.out.println(" co 1 nghiem");
                x1 = 0;
                System.out.println("X: " + x1);
            } else {
                System.out.println(" co 2 nghiem");
                x1 = Math.sqrt(t1);
                x2 = -Math.sqrt(t1);
                System.out.println("X1: " + x1);
                System.out.println("X2: " + x2);
            }
        } else {
            if (t1 == 0) {
                if (t2 < 0) {
                    System.out.println(" co 1 nghiem");
                    x1 = 0;
                    System.out.println("X: " + x1);
                } else {
                    System.out.println(" co 3 nghiem");
                    x1 = Math.sqrt(t2);
                    x2 = -Math.sqrt(t2);
                    x3 = 0;
                    System.out.println("X1: " + x1);
                    System.out.println("X2: " + x2);
                    System.out.println("X3: " + x3);
                }
            } else if (t1 < 0) {
                if (t2 < 0) {
                    System.out.println(" vo nghiem");
                } else if (t2 > 0) {
                    System.out.println(" co 2 nghiem");
                    x1 = Math.sqrt(t2);
                    x2 = -Math.sqrt(t2);
                    System.out.println("X1: " + x1);
                    System.out.println("X2: " + x2);
                } else {
                    System.out.println(" co 1 nghiem");
                    x1 = 0;
                    System.out.println("X: " + x1);
                }
            } else {
                if (t2 < 0) {
                    System.out.println(" co 2 nghiem");
                    x1 = Math.sqrt(t1);
                    x2 = -Math.sqrt(t1);
                    System.out.println("X1: " + x1);
                    System.out.println("X2: " + x2);
                } else if (t2 == 0) {
                    System.out.println(" co 3 nghiem");
                    x1 = Math.sqrt(t1);
                    x2 = -Math.sqrt(t1);
                    x3 = 0;
                    System.out.println("X1: " + x1);
                    System.out.println("X2: " + x2);
                    System.out.println("X3: " + x3);
                } else {
                    System.out.println(" co 4 nghiem");
                    x1 = Math.sqrt(t1);
                    x2 = -Math.sqrt(t1);
                    x3 = Math.sqrt(t2);
                    x4 = -Math.sqrt(t2);
                    System.out.println("X1: " + x1);
                    System.out.println("X2: " + x2);
                    System.out.println("X3: " + x3);
                    System.out.println("X4: " + x4);
                }

            }

        }
        scan.close();
    }
}
