public class reverse {
    public static void main(String[] args) {
        String str = "Hello world";
        String reversed = "";
        for (int i =str.length()-1; i >=0; i--){
        reversed +=str.charAt(i);
        }
        System.out.print(reversed);
    }
}

