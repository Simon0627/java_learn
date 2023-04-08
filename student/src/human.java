public class human {

    public String name;
    private int age;

    public human() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void sleep(){
        System.out.println(name + " is sleeping!");
    }

    public void eat(){
        System.out.println(name + " is eating!");
    }

    public void activity(){
        System.out.println(name + " is working! Because he/she is only "+ age + " years old.");
    }
}
