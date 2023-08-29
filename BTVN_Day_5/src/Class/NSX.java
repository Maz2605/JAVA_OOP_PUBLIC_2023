package Class;

import java.util.Scanner;

public class NSX {
    private String MaNSX, TenNSX, DcNSX;

    public NSX() {

    }

    public NSX(String MaNSX, String TenNSX, String DcNSX) {
        this.MaNSX = MaNSX;
        this.TenNSX = TenNSX;
        this.DcNSX = DcNSX;
    }

    public String getMaNSX() {
        return MaNSX;
    }

    public void setMaNSX(String MaNSX) {
        this.MaNSX = MaNSX;
    }

    public String getTenNSX() {
        return TenNSX;
    }

    public void setTenNSX(String TenNSX) {
        this.TenNSX = TenNSX;
    }

    public String getDcNSX() {
        return DcNSX;
    }

    public void setDcNSX(String DcNSX) {
        this.DcNSX = DcNSX;
    }

    public void Input() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ma NSX: ");
        MaNSX = scan.nextLine();
        System.out.print("Ten NSX: ");
        TenNSX = scan.nextLine();
        System.out.print("Dia chi NSX: ");
        DcNSX = scan.nextLine();
        scan.close();
    }

    public void Output() {
        System.out.println("Ma NSX: " + MaNSX);
        System.out.println("Ten NSX: " + TenNSX);
        System.out.println("Dia chi NSX: " + DcNSX);
    }
}
