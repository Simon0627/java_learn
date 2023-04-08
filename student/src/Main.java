public class Main {
    public static void main(String[] args) {
        human h = new human();
        h.setName("Tom");
        h.setAge(35);

        student s = new student();
        s.setName("Amy");

        h.sleep();
        s.sleep();
        h.eat();
        s.eat();
        h.activity();
        s.activity();

    }
}