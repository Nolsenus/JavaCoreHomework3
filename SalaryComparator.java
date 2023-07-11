import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        if (e1 == e2) return 0;
        return e1.getSalary() - e2.getSalary();
    }
}
