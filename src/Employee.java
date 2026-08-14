public class Employee {
    private static int counter = 1;

    private final int id;
    private String fullName;
    private double sallary;
    private int department;

    public Employee(String fullName, double sallary, int department) {
        this.id = counter++;
        this.fullName = fullName;
        this.sallary = sallary;
        this.department = department;
    }

    // Создание геттеров для всеъ полей и сеттеров для полей отдела и зарплаты
    public int getId() {
        return this.id;
    }
    public String getFullName() {
        return this.fullName;
    }
    public int getDepartment() {
        return this.department;
    }
    public double getSallary() {
        return this.sallary;
    }
    public void setDepartment(int department) {
        this.department = department;
    }
    public void setSallary(double sallary) {
        this.sallary = sallary;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Employee employee = (Employee) o;
        return Double.compare(employee.sallary, sallary) == 0;
    }

    public String toString() {
        return "ID номер - " + this.id + " . ФИО - " + this.fullName + " , зарплата - " + this.sallary + ". Отдел - "
                + this.department + ".";
    }

    public void printShortInfo() {
        System.out.println(fullName + " " + sallary);
    }

}
