import java.util.*;
public class decode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        name.toUpperCase();
        char namearr[] = name.toCharArray();
        for(char c : namearr) {
            System.out.printf("%d ", c-64);
        }
    }
    
}
