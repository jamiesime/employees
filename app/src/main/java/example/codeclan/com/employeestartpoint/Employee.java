package example.codeclan.com.employeestartpoint;

import static android.R.attr.value;

/**
 * Created by user on 28/08/2017.
 */

public class Employee {
    private int id;
    private String name;
    private String socialSecurityNumber;
    private double salary;

    public Employee(int id, String name, String socialSecurityNumber, double salary) {
        this.id = id;
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        this.salary = salary;
    }

    public void setSalary(double value) {
        this.salary = value;
    }

    public void setId(int value) {
        this.id = id;
    }

    public void setName(String new_name){
        this.name = new_name;
    }

    public void setSSN(String newSSN){
        this.socialSecurityNumber = newSSN;
    }

    public void raiseSalary(double raise) {
        this.salary += raise;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

}
