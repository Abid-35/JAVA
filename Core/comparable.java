import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    
    public int compareTo(Student that) {
        return this.age - that.age;
        
    }

    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }
}

public class comparable {
    public static void main(String[] args) {
        List<Student> studs = new ArrayList<>();
        studs.add(new Student(21, "Abid"));
        studs.add(new Student(12, "Karthik"));
        studs.add(new Student(18, "Manoj"));
        studs.add(new Student(20, "Vishal"));

        Collections.sort(studs); 

        for (Student s : studs)
            System.out.println(s);
    }
}
