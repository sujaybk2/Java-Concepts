package demo1package.data;

public class Employee {
    private String name;
    private int age;
    private String dob;
    private Address address;

     public Employee(String name, int age, String dob) {
    this.name = name;
    this.age = age;
    this.dob = dob;
}
    public String getName() {
    return name;
}

    public void setName(String name) {
    this.name = name;
}

    public int getAge() {
    return age;
}

    public void setAge(int age) {
    this.age = age;
}

    public String getDob() {
    return dob;
}

    public void setDob(String dob) {
    this.dob = dob;
}


}

