import java.util.scanner;
public class pgm5 {
    public static void main (String[] args){
        System.out.println("enter an integer:\n");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("\nEnter a float number:\n");
        float b = sc.nextFloat();
        System.out.println(a+b);
    }
}