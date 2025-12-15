import java.util.ArrayList;
import java.util.List;

public class SchoolSystem {
    public static void main(String[] args) {

        School<Persion> school = new School<>();
        List<Persion> db = new ArrayList<>();
        Persion student =
                new Student("Dara", "Male", 1.70F, 99.0F);
        Persion teacher =
                new Teacher("Dara", "Male", 19F, 9000.60);

        db.add(student);
        db.add(teacher);
        school.setData(db);

        school.getData().forEach((persion) -> {
            System.out.println("Name: "+ persion.getName());
            System.out.println("Gender: "+ persion.getGender());
            System.out.println("Height: "+ persion.getHight());


            if (persion instanceof Student obj){
                System.out.println("Score: "+ obj.getScore());
            } else if (persion instanceof Teacher obj){
                System.out.println("Salary: "+ obj.getSalary());
            } else {
                System.out.println("Invalid information..!");
            }
            System.out.println("----------------------------");
        });
    }
}