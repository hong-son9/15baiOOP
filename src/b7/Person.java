package b7;

public class Person {
    private String name;
    private int age;
    private String address;
    private String id;
    private double salary;
    private double bonus;
    private double penaty;
    private double realSalary;

    public Person() {
    }

    public Person(String name, int age, String address, String id, double salary, double bonus, double penaty, double realSalary) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.id = id;
        this.salary = salary;
        this.bonus = bonus;
        this.penaty = penaty;
        this.realSalary = realSalary;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getPenaty() {
        return penaty;
    }

    public void setPenaty(double penaty) {
        this.penaty = penaty;
    }

    public double getRealSalary() {
        return realSalary;
    }

    public void setRealSalary(double realSalary) {
        this.realSalary = realSalary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                ", bonus=" + bonus +
                ", penaty=" + penaty +
                ", realSalary=" + realSalary +
                '}';
    }
}
