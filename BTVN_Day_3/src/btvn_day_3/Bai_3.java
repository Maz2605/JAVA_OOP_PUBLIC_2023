package btvn_day_3;

import java.util.Scanner;

public class Bai_3 {

    public static Scanner scan = new Scanner(System.in);

    public static void Nhap(int n, int arr[]) {
        System.out.print("Nhap mang A: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
    }

    public static void Xuat(int arr[]) {
        System.out.print("Mang A: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void Sap_xep(int n, int arr[]) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    arr[i] = arr[i] + arr[j];
                    arr[j] = arr[i] - arr[j];
                    arr[i] = arr[i] - arr[j];
                }
            }
        }
        Xuat(arr);
    }

    public static void main(String[] args) {
        int n;
        System.out.print("Nhap so luong phan tu: ");
        n = scan.nextInt();
        int A[] = new int[n];
        Nhap(n, A);
        Sap_xep(n, A);
        scan.close();
    }
}
