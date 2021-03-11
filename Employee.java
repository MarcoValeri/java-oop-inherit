public class Employee {
    // Instance variables
    private String name;
    private double salary;

    // Set the constructor with one parameter
    public Employee(String name) {
        this.name = name;
    }

    // Set the getters
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // Set the setter for salary
    public double setSalary(double addSalary) {
        salary = addSalary;
        return salary;
    }

    // Overridden method toString()
    public String toString() {
        return name + " " + salary;
    }

}