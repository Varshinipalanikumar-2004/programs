import java.util.Scanner;
public class arraypgm6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        int arr [] = new int [n];
        for (int i=0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++){
            
            if(min > arr[i]){
                min=arr[i];
            }
            if (max<arr[i]){
                max=arr[i];
            }


        }
        System.out.println("max" +max);
        System.out.println("min" +min);
    }

    
}
