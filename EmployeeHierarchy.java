class Employee {
    private String name;
    private int employeeId;

    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Employee ID: " + employeeId);
    }
}

class Manager extends Employee {
    private String department;

    public Manager(String name, int employeeId, String department) {
        super(name, employeeId);
        this.department = department;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }
}

class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, int employeeId, String programmingLanguage) {
        super(name, employeeId);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

class Salesperson extends Employee {
    private String area;

    public Salesperson(String name, int employeeId, String area) {
        super(name, employeeId);
        this.area = area;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("area: " +area);
    }
}

public class EmployeeHierarchy {
    public static void main(String[] args) {
        Employee[] employees = {
            new Manager("Rajendar", 624, "Technical"),
            new Developer("Sumadeep", 781, "Java"),
            new Salesperson("Charan", 779, "Tharamani")
            
        };

        for (Employee employee : employees) {
            employee.displayInfo();
            System.out.println();
        }
    }
}
