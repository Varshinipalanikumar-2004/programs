import java.util.*;
public class obj{
    public static void main(String[] args) {
        Set obj = new HashSet();
        obj.add("dharshini-9922005326");
        obj.add("nandhini-9922005130");
        obj.add("varshini-9922005259");
        obj.add("saje-9922005290");
        obj.add("muthu-9922005422");
        obj.add("keerthi-9922005423");
        obj.remove("muthu-9922005422");
        obj.isEmpty();
        obj.contains("keerthi-9922005423");
        obj.hashCode();
        System.out.println(obj);
    }
}
//set doesn't maintain sequently
