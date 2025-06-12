import java.util.*;
public class sortedsetset {
    public static void main(String[] args){
    
        SortedSet obj = new TreeSet<>();
        obj.add("muthu-5422");
        obj.add("varshini-5259");
        obj.add("saje-5290");
        obj.add("keerthi-5423");
        obj.retainAll(obj);
        System.out.println(obj);
    }
    
}

