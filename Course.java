public class Course {
    public String name;
    public int place;
    public String teacher;
    public int time;

    public Course(String name, int place, String teacher, int time) {
        this.name = name;
        this.place = place;
        this.teacher = teacher;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public int getPlace() {
        return place;
    }

    public String getTeacher() {
        return teacher;
    }

    public int getTime() {
        return time;
    }
}
