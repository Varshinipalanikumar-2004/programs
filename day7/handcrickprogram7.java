import java.util.Scanner;
public class handcrickprogram7 {
    static int Player(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Player:");
    int z = sc.nextInt();
    return z;
}
static int CPU(){
int z = (int)(Math.random()*6)+1;
System.out.println("CPU :"+z);
return z;
}
public static void main(String[] args) {
    int Tscore = 0;
    int score = 0;
    int cpu = 0;
    while(true){
        score = Player();
        cpu = CPU();
            if(score!= cpu){
                Tscore+=score;
            }
            else{
                System.out.print("Total score "+Tscore);
                break;
            }
        }
    }


}
