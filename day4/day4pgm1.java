package day4;
import java.util.Scanner;
public class day4pgm1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        int [][] arr=new int[3][3];
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        for(int i =0; i<3; i++){
            sum=0;
            for(int j=0; j<3; j++){
                System.out.print(arr[i][j]+" ");
                sum = sum+arr[i][j];
            }
            System.out.println(sum);
            System.out.println();
        }
    }
}

