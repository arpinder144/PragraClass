package dec02.oops;

public class Employee {
    String name;
    String employeeId;
    String role;
    double salary;
    String email;

    public Employee() {
    }

    public Employee(String name, String employeeId, String role, double salary, String email) {
        this.name = name;
        this.employeeId = employeeId;
        this.role = role;
        this.salary = salary;
        this.email = email;
    }

    public void showDetails(){
        System.out.println(name);
        System.out.println(employeeId);
        System.out.println(role);
        System.out.println(salary);
        System.out.println(email);
    }

}
class Manager extends Employee{
    String department;

    public Manager(String department) {
        this.department = department;
    }

    public void showManagerDetails(){
        //showDetails();
        System.out.println(department);
    }
}

class Main{
    public static void main(String[] args) {
        Employee obj1=new Employee("Arpinder","80360","Developer",2000.0,"arpinder144");
        obj1.showDetails();
        Manager obj2=new Manager("Production");
        obj2.showManagerDetails();
    }
}
