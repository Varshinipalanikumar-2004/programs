import java.util.Scanner;
public class pgm18{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int a = sc.nextInt();
        if(a % 100 == 0) {
            if (a % 400 == 0){
                System.out.println("Leap year");
            } else{
                System.out.println("not a lap year");

            }      
         }
        } else {
        if (a % 4 == 0) {
            System.out.println("a leap year");
        } else {
            System.out.println("not a leap year");
        }
    }
}
