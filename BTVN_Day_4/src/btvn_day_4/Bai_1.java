package btvn_day_4;

import java.util.Scanner;

class Book {

    private String Ma_sach, Ten_sach, Tac_gia, NXB;
    private int Nam_XB;

    public Book() {

    }

    public Book(String Ma_sach, String Ten_sach, String Tac_gia, String NXB, int Nam_XB) {
        this.Ma_sach = Ma_sach;
        this.Ten_sach = Ten_sach;
        this.Tac_gia = Tac_gia;
        this.NXB = NXB;
        this.Nam_XB = Nam_XB;
    }

    public String getMa_sach() {
        return Ma_sach;
    }

    public void setMa_sach(String Ma_sach) {
        this.Ma_sach = Ma_sach;
    }

    public String getTen_sach() {
        return Ten_sach;
    }

    public void setTen_sach(String Ten_sach) {
        this.Ten_sach = Ten_sach;
    }

    public String getTac_gia() {
        return Tac_gia;
    }

    public void setTac_gia(String Tac_gia) {
        this.Tac_gia = Tac_gia;
    }

    public String getNXB() {
        return NXB;
    }

    public void setNXB(String NXB) {
        this.NXB = NXB;
    }

    public int getNam_XB() {
        return Nam_XB;
    }

    public void setNam_XB(int Nam_XB) {
        this.Nam_XB = Nam_XB;
    }

    public void Input() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap ma sach: ");
        Ma_sach = scan.next();
        System.out.print("Nhap ten sach: ");
        Ten_sach = scan.next();
        System.out.print("Nhap tac gia: ");
        Tac_gia = scan.next();
        System.out.print("Nhap nha xuat ban: ");
        NXB = scan.next();
        System.out.print("Nhap nam xuat ban: ");
        Nam_XB = scan.nextInt();
    }

    public void Output() {
        System.out.printf("%-10s %-10s %-10s %-20s %-20d ", Ma_sach, Ten_sach, Tac_gia, NXB, Nam_XB);
        System.out.println();
    }
}

public class Bai_1 {

    public static void main(String[] args) {
        Book Arr[] = new Book[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Sach thu " + (i + 1) + " :");
            Arr[i] = new Book();
            Arr[i].Input();
            System.out.println(" ");
        }
        System.out.printf("%-10s %-10s %-10s %-20s %-20s \n", "Ma sach", "Ten sach", "Tac gia", "Nha xuat ban", "Nam xuat ban");
        for (Book i : Arr) {
            i.Output();
        }
    }
}