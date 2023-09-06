package test;

import java.util.Scanner;
import Class.Classroom;

public class Bai_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Classroom classroom = new Classroom();
        classroom.Input();
        classroom.Output();
        System.out.println("Name: ");
        classroom.searchByName(scan.nextLine());
        scan.close();
    }
}
