package Class;

import java.util.Scanner;


public class Hang {

    private String MaHang, TenHang;
    private NSX X = new NSX();
    
    public Hang(){
        
    }

    public Hang(String MaHang, String TenHang, NSX X) {
        this.MaHang = MaHang;
        this.TenHang = TenHang;
        this.X = X;
    }

    public String getMaHang() {
        return MaHang;
    }

    public void setMaHang(String MaHang) {
        this.MaHang = MaHang;
    }

    public String getTenHang() {
        return TenHang;
    }

    public void setTenHang(String TenHang) {
        this.TenHang = TenHang;
    }

    public NSX getX() {
        return X;
    }

    public void setX(NSX X) {
        this.X = X;
    }
    public void Input(){
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Ma Hang: ");
            MaHang = scan.nextLine();
            System.out.print("Ten Hang: ");
            TenHang = scan.nextLine();
            System.out.println("NSX");
            X.Input();
        }
    }
    public void Output(){
        System.out.println();
        System.out.println("Ma hang: "+ MaHang);
        System.out.println("Ten Hang: "+ TenHang);
        System.out.println("NSX");
        X.Output();
    }
}
