//Encapsulation is binding data with methods.

class Encap{
    //keeping the variabe as private they can be only be accessed by setter and getter.
    private int id;
    private String name;
    
    //setter and getter can be created automatically by ide by right click > source > getter and setter. 
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
        System.out.println("value of id changed");//we can keep a log file everytime someone makes changes. 
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }  
}

public class Encapsulaton {
public static void main(String[] args) {
    Encap obj=new Encap();
   obj.setId(101);
   obj.setName("Viraj"); 
   System.out.println(obj.getId()+"  "+obj.getName());
}
}
