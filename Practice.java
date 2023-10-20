class Employee{
    private String name;
    private int employeeId;

    public Employee(String name,int employeeId){
        this.name=name;
        this.employeeId=employeeId;

    }

    public void displayInfo(){
        System.out.println("name : "+name+"employeeId : "+employeeId);
    }

}

class Manager extends Employee{
    private String Department;

    public Manager(String name, int employeeId , String Department){
        super(name,employeeId);
        this.Department=Department;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Department : "+Department);
    }

}

class Developer extends Employee{
    private String programmingLanguage;

    public Developer(String name,int employeeId, String programmingLanguage){
        super(name,employeeId);
        this.programmingLanguage=programmingLanguage;
        
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("programmingLanguage : "+programmingLanguage );
    }

}

class Salesperson extends Employee{
    private String area;

    public Salesperson(String name,int employeeId,String area){
        super(name,employeeId);
        this.area=area;

    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("area"+area);
    }

}

public class Practice{
    public static void main(String[] args) {
        Employee emp1=new Manager("rajendar", 721, "Tecnical");
        emp1.displayInfo();

        Employee emp2=new Developer("deep", 781, "java");
        emp2.displayInfo();

        Employee emp3=new Salesperson("charan", 100, "Tharamani");
        emp3.displayInfo();
     
    
    
    }
}