public class Main {
    public static void main(String[] args) {
        bookOfEmployee bookOfEmployee = new bookOfEmployee();
        bookOfEmployee.createEmployee("ФИО 1", 5, 2500);
        bookOfEmployee.createEmployee("ФИО 1", 5, 2500);
        bookOfEmployee.createEmployee("ФИО 1", 5, 2500);
        bookOfEmployee.createEmployee("ФИО 1", 5, 2500);
        bookOfEmployee.createEmployee("ФИО 1", 5, 500);
        bookOfEmployee.createEmployee("ФИО 1", 5, 2500);
        bookOfEmployee.createEmployee("ФИО 1", 5, 2500);
        bookOfEmployee.createEmployee("ФИО 1", 5, 2500);

        bookOfEmployee.printAllInformationAboutEmployees();
        System.out.println();
        System.out.println("CurrentSize = " + bookOfEmployee.getCurrentSize());

        bookOfEmployee.PrintMaxSalary();
        bookOfEmployee.isPrintMinSalary();
        bookOfEmployee.PrintAmountOfSalaryInMonth();
        bookOfEmployee.PrintAverageOfSalaryInMonth();
    }

}
