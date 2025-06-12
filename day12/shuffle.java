import java.util.*;
public class shuffle {
    public static void main(String[] args) {
        ArrayList al =new ArrayList<>();
        al.add("zyer");
        al.add("asdf");
        al.add("bjik");
        al.add("iopu");
        Collections.shuffle(al);
        System.out.println(al);
        al.sort(null);
        System.out.println(al);

       

    }
}
