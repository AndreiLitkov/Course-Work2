public class EmployeeBook {
    private final Employee[] employees = new Employee[10];

    public Employee[] getEmployees() {
        return employees;
    }

    public void printAllEmployees() {
        for (Employee emp : employees) {
            if (emp != null) {
                System.out.println(emp);
            }
        }
    }

    public void getAverageSallary() {
        double averageSallary = 0;
        int count = 0;
        for (Employee emp : employees) {
            if (emp != null) {
                averageSallary += emp.getSallary();
                count++;
            } else {
                System.out.println(averageSallary / count);
                break;
            }
        }
    }

    public void printTaxes(String taxType) {
        for (Employee emp : employees) {
            if (emp == null) continue;
            double sallary = emp.getSallary();
            double tax = 0;
            switch(taxType) {
                case "PROPORTIONAL" -> {
                    tax = sallary * 0.13;
                    break;
                }
                case "PROGRESSIVE" -> {
                    if (sallary <= 150_000) {
                        tax = sallary * 0.13;
                    }else if (sallary <= 350_000) {
                        tax = sallary * 0.17;
                    }else if (sallary > 350_000) {
                        tax = sallary * 0.21;
                    }
                }
                default -> {
                    break;
                }
            }
            System.out.println(emp.getFullName() + " - налог: " + tax);
        }
    }

    public void sallaryIndexingByDepartment(int department, double percent) {
        for (Employee emp : employees) {
            if (emp == null) {
                continue;
            }
            if (emp.getDepartment() != department) {
                continue;
            }
            double currentSallary = emp.getSallary();
            double newSallary = currentSallary * (1 + percent / 100);
            if (Double.compare(currentSallary, newSallary) == 0) {
                continue;
            }
            emp.setSallary(newSallary);
            System.out.println(emp.getSallary());
        }
    }

    public void findFirstEmployee(int department, double salary) {
        for (Employee emp : employees) {
            if (emp != null && emp.getSallary() > salary) {
                emp.printShortInfo();
                break;
            }
            }
        }

    public void findFirstEmployeesBySallary(double wage, int employeeNumber) {
        for (Employee emp : employees) {
            int count = 0;
            int i = 0;
            while (count < employeeNumber && i < employees.length) {
                if(employees[i] == null) break;
                if (employees[i].getSallary() < wage) {
                    employees[i].printShortInfo();
                    count++;
                    if( count == employeeNumber) break;
                }
                i++;
            }
            break;
        }
    }

    public boolean hasEmployee(Employee employee) {
        for (Employee emp : employees) {
            if (emp != null && emp.equals(employee)) {
                return true;
            }
        }
        return false;
    }
    public boolean addEmployeeToList( Employee newEmployee) {
        if(newEmployee == null) return false;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = newEmployee;
                return true;
            }
        }
        return false;
    }

    public String findEmployeeById(int id) {
        for (Employee emp : employees) {
            if (emp != null && emp.getId() == id) {
                System.out.println("ID - "+ id + " Сотрудник - "+ emp.getFullName());
            }
        }
        return "Сотрудника с таким ID нет";
    }


}







