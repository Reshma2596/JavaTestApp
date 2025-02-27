package oops;

class PersonOne {
 protected String name;
 protected int age;


 public PersonOne(String name, int age) {
     this.name = name;
     this.age = age;
 }

 
 public void displayPersonOneDetails() {
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
 }
}


class EmployeeOne extends PersonOne {
 private int employeeID;
 private double salary;

 
 public EmployeeOne(String name, int age, int employeeID, double salary) {
     super(name, age); 
     this.employeeID = employeeID;
     this.salary = salary;
 }

 
 public void displayEmployeeOneDetails() {
     super.displayPersonOneDetails(); 
     System.out.println("Employee ID: " + employeeID);
     System.out.println("Salary: $" + salary);
 }
}


public class EmployeeMain {
 public static void main(String[] args) {
     
     EmployeeOne emp = new EmployeeOne("Reshma Rakesh", 30, 101, 75000);
     
     
     System.out.println("Employee Details:");
     emp.displayEmployeeOneDetails();
 }
}
