package _12_12_2024;

import java.util.Arrays;

public class Department {
    private int id;
    private String name;
    private int maxEmpNumbers;
    private Employee[] employees;

    public Department(int id, String name, int maxEmpNumbers, Employee[] employees) {
        this.id = id;
        this.name = name;
        this.maxEmpNumbers = maxEmpNumbers;
        this.employees = employees;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxEmpNumbers() {
        return maxEmpNumbers;
    }

    public void setMaxEmpNumbers(int maxEmpNumbers) {
        this.maxEmpNumbers = maxEmpNumbers;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", maxEmpNumbers=" + maxEmpNumbers +
                ", employees=" + Arrays.toString(employees) +
                '}';
    }
}
