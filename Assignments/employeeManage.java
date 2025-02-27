

abstract class Employee {
    protected String name;
    protected int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    
    public abstract double calculateSalary();

    public void displayInfo() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}


class FullTimeEmp extends Employee {
    private double monthlySalary;

    public FullTimeEmp(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}


class PartTimeEmp extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmp(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}


public class employeeManage {
    public static void main(String[] args) {
        Employee fullTime = new FullTimeEmp("Alice", 101, 5000);
        Employee partTime = new PartTimeEmp("Bob", 102, 20, 80);

        fullTime.displayInfo();
        System.out.println("Salary: " + fullTime.calculateSalary());
        
        partTime.displayInfo();
        System.out.println("Salary: " + partTime.calculateSalary());
    }
}
