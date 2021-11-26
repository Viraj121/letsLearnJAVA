class Abc{
    int id=12;
    void show(){
        System.out.println("in parent class");
    }
}
public class inheritance  extends Abc{
    public static void main(String[] args) {

        inheritance obj=new inheritance();
        System.out.println(""+obj.id);
        obj.show();
    
        Abc obj1=new Abc();
        obj1.show();
} 
    }
   
