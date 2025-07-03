import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }
}

public class comparator {
    public static void main(String[] args) {

        Comparator<Student> com = (i, j) -> i.age > j.age ? 1 : -1;

        List<Student> studs = new ArrayList<>();
        studs.add(new Student(21, "Abid"));
        studs.add(new Student(12, "Karthik"));
        studs.add(new Student(18, "Manoj"));
        studs.add(new Student(20, "Vishal"));

        Collections.sort(studs, com);

        for (Student s : studs)
            System.out.println(s);
    }
}
//You create a separate object and used lambda to define sorting logic.

