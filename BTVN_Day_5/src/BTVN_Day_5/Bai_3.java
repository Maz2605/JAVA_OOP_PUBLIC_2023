package BTVN_Day_5;

import java.util.Scanner;

import Class.PC_Room;

public class Bai_3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        PC_Room X = new PC_Room();
        X.Input(scan);
        X.Output();
        scan.close(); 
    }
}
