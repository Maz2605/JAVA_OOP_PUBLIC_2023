package btvn_day_3;

import java.util.Scanner;

public class Bai_4 {

    public static Scanner scan = new Scanner(System.in);

    public static boolean Check(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        String S;
        System.out.print("Nhap chuoi: ");
        S = scan.nextLine();
        if(Check(S)==true)
            System.out.println("Chuoi doi xung");
        else
            System.out.println("Chuoi bat doi xung");
    }

}
