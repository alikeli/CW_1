import java.util.Objects;
public class Employee {
    private String FIO;
    private int department;
    private double salary;
    private final int Id;
    static int countId = 1;

    public Employee(String FIO, int department, double salary) {
        this.FIO = FIO;
        this.department = department;
        this.salary = salary;
        this.Id = countId++;
    }
    public String getFIO() {
        return this.FIO;
    }
    public int getDepartment() {
        return this.department;
    }
    public double getSalary() {
        return this.salary;
    }

    public int getId() {
        return Id;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ФИО'" + FIO + '\'' +
                ", Отдел =" + department +
                ", Зарплата =" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department && Double.compare(employee.getSalary(), getSalary()) == 0 && FIO.equals(employee.FIO);
    }

    @Override
    public int hashCode() {
        return Objects.hash(FIO, department, getSalary());
    }
}

