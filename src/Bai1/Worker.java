package Bai1;

public class Worker extends Officer{
    private int step;

    public Worker(int step) {
        this.step = step;
    }

    public Worker(String name, int age, String gender, String address, int step) {
        super(name, age, gender, address);
        this.step = step;
    }

    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        this.step = step;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "step=" + step +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
