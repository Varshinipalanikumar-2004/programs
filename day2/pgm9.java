/*If else */
import java.util.Scanner;
public class pgm9 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your name:\n"); 
      String name = sc.nextLine();
      System.out.println("Enter your register number:\n"); 
      int reg = sc.nextInt();
      System.out.println("Enter your total numer of subjects:\n"); 
      int sub = sc.nextInt();
      int[] mymark= new int[sub+1];
      for(int i =0; i< sub; i++){
        System.out.println("Enter your subject marks one by one:");
        mymark[i] = sc.nextInt();
        System.out.println("\n");
      }
      System.out.printf("Hi %s you Register number is %d.\n", name, reg);
      for(int j =0; j< sub; j++){
        if (mymark[j] > 35){
            System.out.printf("\nMark%d = %d; Status = Pass\n",j+1, mymark[j]);
        }
        else{
            System.out.printf("\nMark%d = %d; Status = Fail\n",j+1, mymark[j]);
        }
      }
      int total = 0;
      for(int k =0; k<sub; k++){
        total = total + mymark[k];

      }
      int avg = total/sub;
      if (avg > 35){
        System.out.printf("\nYour total average is %d and You are PASS\n ", avg);
      }
      else{
        System.out.printf(" \nYour total average is %d and You are FAIL\n ",avg);
      }
    }
}
     