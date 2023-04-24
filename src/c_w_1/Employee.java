package c_w_1;

public class Employee {

    private String fullName;
    private long salary;
    private int departmentNumber;
    static int employeeNumber;
    static int id;
    static long amountOfSalaries = 0;
    static double averageMonthlySalary = 0;


    public Employee(String fulName, long salary, int departmentNumber) {
        this.salary = salary;
        this.departmentNumber = departmentNumber;
        this.fullName = fulName;
    }

    public String getFulName() {
        return fullName;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public long getSalary() {
        return salary;
    }

    public void setDepartmentNumber(int departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public void setFulName(String fulName) {
        this.fullName = fulName;
    }

    public String toString() {
        return "id - " + employeeNumber + ". Ф.И.О - " + this.fullName + ". Зарплата - " + this.salary + ". Отдел нр. - " + this.departmentNumber;
    }

}
