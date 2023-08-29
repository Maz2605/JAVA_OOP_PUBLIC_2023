package BTVN_Day_5;

import java.util.Scanner;

import Class.Student;

public class Bai_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.print("So luong sinh vien can nhap: ");
        n = scan.nextInt();
        Student A[] = new Student[n];
        for (int i = 0; i < n; i++) {
            A[i] = new Student();
            System.out.println("Sinh vien thu " + (i + 1));
            A[i].Input(scan);
        }
        System.out.println("-------------------------------");
        System.out.println("DS Sinh vien: ");
        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Sinh vien thu " + (i + 1));
            A[i].Output();
        }
        scan.close();
    }
}
