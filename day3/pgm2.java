import java.util.Scanner;
public class pgm2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the year:/n");
        int a = sc.nextInt();
        if(a % 4 == 0 ){
           System.out.println("This year is leap year");
        }
        else{
            System.out.println("This year is not leap year ");
        }
    }
}
