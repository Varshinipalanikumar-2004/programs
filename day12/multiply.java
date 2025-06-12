import java.util.Scanner;
public class multiply{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter a number:");
        int num = sc.nextInt();
        for(int i = 1 ; i< 11; i++){
            int p = num*i;
            System.out.printf("\n%d x %d = %d", num, i,p);
        }  
    }
}

