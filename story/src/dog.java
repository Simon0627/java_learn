public class dog {
    String name;
    public dog(String n){
        name = n;
    }
    public void sleep(){
        System.out.println(name+" is sleeping.");
    }
    public void run(){
        System.out.println(name+" is running.。");
    }
    public void bark(){
        System.out.println(name+" is barking!");
    }
    public void bite(){
        System.out.println(name+" bite "+human.name+".");
        System.out.println(human.name +"siha siha");
    }
}
