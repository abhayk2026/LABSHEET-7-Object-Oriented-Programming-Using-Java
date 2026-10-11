package company.employees;
public class Employee {
    private final int id;
    private final String name;
    public Employee(int id, String name) { this.id = id; this.name = name; }
    public void display() { System.out.println("Employee ID: " + id + ", Name: " + name); }
}
