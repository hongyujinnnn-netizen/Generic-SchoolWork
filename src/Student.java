package co.istad.generic;
public class Student extends Persion {
    private float score;

    public float getScore() {
        return score;
    }

    public Student(float score) {
        this.score = score;
    }

    public Student(String name, String gender, Float hight, float score) {
        super(name, gender, hight);
        this.score = score;
    }
    public void setScore(float score) {
        this.score = score;
    }
}
