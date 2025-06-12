class outer{
    private String Z= "Private Message";
    class inner{
        void display(){
           System.out.println(Z);
        }
    }
    static class StaticInner{
        void display2(){
            System.out.println("Hi this is Static inner class");
        }
    }
}
public class new {
    public static void main(String[] args) {
        outer obj = new outer();
       // outer.inner inobj = obj.new inner();
       // inobj.display();
       outer.StaticInner sobj = new outer.StaticInner();
       sobj.display2();
    }
    
}

