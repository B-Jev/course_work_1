package c_w_1;

public class Main {

    public static void main(String[] args) {
        WorkingWithData workingWithData = new WorkingWithData();

        workingWithData.creatingEmployeeData("Иванов Л.В.", 120645, 2);
        workingWithData.creatingEmployeeData("Петров П.Р.", 127049, 1);
        workingWithData.creatingEmployeeData("Андреев С.Н.", 120969, 3);
        workingWithData.creatingEmployeeData("Васильев И.П.", 120949, 4);
        workingWithData.creatingEmployeeData("Андреев И.С.", 120899, 5);
        workingWithData.creatingEmployeeData("Владимиров Д.К.", 134099, 1);
        workingWithData.creatingEmployeeData("Сидоров И.Е.", 125099, 2);
        workingWithData.creatingEmployeeData("Исаев Т.П.", 190099, 2);
        workingWithData.creatingEmployeeData("Иванова Е.В.", 160059, 4);
        workingWithData.creatingEmployeeData("Сазонова А.С.", 120580, 5);

        workingWithData.printAllEmployee();
        System.out.println();
        workingWithData.amountOfSalaries();
        workingWithData.averageMonthlySalary();
        System.out.println();
        workingWithData.printAllFullName();
        System.out.println();
        workingWithData.minMonthlySalaryaries();
        workingWithData.maxMonthlySalaryaries();
        System.out.println();

    }
}