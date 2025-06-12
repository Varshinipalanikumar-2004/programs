import java.util.*;

public class contain{
    public static void main(String[] args){
        Map <Integer,String>player = new HashMap<Integer,String>();
        player.put(18,"kholi");
        player.put(7,"dhoni");
        player.put(33,"hardik");
        player.put(77,"gill");
        player.put(1,"kl rahul");
        
        System.out.println(player.containsKey(33));
        System.out.println(player.containsValue("varshinii"));
        System.out.println(player.keySet());
        System.out.println(player.values());
    }
}
