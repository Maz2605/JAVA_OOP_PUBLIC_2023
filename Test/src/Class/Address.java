package Class;

import java.util.Scanner;

public class Address {
    private String city;
    private String district;

    public Address() {

    }

    public Address(String city, String district) {
        this.city = city;
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }
    public void Input(){
        Scanner scan = new Scanner(System.in);
        System.out.print("\tCity: ");
        setCity(scan.nextLine());
        System.out.print("\tDistrict: ");
        setDistrict(scan.nextLine());
    }
    public void Output(){
        System.out.println("\tCity: "+getCity());
        System.out.println("\tDistrict: "+getDistrict());
    }
}
