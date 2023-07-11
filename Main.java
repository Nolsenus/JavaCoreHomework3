import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[] {
                new Employee("Employee1", "Clerk", "123", 10000, 26),
                new Employee("Employee3", "Clerk", "124", 18000, 28),
                new Employee("Employee4", "Senior Clerk", "125", 18000, 29),
                new Employee("Employee2", "Security Guard", "126", 15000, 36),
                new Manager("Manager1", "127", 22000, 32)
        };
        for (Employee employee : employees) {
            System.out.println(employee.displayInfo());
        }
        Manager.raiseSalary(employees, 2000, 29);
        System.out.println('\n');
        for (Employee employee : employees) {
            System.out.println(employee.displayInfo());
        }
        Arrays.sort(employees, new SalaryComparator());
        System.out.println('\n');
        for (Employee employee : employees) {
            System.out.println(employee.displayInfo());
        }
        Arrays.sort(employees, new AgeComparator());
        System.out.println('\n');
        for (Employee employee : employees) {
            System.out.println(employee.displayInfo());
        }
    }
}
