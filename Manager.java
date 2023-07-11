public class Manager extends Employee {
    public Manager(String fio, String position, String phone, int salary, int age) {
        super(fio, position, phone, salary, age);
    }

    public Manager(String fio, String phone, int salary, int age) {
        super(fio, "Руководитель", phone, salary, age);
    }

    public static void raiseSalary(Employee[] employees, int salaryIncrease, int minAge) {
        for (Employee employee : employees) {
            if (!(employee instanceof Manager) && employee.getAge() >= minAge) {
                employee.setSalary(employee.getSalary() + salaryIncrease);
            }
        }
    }
}
