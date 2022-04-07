package courseWork;

public class Employee {
    static int counter = 1;
    private final String employeeName;
    private final int id;
    private int departmentEmployee;
    private int employeeSalary;

    public Employee(String employeeName, int departmentEmployee, int employeeSalary) {
        this.employeeName = employeeName;
        this.departmentEmployee = departmentEmployee;
        this.employeeSalary = employeeSalary;
        id = counter++;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public int getDepartmentEmployee() {
        return departmentEmployee;
    }

    public void  setDepartmentEmployee(int departmentEmployee){
        this.departmentEmployee = departmentEmployee;
    }

    public int getEmployeeSalary() {
        return employeeSalary;
    }

    public void  setEmployeeSalary(int employeeSalary){
        this.employeeSalary = employeeSalary;
    }

    public int getId(){
        return id;
    }

    @Override
    public String toString() {
        return "Cотрудник " + employeeName + ". Отдел " + departmentEmployee + ". Заработная плата " + employeeSalary +
                ", id=" + id;
    }





}
