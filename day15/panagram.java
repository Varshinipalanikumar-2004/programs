import java.util.*;
public class panagram {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase(); 
        boolean[] alph = new boolean[26];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                alph[ch - 'a'] = true;
            }
        }
        boolean isPangram = true;
        for (boolean present : alph) {
            if (!present) {
                isPangram = false;
                break;
            }
        }

        if (isPangram) {
            System.out.println("Panagram");
        } else {
            System.out.println("Not a Panagram");
        }
    }
}

