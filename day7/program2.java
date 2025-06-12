public class program2 {
    public static void main(String[] args) {
        boolean program=true;
        int[] a = {16,17,4,3,5,2};
        for (int i=0 ;i<a.length; i++){
            for (int j=a.length-1 ;j>i; j--){
                if(a[i]<a[j]){
                    program= false;
                    break;
                }
                else{
                    program = true;

                }

            }
            if(program==true){
                System.out.println(a[i]);
            }
        }
    }
}
    

