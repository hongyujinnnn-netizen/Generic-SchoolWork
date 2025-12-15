public class Persion {
    private String name;
    private String gender;
    private float hight;

    public Persion(){};
    public Persion(String name, String gender, Float hight) {
        this.name = name;
        this.gender = gender;
        this.hight = hight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHight() {
        return hight;
    }

    public void setHight(float hight) {
        this.hight = hight;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}