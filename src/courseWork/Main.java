package courseWork;

public class Main {
    static Employee[] employees = new Employee[10];

    public static void main(String[] args) {

        employees[0] = new Employee("Petrov Sergey", 1, 25000);
        employees[1] = new Employee("Ivanov Mikhail", 1, 30000);
        employees[2] = new Employee("Sorokin Alexey", 2, 40000);
        employees[3] = new Employee("Diveev Maxim", 2, 42000);
        employees[4] = new Employee("Kim Arthur", 3, 48000);
        employees[5] = new Employee("Vasin Oleg", 3, 47000);
        employees[6] = new Employee("Frolova Svetlana", 4, 52000);
        employees[7] = new Employee("Chertov Dmitriy", 4, 55000);
        employees[8] = new Employee("Krylova Natasha", 5, 59000);
        employees[9] = new Employee("Denisov Petr", 5, 62000);

        employeeArr(employees);
        sum(employees);
        minSalary(employees);
        maxSalary(employees);
        avg(employees);
        listOfAllEmployees(employees);
    }

    public static void employeeArr(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }

    public static void sum(Employee[] employeeSalary) {
        int sum = 0;
        for (Employee employees : employees) {
            if (employees == null) {
                break;
            }
            sum += employees.getEmployeeSalary();
        }
        System.out.println("Сумма затрат на зарплаты в месяц " + sum + " рублей");
    }

    public static void minSalary(Employee[] employeeSalary) {
        int min = employees[0].getEmployeeSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null)
                break;
            if (min > employees[i].getEmployeeSalary()) {
                min = employees[i].getEmployeeSalary();
            }
        }
        System.out.println("Минимальная заработная плата за месяц " + min + " рублей");

    }

    public static void maxSalary(Employee[] employeeSalary) {
        int max = employees[0].getEmployeeSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null)
                break;
            if (max < employees[i].getEmployeeSalary()) {
                max = employees[i].getEmployeeSalary();
            }
        }
        System.out.println("Максимальная заработная плата за месяц " + max + " рублей");
    }

    public static void avg(Employee[] employeeSalary) {
        int sum = 0;
        int id = 0;
        for (Employee employees : employees) {
            if (employees == null) {
                break;
            }
            sum += employees.getEmployeeSalary();
            id = employees.getId();
        }
        System.out.println("Среднее значение зарплат " + sum / id + " рублей");
    }

    public static void listOfAllEmployees(Employee[] employeeSalary) {
        String name = "";
        for (int i = 0; i < employees.length; i++) {
            if (employees == null) {
                break;
            }
            name += employees[i].getEmployeeName()+", ";
            }
        System.out.println(name);
        }
    }


