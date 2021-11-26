class Constructor {

    int id;
    String name;

 Constructor()
 {
System.out.println("no arg constructor");
 }

 Constructor(int id,String name)
 {
    this.id=id;
    this.name=name;
 }
 //this keyword is used to point instance variable.

void show(){
    System.out.println(id+" " +name);
}
 public static void main(String[] args) {
     
     Constructor obj=new Constructor(21,"viraj");
     new Constructor();
     obj.show();

 }
}
