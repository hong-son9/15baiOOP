package Bai1;

public class Employee extends Officer{
    private String task;

    public Employee(String task) {
        this.task = task;
    }

    public Employee(String name, int age, String gender, String address, String task) {
        super(name, age, gender, address);
        this.task = task;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "task='" + task + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
