import java.util.Scanner;
//inclusion and exclusion priniple

class incexc{

	static int incexc(int n,int a,int b){
     int c1=n/a;

     int c2=n/b;

     int c3=n/(a*b);

     return c1+c2-c3;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a=sc.nextInt();
	int b=sc.nextInt();
	

	System.out.print(incexc(n,a,b));

}
}