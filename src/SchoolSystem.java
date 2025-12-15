package co.istad.generic;

import java.util.ArrayList;
import java.util.List;

public class SchoolSystem {
    public static void main(String[] args) {

        School<Persion> school = new School<>();
        List<Persion> db = new ArrayList<>();

        Persion student =
                new Student("Dara", "Male", 1.70F, 99.0F);
        Persion teacher =
                new Teacher("Monika", "female", 19F, 1250.60);
        Persion student2 =
                new Student("Bopha", "Male",1.65F,97.0F);
        Persion teacher2 =
                new Teacher("Nisa", "female", 1.50F, 1200.60);

        db.add(student);
        db.add(teacher);
        db.add(teacher2);
        db.add(student2);

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