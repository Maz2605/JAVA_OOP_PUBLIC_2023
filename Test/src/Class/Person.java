package Class;

import java.util.Scanner;

public class Person {
    private String name;
    private int age;
    private String gender;

    public Person() {

    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public void Input(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Name: ");
        setName(scan.nextLine());
        System.out.print("Age: ");
        setAge(scan.nextInt());
        scan.nextLine();
        System.out.print("Gender: ");
        setGender(scan.nextLine());
    }
    public void Output(){
        System.out.println("Name: "+getName());
        System.out.println("Age: "+getAge());
        System.out.println("Gender: "+getGender());
    }
}
