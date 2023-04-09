import java.util.ArrayList;
public class Student {
    public String name;
    public int id;
    final ArrayList<Course> selected = new ArrayList<>();

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Course> getSelected() {
        return selected;
    }

    public void add(Course course){
        selected.add(course);
    }
}
