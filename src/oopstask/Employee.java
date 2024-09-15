package oopstask;

public class Employee {
	private int id;
	private String name;
	private double salary;
	
public Employee(int id, String name, double salary) {
	this.id=id;
	this.name=name;
	this.salary=salary;
}
public int getid() {
	return id;
}
public String getname() {
	return name;
	
}
public double getsalary() {
	return salary;
	}
public void raiseSalary(double percent) {
    if (percent > 0) {
    double increase = salary * percent / 100;
    salary += increase;
    }else {
    	System.out.println("Percentage must be positive");
    }
}
public String toString() {
	return "Employee[ID: " + id + ", Name: " + name + ", Salary: " + salary + "]";

}
public static void main(String[] args) {
	
    Employee emp = new Employee(001, "Sam",2000);
	System.out.println(emp);
	
	emp.raiseSalay(10);
	
	
}
private void raiseSalay(int i) {

	
}

}


