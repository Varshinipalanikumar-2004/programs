 class Defaultclass{
    String defaultmessage = "I am Default access,i am Accessisble within the same package";
}
class ModifierExamples{
    public String publicmessage = "I am Public access,i am Accessible anywhere";
    private String privatemessage = "I am private access,i am Accessible within the same class";

    private void displayprivate(){

        System.out.println(privatemessage);
    }
    Defaultclass dc =  new Defaultclass();
public void displayall(){
    System.out.println(dc.defaultmessage);
    System.out.println(publicmessage);
    displayprivate();
}
}
public class Accessmodifiers{
    public static void main(String[] args){
ModifierExamples access = new ModifierExamples();
access.displayall();
}

}

