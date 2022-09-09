import java.util.Arrays;
public class bookOfEmployee {
    private final Employee[] employees;
    private int size;
    public bookOfEmployee() {
        this.employees = new Employee[10];
    }
    public void createEmployee(String FIO, int department, double salary) {
        Employee newEmployee = new Employee(FIO, department, salary);
        employees[size++] = newEmployee;
        for (int i = 0; i < size; i++) {
            if (employees[i] == null) {
                employees[i] = newEmployee;
            }
        }
    }
    public void printAllInformationAboutEmployees() {
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            System.out.println(employee.getId() + "," + employee.getFIO() + "," + employee.getDepartment() + " " + employee.getSalary());
        }
    }
    public int getCurrentSize() {
        return size;
    }

    public void PrintMaxSalary() {
        double maxSalary = 0;
        for (int i = 0; i < size; i++) {
            if (employees[i].getSalary() > maxSalary) {
                maxSalary = employees[i].getSalary();
            }
        }
        System.out.printf("Максимальная зароботная плата %s  рублей.\n", maxSalary);
    }
    public void isPrintMinSalary() {
        double minSalary = employees[0].getSalary();
        for (int i = 1; i < size; i++) {
            if (employees[i].getSalary() < minSalary) {
                minSalary = employees[i].getSalary();
            }
        }
        System.out.printf("Минимальная зароботная плата %s рублей.\n", minSalary);
    }
    public void PrintAmountOfSalaryInMonth() {
        double sumSalary = employees[0].getSalary();
        for (int i = 1; i < size; i++) {
            sumSalary = sumSalary + employees[i].getSalary();
        }
        System.out.printf("Сумма трат на зарплаты за месяц составила %s рублей.\n", sumSalary);
    }
    public void PrintAverageOfSalaryInMonth() {
        double sumSalary = employees[0].getSalary();
        for (int i = 1; i < size; i++) {
            sumSalary = sumSalary + employees[i].getSalary();

        }
        double averageSum = (double) sumSalary / size;
        System.out.printf("Средняя сумма зарплат за месяц составила %s рублей.\n", averageSum);
    }
    @Override
    public String toString() {
        return "bookOfEmployee{" +
                "employees=" + Arrays.toString(employees) +
                ", size=" + size +
                '}';
    }
}
