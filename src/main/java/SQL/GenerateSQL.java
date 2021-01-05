package SQL;

import SQL.NameFamily.Female;
import SQL.NameFamily.Male;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class GenerateSQL {
    private static final int COUNT_DEPARTMENTS = 15;
    private static final int COUNT_EMPLOYEES = 500;
    private static ArrayList<Integer> managersId = new ArrayList<>();
    private static ArrayList<Employee> employees = new ArrayList<>();
    private static ArrayList<Department> departments = new ArrayList<>();
    public static void main(String[] args) {
        generateDepartments();
        generateEmployees();
        generateManagers();
        setManager();
        printSql();

    }
    private static void generateDepartments()   {
        for (int i = 1; i <= COUNT_DEPARTMENTS; i++)    {
            String name = "Отдел " + i;
            Department department = new Department(i, name);
            departments.add(department);
//            String sql = "INSERT INTO department (id, name) VALUES (" + i + ", " + name + ");";
//            System.out.println(sql);
        }
    }
    private static void generateEmployees() {
        for (int i = 1; i <= COUNT_EMPLOYEES; i++)  {
            String fullName = getFullName();
            int departmentId = getDepartmentId() + 1;
            int salary = new Random().nextInt(500000);
            Employee employee = new Employee(i,departmentId, fullName,salary);
            employees.add(employee);
        }
    }

    private static int generateValue(int min, int max) {
        Random random = new Random();
        double value = min + random.nextDouble() * (max - min);
        return (int)value;
    }

    private static void setManager()    {
        for (Employee employee : employees) {
            while (true) {
                int id = new Random().nextInt(managersId.size());
                if (managersId.get(id) != employee.getId()) {
                    employee.setManagerId(id);
                    break;
                }
            }

        }
    }

    private static String getFullName() {
        Gender gender;
        if (generateValue(1, 10000) % 2 == 0)   {
            gender = Gender.MALE;
        }
        else   {
            gender = Gender.FEMALE;
        }
        String nameEmployee, familyEmployee;
        if (gender == Gender.MALE)  {
            Male male = new Male();
            int index = generateValue(0, male.getName().size() - 1);
            nameEmployee = male.getNameId(index);
            index = generateValue(0, male.getFamily().size() - 1);
            familyEmployee = male.getFamilyId(index);
        }
        else    {
            Female female = new Female();
            int index = generateValue(0, female.getName().size() - 1);
            nameEmployee = female.getNameId(index);
            index = generateValue(0, female.getFamily().size() - 1);
            familyEmployee = female.getFamilyId(index);
        }
        return nameEmployee + " " + familyEmployee;
    }
    private static int getDepartmentId() {
        return new Random().nextInt(COUNT_DEPARTMENTS);
    }
    private static void generateManagers()  {
        for (int i = 1; i <= COUNT_EMPLOYEES; i++)  {
            if (new Random().nextDouble() > 0.7)    {
                managersId.add(i);
            }
        }
    }
    private static void printSql()  {
        for (Department department : departments)   {
            String sql = "INSERT INTO department (id, name) VALUES (" + department.getId() + ", '" + department.getName() + "');";
            //System.out.println(sql);
        }
        for (Employee employee : employees) {
            String sql = "INSERT INTO employee (id, department_id, name, salary) VALUES (" +
                    employee.getId() + ", " + employee.getDepartmentId() + ", '" +
                    employee.getName() + "', " +employee.getSalary() + ");";
            System.out.println(sql);
        }

        for (Employee employee : employees) {
            String sql = "UPDATE employee SET manager_id = " + employee.getManagerId() + " WHERE id = " + employee.getId() + ";";
            System.out.println(sql);
        }
    }
}
