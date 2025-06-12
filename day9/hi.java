import com.homepage.home;
import com.homepage.home.java;
//single level inheritance
class math{
    void formula(){
        System.out.println("(A+B)^2");
    }
}
class chemistry extends math{
    void display(){
        System.out.println("Nothing");
    }
}
 public class hi {
    public static void main(String[] args) {
        /*  hello h = new hello();
        h.display();
        home h1 = new home();
        h1.display1();*/
        chemistry ch = new chemistry();
        ch.display();
        ch.formula();
    }
    
}
