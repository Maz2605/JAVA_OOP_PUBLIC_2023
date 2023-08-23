package btvn_day_3;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Bai_1 {

    public static Scanner scan = new Scanner(System.in);

    public static void Nhap(int n, int arr[]) {
        System.out.print("Nhap mang A: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
    }

    public static void Check(int arr[]) {
        Map<Integer, Integer> x = new HashMap<>();
        for (int i : arr) {
            if (x.containsKey(i)) {
                x.put(i, x.get(i) + 1);
            } else {
                x.put(i, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : x.entrySet()) {
            System.out.println("Phan tu " + entry.getKey() + " xuat hien " + entry.getValue() + " lan");
        }
    }

    public static void main(String[] args) {
        int n;
        System.out.print("Nhap so luong phan tu: ");
        n = scan.nextInt();
        int A[] = new int[n];
        Nhap(n, A);
        Check(A);
        scan.close();
    }
}
