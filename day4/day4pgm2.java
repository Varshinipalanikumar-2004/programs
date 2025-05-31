package day4;
import java.util.Scanner;
public class day4pgm2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int arr [][] = new int[3][3];
        for(int i=0;i< arr.length; i++){
            for (int j = 0;j < arr.length;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        for (int index= 0;index < arr.length;index++){
            sum = sum+arr[index][index];
        }
        System.out.println(sum);
        sum = 0;
    }


    
}
