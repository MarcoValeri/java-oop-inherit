public class Manager extends Employee {
    // Instances variables
    private String department;

    // Constructor
    public Manager(String name, String department) {
        super(name);
        this.department = department;
    }

    // Set getter
    public String getDepartment() {
        return department;
    }

    // Set setter
    public String setDepartment(String addDepartment) {
        department = addDepartment;
        return department;
    }

    // Overridden method toString()
    public String toString() {
        return "Manager " + getName() + " of " + department + " with salary of " + getSalary();
    }

}