import java.util.Random;

public class story {
    public static void main(String[] args) {
        human h = new human("Tom");
        dog d = new dog("Snoopy");
        h.walk();
        d.sleep();
        h.kick();
        java.util.Random random = new Random();
        int n = random.nextInt(1,4);
//        System.out.println(n);
        if(n==1){
            d.bark();
        }
        if(n==2){
            d.bite();
        }
        if(n==3){
            d.run();
        }
    }
}
