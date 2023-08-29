package Class;

import java.util.Scanner;

public class PC {
    private String MaMay;
    private String TenMay;
    private String Tinh_trang;

    public PC() {

    }

    public PC(String MaMay, String TenMay, String Tinh_trang) {
        this.MaMay = MaMay;
        this.TenMay = TenMay;
        this.Tinh_trang = Tinh_trang;
    }

    public String getMaMay() {
        return MaMay;
    }

    public void setMaMay(String MaMay) {
        this.MaMay = MaMay;
    }

    public String getTenMay() {
        return TenMay;
    }

    public void setTenMay(String TenMay) {
        this.TenMay = TenMay;
    }

    public String getTinh_trang() {
        return Tinh_trang;
    }

    public void setTinh_trang(String Tinh_trang) {
        this.Tinh_trang = Tinh_trang;
    }

    public void Input(Scanner scan) {
        System.out.print("\tMa may: ");
        MaMay = scan.nextLine();
        System.out.print("\tTen may: ");
        TenMay = scan.nextLine();
        System.out.print("\tTinh trang may: ");
        Tinh_trang = scan.nextLine();
    }

    public void Output(){
        System.out.println("\tMa may:"+MaMay);
        System.out.println("\tTen may:"+TenMay);
        System.out.println("\tTinh trang may: "+ Tinh_trang);
    }
}
