import java.util.*;
public class hashset {
    public static void main(String[] args){
    
        Set obj = new LinkedHashSet<>();
        obj.add("muthu-5422");
        obj.add("varshini-5259");
        obj.add("saje-5290");
        obj.add("keerthi-5423");
        obj.retainAll(obj);
        System.out.println(obj);
    }
    
}
