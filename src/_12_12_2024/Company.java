package _12_12_2024;

import java.util.Arrays;

public class Company {
    private int id;
    private String name;
    private String address;
    private Department[] departments;


    public void getMaxSalary(Company company){
        Department[] departments1 = company.getDepartments();
        double maxSalary = 0;
        for (int i = 0; i < departments1.length; i++) {

            Employee[] currentDepEmp = departments1[i].getEmployees();
            for (int j = 0; j < currentDepEmp.length; j++) {
                if(currentDepEmp[j].getSalary() > maxSalary){

                    maxSalary = currentDepEmp[j].getSalary();
                }

            }

        }
        System.out.println(maxSalary);
    }



    public Company(int id, String name, String address, Department[] departments) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.departments = departments;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Department[] getDepartments() {
        return departments;
    }

    public void setDepartments(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", departments=" + Arrays.toString(departments) +
                '}';
    }
}