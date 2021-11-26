 //Interface: it is the same as abstract,only few differences we can achieve multiple inheritance we can implement multiple interfaces.
// Only declare the methods in interface by default abstract method 
interface L1{
    void show();

    default void display(){
        System.out.println("deault method");
    }

    public static void any(){
        System.out.println("static method");
    }

}

class B{
 void main(){
     System.out.println("class method");
 }
}

interface L2{
    void show1();

}
public class Inter extends B implements L1,L2  ///multiple inheritance.
{

    public void show(){
        System.out.println("l1");
    }

    public void show1(){
        System.out.println("l2");
    }

    public static void main(String[] args) {
      Inter obj=new Inter();
      obj.show();  
      obj.show1();
      obj.main();
   
    }
}
