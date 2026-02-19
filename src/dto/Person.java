package dto;

public class Person implements Comparable<Person>{
    private String name;
    private int age;
    private String gender;
    private double sal;
    private String department;

    public Person() {
    }

    public Person(String name, int age, String gender, double sal, String department) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.sal = sal;
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", sal=" + sal +
                '}';
    }

    @Override
    public int compareTo(Person person) {
        return this.getAge() - person.getAge();
    }
}
