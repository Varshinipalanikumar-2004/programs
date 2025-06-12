public class encaps {
    private int data = 404;
    public int wrap(){
        return data;
    }
}

public class hi{
    public static void main(String[] args){
        Encaps cap = new Encaps();
        System.out.println(cap.wrap()); 
    }
}
