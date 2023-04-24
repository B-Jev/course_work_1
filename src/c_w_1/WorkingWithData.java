package c_w_1;

public class WorkingWithData {
    private Employee[] employees;

    public WorkingWithData() {
        this.employees = new Employee[10];
    }

    public void creatingEmployeeData(String thisFullName, long thisSalary, int thisDepartmentNumber) {
        Employee newEmployee = new Employee(thisFullName, thisSalary, thisDepartmentNumber);
        employees[Employee.getId()] = newEmployee;
    }

    public void printAllEmployee() {
        for (Employee e : employees) {
            System.out.println(e);
        }
    }

    public void amountOfSalaries() {
        for (Employee e : employees) {
            Employee.amountOfSalaries += e.getSalary();
        }
        System.out.println("Сумма зарплат - " + Employee.amountOfSalaries);
    }

    public void averageMonthlySalary() {
        for (Employee e : employees) {
            Employee.averageMonthlySalary += e.getSalary();
        }
        System.out.println("Средняя зарплата - " + Employee.averageMonthlySalary / Employee.getId());
    }

    public void minMonthlySalaryaries() {
        long minMonthlySalaryaries = employees[0].getSalary();
        for (Employee e : employees) {
            if (minMonthlySalaryaries > e.getSalary()) {
                minMonthlySalaryaries = e.getSalary();
            }
        }
        System.out.println("Минимальная зарплата - " + minMonthlySalaryaries);
    }

    public void maxMonthlySalaryaries() {
        long maxMonthlySalaryaries = employees[0].getSalary();
        for (Employee e : employees) {
            if (maxMonthlySalaryaries < e.getSalary()) {
                maxMonthlySalaryaries = e.getSalary();
            }
        }
        System.out.println("Максимальная зарплата - " + maxMonthlySalaryaries);
    }

    public void printAllFullName() {
        String printAllFullName;
        for (Employee e : employees) {
            printAllFullName = e.getFulName();
            System.out.println(printAllFullName);
        }
    }

}
