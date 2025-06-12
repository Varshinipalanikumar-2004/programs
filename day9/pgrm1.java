class student{
    void displayDetails(String Name,int Rollno,float Marks){
            System.out.println("Student Name: "+Name);
            System.out.println("Rollno: "+Rollno);
            System.out.println("Marks: "+Marks);
    }
}
public class pgrm1{
    public static void main(String[] args) {
        student obj = new student();
        obj.displayDetails("Varshini P",5259,90);
    }
}h 
