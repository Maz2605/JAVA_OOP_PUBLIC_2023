package Class;

import java.util.Scanner;

public class Student {
    private String Name;
    private String Lop;
    private double Score;
    private Faculty y = new Faculty();

    public Student(){

    }
    public Student(String Name, String Lop, double Score, Faculty y){
        this.Name = Name;
        this.Lop = Lop;
        this.Score = Score;
        this.y = y;
    }
    public String getName() {
        return this.Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getLop(){
        return Lop;
    }

    public void setClass(String Lop) {
        this.Lop = Lop;
    }

    public double getScore() {
        return Score;
    }

    public void setScore(double Score) {
        this.Score = Score;
    }

    public Faculty getY() {
        return this.y;
    }

    public void setY(Faculty y) {
        this.y = y;
    }
    public void Input(Scanner scan){
        scan.nextLine();
        System.out.print("Name: ");
        Name = scan.nextLine();
        System.out.print("Class: ");
        Lop = scan.nextLine();
        y.Input(scan);
        System.out.print("Score: ");
        Score = scan.nextDouble();
    }
    public void Output(){
        System.out.println("Name: "+Name);
        System.out.println("Class:  "+Lop);
        y.Output();
        System.out.println("Score: "+Score);
    }

}
