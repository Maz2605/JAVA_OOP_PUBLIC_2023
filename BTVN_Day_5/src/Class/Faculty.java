package Class;

import java.util.Scanner;

public class Faculty {
    private String Name;
    private String Date;
    private School x = new School();
    
    public Faculty(){
    
    }
    public Faculty(String Name, String Date, School x){
        this.Name = Name;
        this.Date = Date;
        this.x = x;
    }
    public String getName() {
        return this.Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getDate() {
        return this.Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public School getX() {
        return this.x;
    }

    public void setX(School x) {
        this.x = x;
    }
    public void Input(Scanner scan){
        
        System.out.print("Faculty: ");
        Name = scan.nextLine();
        System.out.print("Faculty Date: ");
        Date = scan.nextLine();
        System.out.print("School: ");
        x.setName(scan.nextLine());
        System.out.print("School Date: ");
        x.setDate(scan.nextLine());
       
    }
    public void Output(){
        System.out.println("Faculty: "+Name);
        System.out.println("Faculity Date: "+Date);
        System.out.println("School:  "+x.getName());
        System.out.println("School Date: "+x.getDate());
    }


}
