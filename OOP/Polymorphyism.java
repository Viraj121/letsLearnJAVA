//Polymorphyism can be achived by method overloading,method overridin. 

// class A{
//     void show(){
//         System.out.println("in A");
//     }
// } 

// class B extends A{
//     void show()//child class method is overriding parent class method. if this method will be commented then parent method will be displayed. 
//     {
//         System.out.println("in B");
//     }
// }

// public class Overriding {
//     public static void main(String[] args) {
//         B obj=new B();
//         obj.show();
//     }
// }


class A{
    void show(){
        System.out.println("in A");
    }
    
} 

class Polymorphyism extends A{
    void show()//child class method is overriding parent class method. if this method will be commented then parent method will be displayed. 
    {
        System.out.println("in B");
    }

    public static void main(String[] args) {
        A obj=new Polymorphyism();// runtime polymorphism //upcasting i.e  A class is reference and Overriding is implementation.
        obj.show();//dynamic method dispatch

    }
}

