package btvn_day_3;

import java.util.Scanner;

public class Bai_2 {

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

    public static boolean Check(int goc, int x) {
        if (x < 0 || x > goc) {
            return false;
        } else {
            return true;
        }
    }

    public static void Chen(int n, int arr[]) {
        int k, x;
        System.out.print("Nhap gia tri can chen: ");
        x = scan.nextInt();
        do {
            System.out.print("Nhap vi tri muon chen: ");
            k = scan.nextInt();
            if (Check(n, k) == false) {
                System.out.println("Vi tri khong hop le\nVui long nhap lai");
            }
        } while (Check(n, k) == false);
        int A[] = new int[n + 1];
        for (int i = 0; i < n; i++) {
            A[i] = arr[i];
        }
        k--;
        for (int i = n - 1; i > k; i--) {
            A[i + 1] = A[i];
        }
        A[k] = x;
        Xuat(A);
    }

    public static void Xoa(int n, int arr[]) {
        int k;
        do {
            System.out.print("Nhap vi tri muon xoa: ");
            k = scan.nextInt();
            if (Check(n, k) == false) {
                System.out.println("Vi tri khong hop le\nVui long nhap lai");
            }
        } while (Check(n, k) == false);
        int B[] = new int[n - 1];
        for (int i = k; i < n; i++) {
            arr[i - 1] = arr[i];
        }
        for (int i = 0; i < n - 1; i++) {
            B[i] = arr[i];
        }
        Xuat(B);
    }

    public static void main(String[] args) {
        int n;
        System.out.print("Nhap so luong phan tu: ");
        n = scan.nextInt();
        int A[] = new int[n];
        Nhap(n, A);
        Chen(n, A);
        Xoa(n, A);
        scan.close();
    }
}
