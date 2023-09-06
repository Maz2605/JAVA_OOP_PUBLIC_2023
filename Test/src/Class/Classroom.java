package Class;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Classroom {
    private int classId;
    private int numberOfStudent;
    private ArrayList<Student> listStudent = new ArrayList <Student>();

    public Classroom() {

    }

    public Classroom(int classId, int numberOfStudent, ArrayList<Student> listStudent) {
        this.classId = classId;
        this.numberOfStudent = numberOfStudent;
        this.listStudent = listStudent;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public int getNumberOfStudent() {
        return numberOfStudent;
    }

    public void setNumberOfStudent(int numberOfStudent) {
        this.numberOfStudent = numberOfStudent;
    }

    public ArrayList<Student> getListStudent() {
        return listStudent;
    }

    public void setListStudent(ArrayList<Student> listStudent) {
        this.listStudent = listStudent;
    }
    public void Input(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Class ID: ");
        setClassId(scan.nextInt());
        System.out.print("Number of student: ");
        setNumberOfStudent(scan.nextInt());
        System.out.println("List Student: ");

        for(int i=0;i<getNumberOfStudent();i++){
            System.out.println("STT: "+(i+1));
            Student student =new Student();
            student.Input();
            listStudent.add(student);
        }
    }
    public void Output(){
        System.out.println("-----------------------------------------------------");
        System.out.println("Class ID: "+getClassId());
        System.out.println("Number of student: " +getNumberOfStudent());
        System.out.println("List Student");
        for(Student i : listStudent){
            int j=1;
            System.out.println("STT: "+j);
            i.Output();
            j++;
        }
    }
    public void searchByName(String Ten){
        for(Student i : listStudent){
            if(i.getName()==Ten){
                i.Output();
            }
        }
    }
}
