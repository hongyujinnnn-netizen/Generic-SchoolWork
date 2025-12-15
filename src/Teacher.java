import java.math.BigDecimal;

public class Teacher extends Persion{
    private double salary;

    public Teacher(String name, String gender, Float hight, double salary) {
        super(name, gender, hight);
        this.salary = salary;
    }

    public Teacher(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
