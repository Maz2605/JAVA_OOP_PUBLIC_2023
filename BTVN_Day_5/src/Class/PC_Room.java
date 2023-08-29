package Class;

import java.util.Scanner;

public class PC_Room {
    private String Ma_Phong;
    private String Ten_Phong;
    private double Dien_tich;
    private Quan_ly Ql = new Quan_ly();
    private int n;
    private PC Pc[] = new PC[100];

    public PC_Room() {

    }

    public PC_Room(String Ma_Phong, String Ten_Phong, double Dien_tich, int n) {
        this.Ma_Phong = Ma_Phong;
        this.Ten_Phong = Ten_Phong;
        this.Dien_tich = Dien_tich;
        this.n = n;
    }

    public String getMa_Phong() {
        return Ma_Phong;
    }

    public void setMa_Phong(String Ma_Phong) {
        this.Ma_Phong = Ma_Phong;
    }

    public String getTen_Phong() {
        return Ten_Phong;
    }

    public void setTen_Phong(String Ten_Phong) {
        this.Ten_Phong = Ten_Phong;
    }

    public double getDien_tich() {
        return Dien_tich;
    }

    public void setDien_tich(double Dien_tich) {
        this.Dien_tich = Dien_tich;
    }

    public Quan_ly getQl() {
        return Ql;
    }

    public void setQl(Quan_ly Ql) {
        this.Ql = Ql;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public PC[] getPc() {
        return Pc;
    }

    public void setPc(PC[] Pc) {
        this.Pc = Pc;
    }

    public void Input(Scanner scan) {
        System.out.print("Ma phong: ");
        Ma_Phong = scan.nextLine();
        System.out.print("Ten phong: ");
        Ten_Phong = scan.nextLine();
        System.out.println("Quan ly: ");
        Ql.Input(scan);
        System.out.print("So luong may: ");
        n = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < n; i++) {
            Pc[i] = new PC();
            System.out.println("May " + (i + 1));
            Pc[i].Input(scan);
        }
    }

    public void Output() {
        System.out.println("Ma phong: " + Ma_Phong);
        System.out.println("Ten phong: " + Ten_Phong);
        System.out.println("Quan ly: ");
        Ql.Output();
        System.out.println("So luong may: " + n);
        for (int i = 0; i < n; i++) {
            System.out.println("May " + (i + 1));
            Pc[i].Output();
        }
    }

}
