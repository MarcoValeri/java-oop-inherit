public class EmployeeTest {
    
    public static void main(String[] args) {

        Employee e = new Employee("John");
        e.setSalary(30000);
        System.out.println(e);

        Employee m = new Manager("Kate", "HR");
        m.setSalary(40000);
        System.out.println(m);

        Employee x = new Executive("Wendy", "PR");
        x.setSalary(50000);
        System.out.println(x);
    }

}
