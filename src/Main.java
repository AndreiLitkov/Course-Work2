//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Employee person1 = new Employee("Василенко Василий Васильевич", 150000, 1);
        Employee person2 = new Employee("Кравец Анатолий Петрович", 270000, 2);
        Employee person3 = new Employee("Кириленко Артем Альбертович", 460000, 2);
        Employee person4 = null;
        Employee person5 = new Employee("Красенко Богдан Максимович", 120000, 4);
        Employee person6 = new Employee("Бор Андрей Арсеньевич", 510000, 5);
        Employee person7 = new Employee("Максимец Валерия Ивановна", 115000, 4);
        Employee person8 = new Employee("Добрая Кристина Андреевна", 620000, 5);
        Employee person9 = null;

        EmployeeBook employeeBook = new EmployeeBook();

        employeeBook.addEmployeeToList(person1);
        employeeBook.addEmployeeToList(person2);
        employeeBook.addEmployeeToList(person3);
        employeeBook.addEmployeeToList(person4);
        employeeBook.addEmployeeToList(person5);
        employeeBook.addEmployeeToList(person6);
        employeeBook.addEmployeeToList(person7);
        employeeBook.addEmployeeToList(person8);
        employeeBook.addEmployeeToList(person9);
        employeeBook.printAllEmployees();
        System.out.println(" ");

        employeeBook.getAverageSallary();
        System.out.println(" ");

        employeeBook.printTaxes("PROPORTIONAL");
        System.out.println(" ");
        employeeBook.printTaxes("PROGRESSIVE");
        System.out.println(" ");

        employeeBook.sallaryIndexingByDepartment(2, 5);
        employeeBook.sallaryIndexingByDepartment(5, 7);
        System.out.println(" ");

        employeeBook.findFirstEmployee(1, 10000);
        employeeBook.findFirstEmployee(5, 600000);
        System.out.println(" ");

        employeeBook.findFirstEmployeesBySallary(300000, 3);
        System.out.println(" ");

        boolean has = employeeBook.hasEmployee(person4);
        System.out.println("Есть такой сотрудник? - " + has);

        employeeBook.findEmployeeById(5);
    }
}