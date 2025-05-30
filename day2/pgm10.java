import java.util.Scanner;
public class pgm10 {
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
        if (mymark[j] < 35){
            System.out.printf("\nMark%d = %d; Status = Fail; Grade = U\n",j+1, mymark[j]);
        }
        else if (mymark[j] >=35 && mymark[j] < 50){
            System.out.printf("\nMark%d = %d; Status = Pass; Grade = E\n",j+1, mymark[j]);
        }
        else if (mymark[j] >=50 && mymark[j] < 60){
            System.out.printf("\nMark%d = %d; Status = Pass; Grade = D\n",j+1, mymark[j]);
        }
        else if (mymark[j] >=60 && mymark[j] < 70){
            System.out.printf("\nMark%d = %d; Status = Pass; Grade = C\n",j+1, mymark[j]);
        }
        else if (mymark[j] >=70 && mymark[j] < 80){
            System.out.printf("\nMark%d = %d; Status = Pass; Grade = B\n",j+1, mymark[j]);
        }
        else if (mymark[j] >=80 && mymark[j] < 90){
            System.out.printf("\nMark%d = %d; Status = Pass; Grade = A\n",j+1, mymark[j]);
        }
        else if (mymark[j] >=90 && mymark[j] < 100){
            System.out.printf("\nMark%d = %d; Status = Pass; Grade = S\n",j+1, mymark[j]);
        }
        else{
            System.out.printf("\nMark%d = %d; Status = Centum; Grade = O\n",j+1, mymark[j]);
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
