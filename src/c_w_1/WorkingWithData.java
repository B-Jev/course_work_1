package c_w_1;

public class WorkingWithData {
    private Employee[] employees;

    public WorkingWithData() {
        this.employees = new Employee[10];
    }

    public void creatingEmployeeData(String thisFullName, long thisSalary, int thisDepartmentNumber) {
        Employee newEmployee = new Employee(thisFullName, thisSalary, thisDepartmentNumber);
        employees[Employee.id++] = newEmployee;
    }

    public void printAllEmployee() {
        for (int i = 0; i < Employee.id; i++) {
            Employee employee = employees[i];
            Employee.employeeNumber = i + 1;
            System.out.println(employee);
        }
    }

    public void amountOfSalaries() {
        for (int i = 0; i < Employee.id; i++) {
            Employee.amountOfSalaries += employees[i].getSalary();
        }
        System.out.println("Сумма зарплат - " + Employee.amountOfSalaries);
    }

    public void averageMonthlySalary() {
        for (int i = 0; i < Employee.id; i++) {
            Employee.averageMonthlySalary += employees[i].getSalary();
        }
        System.out.println("Средняя зарплата - " + Employee.averageMonthlySalary / Employee.id);
    }

    public void minMonthlySalaryaries() {
        long minMonthlySalaryaries = employees[0].getSalary();
        for (int i = 0; i < Employee.id; i++) {
            if (minMonthlySalaryaries > employees[i].getSalary()) {
                minMonthlySalaryaries = employees[i].getSalary();
            }
        }
        System.out.println("Минимальная зарплата - " + minMonthlySalaryaries);
    }

    public void maxMonthlySalaryaries() {
        long maxMonthlySalaryaries = employees[0].getSalary();
        for (int i = 0; i < Employee.id; i++) {
            if (maxMonthlySalaryaries < employees[i].getSalary()) {
                maxMonthlySalaryaries = employees[i].getSalary();
            }
        }
        System.out.println("Максимальная зарплата - " + maxMonthlySalaryaries);
    }

    public void printAllFullName() {
        String printAllFullName;
        for (int i = 0; i < Employee.id; i++) {
            printAllFullName = employees[i].getFulName();
            System.out.println(printAllFullName);
        }
    }

}
