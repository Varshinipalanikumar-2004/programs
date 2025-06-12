import java.io.*;
public class filewriting {
    public static void main(String[] args) {
        try{
            FileWriter obj = new FileWriter("example.text");
            obj.write("This is my file handling class\n Welcome to the class");
            obj.close();
        }
        catch(IOException e){

        }
    }
    
}
