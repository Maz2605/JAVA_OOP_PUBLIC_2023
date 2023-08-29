package Class;

import java.util.Scanner;

public class Quan_ly {
    private String Ma_QL;
    private String Ho_ten;

    

    public Quan_ly(){

    }
    public Quan_ly(String Ma_QL, String Ho_ten){
        this.Ho_ten  = Ho_ten;
        this.Ma_QL = Ma_QL;
    }
    public String getMa_QL() {
        return Ma_QL;
    }

    public void setMa_QL(String Ma_QL) {
        this.Ma_QL = Ma_QL;
    }

    public String getHo_ten() {
        return Ho_ten;
    }

    public void setHo_ten(String Ho_ten) {
        this.Ho_ten = Ho_ten;
    }
    public void Input(Scanner scan){
        System.out.print("\tMa quan ly: ");
        Ma_QL  = scan.nextLine();
        System.out.print("\tHo va ten quan ly: ");
        Ho_ten = scan.nextLine();;
    }
    public void Output(){
        System.out.println("\tMa quan ly: "+Ma_QL);
        System.out.println("\tHo va ten quan ly: "+Ho_ten);
    }

}
