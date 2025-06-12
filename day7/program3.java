import java.util.*;
public class program3 {
    public static void main(String[] args){
        int n=6,temp=0;
        int [] arr = new int[n], cpy = new int[n];
        Scanner sc = new Scanner (System.in);
        for (int i=0; i< arr.length;i++){
            arr [i] = sc.nextInt();
        }
        for (int i= arr.length-1;i >0; i--){
            if(arr[i]>temp){
                temp = arr[i];
                cpy[i] = temp;
            }
        }
        for (int i: cpy){
            if(i!=0){
                System.out.println(i+ " ");
            }
        }
    }
    
}
