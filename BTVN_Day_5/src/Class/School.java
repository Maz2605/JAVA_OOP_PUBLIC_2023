package Class;

public class School {
    private String Name;
    private String Date;
    
    public School(){
        
    }
    public School(String Name, String Date){
        this.Name = Name;
        this.Date = Date;
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
}
