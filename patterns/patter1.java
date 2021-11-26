package patterns;

 

public class patter1 {
   public static void main(String[] args) {
   pappy(5);
   } 

   
}

static void pappy(int n){
       for (int i = 0; i < n; i++) {
           for (int col= 5; col < n; col++) {
             System.out.println("*");  
           }
           System.out.println();
           
       }

   }
}
