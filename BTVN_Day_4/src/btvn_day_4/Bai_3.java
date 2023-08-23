package btvn_day_4;

import java.util.Scanner;

class SV {

    private String MSV, name;
    private float toan, ly, hoa;

    public SV() {

    }

    public SV(String MSV, String name, float toan, float ly, float hoa) {
        this.MSV = MSV;
        this.name = name;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }

    public String getMSV() {
        return MSV;
    }

    public void setMSV(String MSV) {
        this.MSV = MSV;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getToan() {
        return toan;
    }

    public void setToan(float toan) {
        this.toan = toan;
    }

    public float getLy() {
        return ly;
    }

    public void setLy(float ly) {
        this.ly = ly;
    }

    public float getHoa() {
        return hoa;
    }

    public void setHoa(float hoa) {
        this.hoa = hoa;
    }

    public float Diem_tb() {
        return (toan + ly + hoa) / 3;
    }

    public void Input() {
        Scanner scan = new Scanner(System.in);
        System.out.print("MSV: ");
        MSV = scan.next();
        System.out.print("Ho va ten: ");
        name = scan.next();
        System.out.print("Diem toan: ");
        toan = scan.nextFloat();
        System.out.print("Diem Ly: ");
        ly = scan.nextFloat();
        System.out.print("Diem Hoa: ");
        hoa = scan.nextFloat();
    }

    public void Output() {
        System.out.printf("%-20s %-20s %-10f %-10f %-10f %-10f \n", MSV, name, toan, ly, hoa, Diem_tb());
    }
}

public class Bai_3 {

    public static void main(String[] args) {
        SV arr[] = new SV[2];
        for (int i = 0; i < 2; i++) {
            System.out.println("Sinh vien thu " + (i + 1) + " :");
            arr[i] = new SV();
            arr[i].Input();
        }
        System.out.printf("%-20s %-20s %-10s %-10s %-10s %-10s \n", "MSV", "Ho va ten", "Toan", "Ly", "Hoa", "Diem tb");
        for (SV i : arr) {
            i.Output();
        }
    }

}