//Abstract:when we don't want someone to create an object of our class then we declare our class as an abstract class.
// initialize and also declare the methods. 
//Any class which extends abstract class it is compulsory to define the declared methods 

abstract class AC {
    abstract void kik();

    void show(){
        System.out.println("In abstract class");
    }
}

class Abstract extends AC {

    void kik()
    {
        System.out.println("In extended class");
    }
    public static void main(String[] args) {
        Abstract obj =new Abstract();
      obj.kik();
      obj.show(); 
    }
}
