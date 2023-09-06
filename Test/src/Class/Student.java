package Class;

import java.util.Scanner;

public class Student extends Person{
    private int id;
    private Address address = new Address();
    private double gpa;

    public Student(){

    }
    public Student(String name, int age, String gender, int id, Address address, double gpa) {
        super(name, age, gender);
        this.id = id;
        this.address = address;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public void Input(){
        Scanner scan =new Scanner(System.in);
        super.Input();
        System.out.print("ID: ");
        setId(scan.nextInt());
        scan.nextLine();
        System.out.println("Address: ");
        address.Input();
        System.out.print("GPA: ");
        setGpa(scan.nextDouble());
    }
    public void Output(){
        super.Output();
        System.out.println("ID: "+getId());
        System.out.println("Address: ");
        address.Output();
        System.out.println("GPA: "+getGpa());
    }
}
