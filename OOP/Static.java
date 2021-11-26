
class student{
    int id;
    String branch;
    static String principle;//static keyword is class specific and not object specific.
                            //so change in the principle will reflect on all the objects.
   
    void show(){
        System.out.println(id+" "+branch+" "+principle);
    }

    static {
        principle="suwarna";
    }

}



public class Static{
 public static void main(String[] args) {
    student viraj=new student();  
    viraj.id=101;
    viraj.branch="IT";
    //student.principle="dad";//bcoz princciple is static so student and not object.
    
    student vijay=new student();  
    vijay.id=32;
    vijay.branch="CO";

    vijay.show();
    viraj.show();
 }


}
