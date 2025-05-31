import java.util.Scanner;

public class arraypgm7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr =new int[n];
        for(int i=0;i<n; i++);{
        arr[i]=sc.nextInt();
    }
    for (int i=0;i<n; i++){
        for (int j=0;j<n;j++){
            if(i==j){
                break;
            }
            else if (arr[i]==arr[j]){
                System.out.println(arr[i]+" is duplicate");
            }
        }
    }
    
}
