import java.util.*;
public class anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine(),s2 = sc.nextLine();
        char[] c1 = s1.toCharArray(), c2 = s2.toCharArray();
        char[] a1= new char [26];
        char[] a2 = new char[26];

        for (int i=0; i<c1.length; i++){
            if (c1[i] == c2[i]) {
                count++;
            }
            else{
                break;
                
            }
        }
    }
    
}
