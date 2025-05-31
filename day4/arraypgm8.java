import java.util.Scanner;
public class arraypgm8{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number:");
        int n = hah.nextInt();
        for (int i = 2; i < Math.sqrt(n); i++)
        {
            if (n % 2 == 0) {
                temp = 1;
            }
        }
        if(temp ==1) {
            System.out.println("not a prime number");
        }else{
            System.out.println("prime number");
        }
    }
}

