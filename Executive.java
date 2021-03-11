public class Executive extends Manager {

    // Constructor
    public Executive(String name, String department) {
        super(name, department);
    }

    // Overridden method toString()
    public String toString() {
        return "Executive Manager " + getName() + " of " + getDepartment() + " with salary of " + getSalary();
    }

}