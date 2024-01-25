package employee;

/**
 * Student: Daniel Barbu: 20024094
 * Application: Employee
 * Description: Employee class provides description details of employee
 * Version: 1.0
 * Date: 25/01/2023
 * Module: Software Development: Programming Foundations
 *
 * @author 20024094
 */


public class Employee {
    
    private String name;
    private int age;
    private double salary;
    private String location;
    
    public Employee(String name, int age, double salary, String location) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.location = location;
    }
    
    // below it is attributed to encapsulation, applying getters and setters
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public double getSalary() {
        return salary;
    }
    
    public void setLocation(String location) {
        this.location = location;
    }
    
    public String getLocation() {
        return location;
    }
    
    // method created raiseSalary raising the salary whenver this method is applied
    private void raiseSalary() {
        String employeeMsgSuccessful = "success";
        double employeeProdSuccessful = salary + 10.00;
        
        if (employeeProdSuccessful <= 10.05 && employeeMsgSuccessful.equals("success")) {
            salary++;
            System.out.println("This employee, worked hard needs a raise of salary");
        } else {
            System.out.println("Employee is still working, but not hard enough to raise salary");
        }
    }
    
}
