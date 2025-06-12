import java.util.*;

public class map{
    public static void main(String[] args){
        Map <Integer,String>player = new HashMap<Integer,String>();
        player.put(18,"kholi");
        player.put(7,"dhoni");
        player.put(33,"hardik");
        player.put(77,"gill");
        player.put(1,"kl rahul");
        player.remove(77);
        player.remove(77,"gill");
        player.size();
        
        System.out.println(player);
        System.out.println(player.get(77));
        System.out.println(player.getOrDefault(77,"gill"));
        player.size();
        player.isEmpty();
        System.out.println(player);
        
        
        


    }
}
    

