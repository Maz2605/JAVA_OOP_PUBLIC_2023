package btvn_day_4;

import java.util.Scanner;

class HCN {

    private double D, R;

    public HCN() {

    }

    public HCN(double D, double R) {
        this.D = D;
        this.R = R;
    }

    public double getD() {
        return D;
    }

    public void setD(double D) {
        this.D = D;
    }

    public double getR() {
        return R;
    }

    public void setR(double R) {
        this.R = R;
    }

    public void Input() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap chieu dai: ");
        D = scan.nextDouble();
        System.out.print("Nhap chieu rong: ");
        R = scan.nextDouble();
    }

    public void Draw_HCN() {
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < D; j++) {
                System.out.print('*' + "  ");
            }
            System.out.println();
        }
    }

    public double Dien_tich() {
        return D * R;
    }

    public double Chu_vi() {
        return (D + R) * 2;
    }
}

public class Bai_2 {

    public static void main(String[] args) {
        HCN x = new HCN();
        x.Input();
        x.Draw_HCN();
        System.out.println("Dien tich HCN: " + x.Dien_tich());
        System.out.println("Chu vi HCN: " + x.Chu_vi());
    }

}
