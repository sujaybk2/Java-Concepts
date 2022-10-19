package Iteration3;

public abstract class employeeDemo {
    private String name;
    private int empCode;
    private String dob;
    private double salary;
    private int age;

    public abstract double calculateIncrement(float payHike);

    public employeeDemo(String name, int empCode, String dob, double salary, int age) {
        this.name = name;
        this.empCode = empCode;
        this.dob = dob;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpCode() {
        return empCode;
    }

    public void setEmpCode(int empCode) {
        this.empCode = empCode;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

