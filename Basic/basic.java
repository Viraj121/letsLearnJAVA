// FLOW CONTROL PROGRAMS

// //calculator
// // import java.util.*;
// // class programs
// // {
// //     public static void main(String args[]) 
// //     {
// //          String yn; 
// //         do{ 
// //         Scanner sc =new Scanner(System.in);
// //         System.out.println("1no.");
// //         int n1=sc.nextInt();
        
// //          System.out.println("2no.");
// //          int n2=sc.nextInt();
         
// //          System.out.println("enter operation: + , -");
// //          String op=sc.next();
         
// //          int result;
      
// //             //String yn;
// //            switch(op){
// //              case"+":result=n1+n2;
// //                     System.out.println(result);
// //                     break;
// //               case"-":result=n1-n2;
// //                     System.out.println(result);
// //                     break;
                    
// //               default:System.out.println("wrong");
// //          }
// //          System.out.println("do you want to cantinue: y/n");
// //          yn=sc.next();
// //         }while(yn.equals("y") || yn.equals("Y"));
        
        
    
// //     }
// // }


// // Greater between 3 numbers
// //class HelloWorld {
//   //  public static void main(String[] args) {
// //         int a=1,b=2,c=3;
// //         if(a>b && a>c)
// //         {
// //         System.out.println("A....."); 
// //         }
// //         else if (b>a && b>c){
// //         System.out.println("B...."); 
// //         }
// //         else {
// //             System.out.println("C....");
// //         }
// //     }
// // }

// //Another way to find greater bet 3 no.
// // class HelloWorld {
// //     public static void main(String[] args) {
// //         int a=1,b=2,c=3;
// //         if(a>b )
// //         {
// //             if(a>c){
// //               System.out.println("A.....");  
// //             }
// //             else{
// //                 System.out.println("C...."); 
// //             }
// //         }
// //         else if  (b>c)
// //         {
// //         System.out.println("B....");
// //         }
// //         else {
// //             System.out.println("C....");
// //         }
// //     }
// // }

//  //To find even or odd
// // % to find remainder
// // / to find  quotiet

// //  import java.util.*;
// //  class EvenOdd{
// //     public static void main(String args[]){
// //          Scanner sc=new Scanner(System.in);
// //         System.out.println("Enter no.");
// //         int a=sc.nextInt();
// //          if(a%2==0){
// //              System.out.println("even");
// //          }
// //          else{
// //               System.out.println("odd");
// //          }
// //      }
// //  }

// // leap year, which has 366 days including 29 feb it occurs once every year
// //   2 RULES:
// //   IF (% BY 400) THEN LEAP YEAR
// //   ELSE IF (% BY 4) BUT NOT (% BY 100)
// // class Hello{
// //     public static void main (String args[]){
        
// //         int year=2020;
// //         if(year%400==0){
// //             System.out.println("leap year");
// //         }
// //         else if (year%4==0 && year%100!=0)
// //         {
// //           System.out.println("leap year"); 
// //         }
// //         else{
// //             System.out.println("not a leap year");
// //         }
        
// //     }
// // }
 
//  //  another way 
//    // if( (year%400==0)  || (year%4==0 && year%100!=0))
//         // {
//         //     System.out.println("leap year"); 
//         // }
//         // else {
//         //     System.out.println("not a leap year"); 
//         // }

// //swaping of two no.
// // class HelloWorld {
// //     public static void main(String[] args) {
// //       int a=10,b=90;
// //       int temp;
// //       temp=a;   a=a+b;
// //       a=b;      b=a-b;
// //       b=temp;   a=a-b;
// //       System.out.println("A:"+a);
// //       System.out.println("B:"+b);
// //     }
// // }

// // without using 3 variable:
// // a=a+b;
// // b=a-b;
// // a=a-b;


// // //user input
// // import java.util.*;
// // class Input{
// //     public static void main(String[] args) {
// //         Scanner sc=new Scanner(System.in);
// //         System.out.println("Enter name:");
// //         String Name=sc.next();
// //         System.out.println("Enter age:");
// //         int Age=sc.nextInt();
// //         System.out.println("Enter gender:");
// //         char Gender=sc.next().charAt(0);
// //         System.out.println("name:"+Name);
// //         System.out.println("age:"+Age);
// //         System.out.println("gender:"+Gender);
// //     }
// // }

// // //table
// // import java.util.*;
// // class Input{
// //     public static void main(String[] args) {
// //         Scanner sc=new Scanner(System.in);
// //         System.out.println("Enter no.");
// //         int t =sc.nextInt();
// //         for(int i=1;i<=10;i++)
// //         {
// //             System.out.println(+t+"*"+i+"="+t*i);
          
// //         }
        
// //     }
// // }

// //factorial 5=5*4*3*2*1=120, 120 is factorial of 5
// // import java.util.*;
// // public class Hello{
// //     public static void main(String[] args) {
// //     Scanner sc=new Scanner(System.in);
// //     int fact=1;
// //     System.out.println("enter the no.");
// //     int no=sc.nextInt();
// //     for(int i=1;i<=no;i++){
// //         fact=fact*i;
        
// //     }
// //         System.out.println("factorial of"+ no +" is "+fact);
// //     }
// // }

// //Factoral using recursion,when method call itself is call recursion. 
// // import java.util.*;

// // public class Factoral 
// // { static int fact=1;
// //     public static void main(String[] args) {
       
// //         int no=5;
// //         Factoral ob=new Factoral();
// //         ob.factrec(no);
// //         System.out.println(fact);
// // }

// // void factrec(int no){
// //   if (no>=1){
// //     fact=fact*no;
// //     factrec(no-1);
    
// //   } 
// // }
// // }

// // //reverse a number

// // public class Reverse 
// // { 
// //     public static void main(String[] args) {
// //       int no=5432,rem,rev=0;
// //       while(no!=0){
// //         rem=no%10;//gives remainder i.e 2
// //       rev=rev*10+rem;//0*10*2=2
// //       no=no/10;//543
// //       }
// //       System.out.println(rev);
// //     }
  
// // }

// // // //Reverse a String
// // // class Reverse{
// // //   public static void main (String[] args) {
// // //     String name="jariv";
// // //     int leng=name.length();//5
// // //     String rev="";
// // //     for(int i=leng-1;i>=0;i--){
// // //       rev=rev+name.charAt(i);
// // //     }
// // // System.out.println("Reverse of "+name+ " is "+rev);
// // //   }
// // // }

// //to check no. is prime or not; prime no is no that only gets divisible by 1 and no itself so the logic is no which is divisible between 2 to < then no is not prime no

// // class PrimeOrNot{
// //   public static void main (String[] args) {
// //     int no=2;
// //     int temp=0;
// //     for(int i=2;i<no;i++){
// //       if(no%i==0){
// //         temp++;
// //         break;
// //       }
// //     }
// //     if(temp==0)
// //     {
// //       System.out.println("prime number");
// //     }
// //     else
// //     {
// //       System.out.println("not prime number");
// //     }
// //   }
// // }

// //print prime no from 1 to 100

// // class   Prime1To100{
// //   public static void main (String[] args) {
// //     int temp=0;
// //   for(int i=1;i<=100;i++)
// //   {
// //     for(int j=2;j<=i-1;j++)
// //     {
// //             if(j%i==0){
// //               temp++;
// //               }
// //     }  
// //       if(temp==0){
// //       System.out.println(i);
// //       }
// //       else{
// //       temp=0;
// //       }
// //   }
// //   }
// // }

// //fibonacci series
// // class fib{
// //   public static void main (String[] args) {
// //     int a=0,b=1,c;
// //     for(int i=1;i<=10;i++){
// //     c=a+b;
// //     System.out.println(" "+c);
// //     a=b;
// //     b=c;
     
// //     }
// //   }
// // }





// //fibonacci series using recursion
// //import java.util.*;
// //public class fibRec {
//     // static int a=0,b=1,c;
//     // public static void main(String[] args) {
//     //   System.out.print(a+" "+b);
//     //   fibRec r1=new fibRec();
//     //   r1.recur(10);
      
//     // }
//     // void recur(int i)
//     // {
//     //   if (i>=1) 
//     //   c=a+b;
//     //   System.out.print(" "+c);
//     //   a=b;
//     //   b=c;
//     //   recur(i-1);
//     //   }
      
//     // }

// // //palindrome is reversing the number and then comparing it with original number
// // class palindrome{
// //   public static void main (String[] args) {
// //     int rev=0,rem,temp;
// //     int no=121;
// //     temp=no;
   
// //     while(temp!=0)
// //     {
// //     rem=temp%10;
// //     rev=rev*10+rem;
// //     temp=temp/10;
// //     }
// //     if(rev==no){
// //       System.out.println("palindrome");
// //     }
// //     else{
// //       System.out.println("not palindrome");
// //     }
// //   }
// // }

// // Armstrong is 153 = 1^3 + 5^3  + 3^3 i.e number equal to each digit raise to length of number;
// // class armstrong{
// //   public static void main (String[] args) {
// //     int length=0;
// //     int temp;
// //     int no=153;
// //     temp=no;
// //     while(temp!=0){ //this loop is for getting the length of number;i.e 3
// //       if(temp>0){
// //         length=length+1;
// //         temp=temp/10;
// //       }
// //     }
// //     int temp2=no;
// //     int rem;
// //     int arm=0;
    
// //     while(temp2!=0)
// //     {
// //       int mul=1;
// //     rem=temp2%10;
    
// //     for (int i=1;i<=length ;i++ ){
// //     mul=mul*rem;
// //     }//each digit is multipled by itself according to length of number  
    
// //     arm=arm+mul;
// //     temp2=temp2/10;
// //     }
// //     if(arm==no){
// //       System.out.println(no+" is palindrome");
// //     }
// //     else{
// //     System.out.println(no+ " not palindrome");
// //     }
// // }
// // }

// // //PATTERNS

// // //pattern has rows and columns like 1 row has 1 col, 2 row has 2 col in which rows are always same only colms changes evertime.
// // // import java.util.*; 
// // // class Patter{
// // //   public static void main (String[] args) {
    
// // //     for (int i=0;i<=3 ;i++ )//for rows
// // //     {
// // //       for (int j=0;j<=i ;j++ )//for columns
// // //       {
// // //         System.out.print("*");
// // //       } 
// // //       System.out.println();
// // //     }
// // //     for (int i=0;i<=3 ;i++ )//for rows
// // //     {
// // //       for (int j=2;j>=i;j-- )//for columns
// // //       {
// // //         System.out.print("*");
// // //       } 
// // //       System.out.println();
// // //     }
// // //   }
// // // }

// // // class Patter{
// // //   public static void main (String[] args) {
    
// // //     for (int i=0;i<=3 ;i++ )//for rows
// // //     {
// // //       for (int j=0;j<=i ;j++ )//for columns
// // //       {
// // //         System.out.print("*");
// // //       } 
// // //       System.out.println();
// // //     }
// // //   }}


// // class Patter{
// //   public static void main (String[] args) {
// //     for(int i=1;i<=4 ;i++ )
// //     {
// //       for(int j=4;j>=i ;j-- ){
// //         System.out.print(" ");
// //       } 
// //       for (int k=1;k<=i ;k++ )
// //       {
// //         System.out.print("*");
// //       } 
// //       System.out.println("");
// //     }
    
// //     System.out.println();
// //     for(int a=1;a<=4 ;a++ )
// //     {
// //       for(int j=1;j<=a ;j++ ){
// //         System.out.print(" ");
// //       } 
// //       for (int k=4;k>=a ;k--)
// //       {
// //         System.out.print("*");
// //       } 
// //       System.out.println("");
// //     }
    
// //   }
// // }


// // class Patter{
// //   public static void main (String[] args) {
// //     for(int i=1;i<=4 ;i++ )
// //     {
// //       for(int j=1;j<=i ;j++ ){
// //         System.out.print(" ");
// //       } 
// //       for (int k=4;k>=i ;k--)
// //       {
// //         System.out.print("*");
// //       }
// //       for (int l=3;l>=i ;l-- )
// //       {
// //         System.out.print("*");
// //       }
// //       System.out.println();
// //     }
    
 
    
// //   }
// // }



// JVM,JRE

// 1.controlflow

// 2.program:armstrong,palindrome,even,odd,calculator,patterns

// ARRAY

// stores in heap memory.
// array is an object which has super class named Object.

// Types of array:

// Single Dimensional(1d):one row or one column. 
// int[] a=new int[2];//declare and creation
// int a[0]=1;//assign value
// int[] a={1,2,3,4};//init ,declare,creation

// Multidimensional(2d or 3d) also called as array of array. 

// 2D array are of two types matrix and jagged. In matrix array no. of col are same i.e int a=new int[2][3];
// and in jagged array no. of col are diiferent i.e int a =new int[2][];
// a[0]=new int[3];
// a[1]=new int[2];


//  //2D array
// class Array2d{
//   public static void main (String[] args) {
//     int[][] a={{1,2,3,4},{2,3,4},{6,7,8}};
  
//     for (int i=0;i<a.length ;i++ ){
//       for (int j=0;j<a[i].length ;j++ ){
//         System.out.print(a[i][j]+" ");
//       } 
//       System.out.println();
//     } 
    
//   }
// }

// //3D array
// class Array2d{
//   public static void main (String[] args) {
//     int[][][] a={{{1,2,3,4},{2,3,4},{6,7,8}}};
  
//     for (int i=0;i<a.length ;i++ ){
//       for (int j=0;j<a[i].length ;j++ ){
//       for (int k=0;k<a[i][j].length ;k++ ) 
//       {
//         System.out.print(a[i][j][k]+" ");
//       } 
//       System.out.println();
//     } 
    
//     }
    
//   }
// }


// //2d aaray using enhanced for loop.
// // class araay2d{
// //   public static void main (String[] args) {
// //     int [][] a ={{1,2,3},
// //                 {1,2,3}
// //                 };
                 
// //     for(int i[]:a){
// //       for(int j:i){
// //         System.out.print(j+" ");
// //       }
// //       System.out.println();
// //     }
      
// //   }
// // }

// anonymous array:
// array which has no name.they are used only once
// synax: new int[]{2,13,14};

// // class AnonArray{
// //   public static void main (String[] args) {
// //     AnonArray.fun(new int[][]{{12,1,2},{1,2,3}});
    
// //   }
  
// //   static void fun(int[][] i){
// //     int total=0;
// //     for(int var[]: i){
// //       for(int j:var){
// //       total=total+j; 
// //       }
      
// //     }
// //     System.out.println("sum of array is "+total);
// //     }
// //   }

// (Use of sorting technique is that if we are applying binary search technique but for that we need all the elements to be sorted, if they are not then we can use any sorting technique to sort them).

// BUBBLE SORT

// //no. of rounds = n-1 i.e 5-1=4 rounds are total required for sorting array.

// class BubbleSort{
//   public static void main (String[] args) {
//     int a[]={ 90,20,70,40,10 };
//     int temp;
//     for (int i=0;i<a.length;i++ )//no. of rounds, if i write a.length-1 it will work same.
//     {
//       int flag=0; //if the comparison is happeing then it will break the outer loop
//       for (int j=0;j<a.length-1-i ;j++ )//comparison, i is used for not comparing the element with sorted array i.e from last,second last and so on.
//       {  
//           if (a[j]>a[j+1]){
//           temp=a[j+1];
//           a[j+1]=a[j];
//           a[j]=temp;
//           flag=1;
//           }
          
//       }
//       if (flag==0){
//         break;
//       } 
//     }
    
//     for(int i=0;i<a.length;i++){
//       System.out.println(a[i]);
//     } 
//   }
// }



// //no. of rounds = n-1 i.e 5-1=4 rounds are total required for sorting array.
// //if the values are String then use compareTo method ehich compares each Character in the String
// class BubbleSort{
//   public static void main (String[] args) {
//     String a[]={"cat","angel","babyy","pinkyish","catvilla"};
//     String temp;
//     for (int i=0;i<a.length;i++ )//no. of rounds
//     {
//       int flag=0; //if the comparison is happeing then it will break the outer loop
//       for (int j=0;j<a.length-1-i ;j++ )//comparison, i is used for not comparing the element with sorted array i.e from last,second last and so on.
//       {  
//           if (a[j].compareTo(a[j+1]) > 0)//if string 1>string2 then 1 else -1
//           {
//           temp=a[j+1];
//           a[j+1]=a[j];
//           a[j]=temp;
//           flag=1;
//           }
          
//       }
//       if (flag==0){
//         break;
//       } 
//     }
    
//     for(int i=0;i<a.length;i++){
//       System.out.println(a[i]);
//     } 
//   }
// }

// SELECTION SORT

// //selection sort selects the first element and compares it with all other elements if its smaller than swap then select next element and same process go on..
// //class SelectionSort{
// //   public static void main (String[] args) {
// //     int[] a={35,54,1,15,71,21};
// //     int temp=0,min;
// //     for (int i=0;i<a.length ;i++ )//selecting first element
// //     {
// //       min=i;
// //       for (int j=i+1;j<a.length ;j++ )//comparing with other element
// //       {
// //         if (a[j]<a[min]){
// //           min=j;
// //         } 
// //       }
// //       temp=a[i];
// //       a[i]=a[min];
// //       a[min]=temp;
// //     }
// //     for (int i=0;i<a.length;i++ ){
// //       System.out.println(a[i]);
// //     } 
// //   }
    
// // }

// class SelectionSort{
//   public static void main (String[] args) {
//     String[] a={"viraj","abby","dhoni","baby"};
//     String temp;
//     int min;
//     for (int i=0;i<a.length ;i++ )//selecting first element
//     {
//       min=i;
//       for (int j=i+1;j<a.length ;j++ )//comparing with other element
//       {
//         if (a[j].compareTo(a[min]) < 0){
//           min=j;
//         } 
//       }
//       temp=a[i];
//       a[i]=a[min];
//       a[min]=temp;
//     }
//     for (int i=0;i<a.length;i++ ){
//       System.out.println(a[i]);
//     } 
//   }
    
// }



// INSERTION SORT

// //assuming first element is sorted we will start comparing from second element then select 3 element and so on… if previous element is bigger then current element then swapping takes place.
// class InsertionSort{
//   public static void main (String[] args) {
//             //j=1
//             //temp=9
//     int a[]={3,9,2,6,7,10};
    
//  for (int i=1;i<a.length ;i++ ){
//    int j=i;
//    int temp=a[i];
   
//      while(j>0 && a[j-1]>temp){
//        a[j]=a[j-1];
//        j=j-1;
//      }
//      a[j]=temp;
  
    
//   }
//   for (int i=0;i<a.length ;i++ ){
//     System.out.print(a[i]+" ");
//   } 
  
//   }
// }

// MERGE SORT
// Merge sort is a divide and conquer algorithm. 
// public class MergeSort{
  
//   int arr[],temp[],length;

//   public static void main (String[] args) {
//     int inputArr[]={ 46,31,27,52,84,14};
//     MergeSort ms = new MergeSort();
//     ms.sort(inputArr);
    
//     for(int i:inputArr)
//     {
//       System.out.println(i+" ");
//     }
//   }
  
//   public void sort(int inputArr[]){
//     this.arr=inputArr;
//     this.length=inputArr.length;
//     this.temp=new int[length];
//     divideArr(0,length-1);
//   }
  
//   public void divideArr(int l,int r){
//     if(l<r){
//       int mid=(l+r)/2;
//       divideArr(l,mid);//To sort left half of the array
//       divideArr(mid+1,r);//To sort right half of the array
//       merge(l,mid,r);//to align left and right half into the main array. 
//     }
//   }
  
//  void merge(int l,int mid,int r){
//    for (int i=l;i<=r ;i++ ){
//      temp[i]=arr[i];// copy values of original array into temporary array
//    }
   
//    int i=l, j=mid+1, k=l;
//    while(i<=mid && j<=r){
//      if(temp[i]<=temp[j]){
//        arr[k]=temp[i];
//        i++;
//      }
//      else{
//       arr[k]=temp[j];
//       j++;
//      }
//      k++;
//    }
//    while(i<=mid){
//      arr[k]=temp[i];
//      k++;
//      i++;
// } 
  
// }
// }

// QUICK SORT

// //consider one of the element as pivot element that's first, last or middle then after that right side of pivot element will be smaller than pivot and right side of pivot element will be greater than then pivot and then quicksort method will call again pivot will be selected 

// class QuickSortMiddle
// {
  
//   public static void main (String[] args) {
//     int[] a=  { 15,9,7,13,12,16,4,18,11};
    
//     int length=a.length;
//     QuickSortMiddle qs=new QuickSortMiddle();
//     qs.Quicksort(a,0,length-1);
//     qs.printArr(a);
//   }
  
//   int partition(int a[],int low, int high)
//   {
    
//    int pivot=a[(low + high)/2];
   
//    while(low<high)
//    {
     
//      while(a[low]<pivot)
//      {
//        low++;
//      }
//      while(a[high]>pivot)
//      {
//        high--;
//      }
//      if (low<=high)//after certain time both low and high will be on the pivot element but swap        will not happen but ++ and -- will happen and due to that the main while will get false.
// {
//        int temp=a[low];
//        a[low]=a[high];
//        a[high]=temp;
       
//        low++;
//        high--;
//      } 
//    }
//    return low;
//   }
  
//   void Quicksort(int[] a, int low, int high)
//   {
//     int pi=partition( a, low,high);
//     if(low<pi-1)
//     {
//     Quicksort(a,low,pi-1);
//     }
//     if(pi<high)
//     {
//     Quicksort(a,pi,high);
//     }
         
    
//   }
  
//    void printArr(int arr[]){
//      for(int i:arr){
//        System.out.println(i+" ");
//      }
//    }
//   }

// LINEAR SEARCH

// //linear search is seacrhing technique that search for element in ascending way 
// class LinearIntScr{
//   public static void main (String[] args) {
//     int a[]={2,7,9,5,1,56};
    
//     int item=10;
//     int temp=0;
//     for (int i=0;i<a.length ;i++ ){
      
//       if (a[i]==item){
//         System.out.println("Element present at index "+i+" position");
//         temp=temp+1;
//       } 
//     }
    
//     if (temp==0){
//       System.out.println("Element not found");
//     } 
    
//   }
// }

// class LinearSrchString{
//   public static void main (String[] args) {
//     String a[]={"viraj","deepak","pritesh","nikon"};
    
//     String item="nikon";
//     int temp=0;
//     for (int i=0;i<a.length ;i++ ){
//       if (a[i].equals(item))
//       {
//         System.out.println("Element found at index "+i+" position");
//         temp=temp+1;
//       } 
//     }
    
//     if (temp==0){
//       System.out.println("Element not found");
//     } 
//   }
// }









// ARRAY PROGRAMS

// Find min and max

// // class MaxArray{
// //   public static void main (String[] args) {
// //     int a[]={1,4,6,8,10,22};
    
// //     int max=a[0];
// //     for(int i=1;i<a.length;i++){
      
// //       if(max<a[i]){
// //         max=a[i];
// //       }
// //     }
    
// //     System.out.println("max:"+max);
// // }
// // }

// class MinArray{
//   public static void main (String[] args) {
//     int a[]={1,4,6,8,0,22};
    
//     int min=a[0];
//     for(int i=1;i<a.length;i++){
      
//       if(min>a[i]){
//         min=a[i];
//       }
//     }
    
//     System.out.println("min:"+min);
// }
// }

// SECOND LARGEST ELEMENT

// Find the second largest element in an array.

// // class SecondLargest{
// //   public static void main (String[] args) {
    
// //     int a[]={1,32,56,76,3,12,65};
// //     int temp;
// //     for (int i=0;i<a.length ;i++ ){
// //       for (int j=i+1;j<a.length;j++ ){
        
// //         if(a[i]<a[j]){
// //           temp=a[i];
// //           a[i]=a[j];
// //           a[j]=temp;
// //         }
        

// //       }
// //       if(i==1){
// //           break;
// //         }
// //     }
    
// //     for (int k=0;k<a.length ;k++ ){
// //       System.out.println(+a[k]);
// //     } 
    
// //     System.out.println("Second Largest element is "+a[1]);
// // }}


// // another way of finding second largest element 

// class SecondLargest{
//   public static void main (String[] args) {
//     int a[]={1,5,2,8,4,12};
//     int largest=Integer.MIN_VALUE;
//     int Second_Largest=Integer.MIN_VALUE;
     
//      for (int i=0;i<a.length ;i++ ){
//        if(a[i]>largest){
//         Second_Largest=largest;
//         largest=a[i];
//        }
//        else if(a[i]>Second_Largest && a[i]!=largest){
//         Second_Largest=a[i]; 
//        }
//      }
     
//      System.out.println("Second Largest element "+Second_Largest);
    
    
    
// }
  
// }

// KTH LARGEST ELEMENT

// Find the kth largest element in an array.
// K can be any index, eg k=4 so what will be 4 largest element

// class KthLargestElement{
// public static void main (String[] args) {
//   int a[]={1,3,6,7,4,90,23,15};
  
//   int k=4;
//   for (int i=0;i<a.length-1 ;i++ ){
//     for(int j=i+1;j<a.length;j++){
      
//      if(a[i] < a[j])
//      {
//       int temp=a[i];
//       a[i]=a[j];
//       a[j]=temp;
//      }
//     }
//     if (i==k-1){
//       System.out.println(k+" Largest Element "+a[i]);
//       break;
    
      
//     } 
//   } 
  
//   for (int i=0;i<a.length;i++ ){
//     System.out.print(" "+a[i]);
//   } 
 
// }

// }

// DUPLICATE ELEMENTS IN ARRAY

// BRUTE FORCE METHOD : 
// one problem is that if the elements occur more than two then the program doesn't work properly.

// class DuplicateElement{
//   public static void main (String[] args) {
//     int a[]={2,5,1,7,2,5,2};
    
//     for (int i=0;i<a.length-1;i++ ){
//       for (int j=i+1;j<a.length ;j++ ){
//         if (a[i]==a[j] && (i!=j)){
//           System.out.println(a[i]+" ");
//         } 
//       } 
//     } 
// }}

// SET INTERFACE

// But has the same problem as the brute force method.

// import java.util.Set;
// import java.util.HashSet;


// class sample{
//   public static void main (String[] args) {
//     int a[]={3,5,7,1,3,8,9,3};
    
//     System.out.println("duplicate elements are: ");
//      Set<Integer> s=new HashSet<>();
//      for(int no:a){
//        boolean b=s.add(no);
//        if(b==false){
//          System.out.println(no+" ");
//        }
//      } 
//      }
//      }







// Getting error in the program.

// import java.util.Map;
// import java.util.HashMap;
// import java.util.Set;
// class DuplicateElement{
//   public static void main (String[] args) {
//     int a[]={3,5,3,7,9,8,7};
    
//     Map<Integer,Integer> hm=new HashMap<>();
    
//     for (int no:a )
//     {
//       Integer count=hm.get(no); 
//       if (count==null){
//         hm.put(no,1);
//       }
//       else{
//         count=count+1;
//         hm.put(no,count);
//       }
//     }
    
//     System.out.println("Duplicate Element are");
    
//     Set<Map.Entry<Integer,Integer>> es= hm.entry.Set();
//     for(Map.Entry<Integer,Integer> me : es){
//       if(me.getVaule() > 1){
//         System.out.println(me.getKey()+" ");
//       }
//     }
//   }
// }

// FIND FIRST DUPLICATE ELEMENT.

// // class FirstDuplicateElement{
// //   public static void main (String[] args) {
// //     int a[]={1,2,5,7,9,1};
// //     int temp=0;
// //     for (int i=0;i<a.length-1 ;i++ ){
// //       for(int j=i+1;j<a.length;j++){
// //         if ((a[i]==a[j]) && (i!=j)){
// //           temp++;
// //           System.out.println(a[j]);
// //           break;
// //         } 
// //       }
// //       if (temp>0){
// //         break;
// //       } 
// //     } 
// //   }
// // }

// //2 way
// import java.util.HashSet;
// class FirstDuplicateElement{
//   public static void main (String[] args) {
//     int a[]={1,4,6,7,4,1};
//     int temp=-1;
    
//     HashSet<Integer> hs=new HashSet<>();
    
//     for (int i=a.length-1;i>=0 ;i-- ) {
//       if(hs.contains(a[i])){
//         temp=i;
//       }
//       else{
//         hs.add(a[i]);
//       }
//     }
    
//     if(temp!=-1){
//       System.out.println("First Duplicate Element "+a[temp]);
//     }
//     else{
//       System.out.println("no duplicate Element");
//     }
    
//   }
// }





// ELEMENT THAT APPEAR ONLY ONCE

//  class FindSinleRep{
//   public static void main (String[] args) {
//     int a[]={ 1,2,3,3,2,1,4};
//     int res=a[0];
//     for (int i=1;i<a.length ;i++ ){
//       res=res^a[i];
//     }
//     System.out.println("single repeated element is "+res);
//   }
// }


// ODD AND EVEN FROM ARRAY 

// import java.util.ArrayList;
// class EvenOddNumber{
//   public static void main (String[] args) {
//     int a[]={5,4,7,9,10};
    
//     ArrayList<Integer> al1=new ArrayList<>();
//     ArrayList<Integer> al2=new ArrayList<>();
    
//     for (int i=0;i<a.length ;i++ ){
//       if (a[i]%2==0){
//         al1.add(a[i]);
//       }
//       else{
//         al2.add(a[i]);
//       }
//     }
//     int temp=0;
//     System.out.println("Even Number are: ");
//     for (int no : al1 ){
//       temp=temp+no;
//       System.out.print(no+" ");
//     }
//     System.out.println("\nTotal no. of even no's are: "+al1.size());
//     System.out.println("Sum of even no's are: "+temp);
    
//     int total=0;
//     System.out.println("\nOdd Number are: ");
//     for (int no : al2 ){
//       total=total+no;
//       System.out.print(no+" ");
//     }
//     System.out.println("\nTotal no. of odd no's are: "+al2.size());
//     System.out.println("Sum of odd no's are: "+total);
    
//   }
// }


// FIND MISSING NUMBER

// //if array has 5 elements then total no of elements=5 and expected_no of elements=6 so total+1;

// // class FindMissingNumber{
// //   public static void main (String[] args) {
// //     int a[]={1,2,3,4,6};
    
// //     int expected_no_element=a.length+1;
    
// //     int total_sum=expected_no_element*(expected_no_element+1)/2;
    

// //   int sum=0;
   
// //   for (int i=0;i<a.length ;i++ ){
// //     sum=sum+a[i];
// //   } 
   
// //     System.out.println("Missing Number is "+(total_sum-sum));
// //   }
// // }

















// //Another way is XOR 


// class FindMissingNumber2{
//   public static void main (String[] args) {
//     int a[]={1,2,3,4,6};
    
//     int xor1=a[0];
//     for (int i=1;i<a.length ;i++ ){
//       xor1=xor1^a[i];
//     }
    
//     int xor2=1;
//     for (int i=2;i<=(a.length+1) ;i++ ){
//       xor2=xor2^i;
//     } 
    
//     System.out.println(xor1^xor2);
  
//   }
// }

// COMMON ELEMENT FROM  ARRAYS

// import java.util.HashSet;
// class CommonElement{
//   public static void main (String[] args) {
//     int a[]={4,5,6,7,1,4};
    
//     int b[]={4,8,9,0,1};
    
//     HashSet<Integer> hs =new HashSet<>();
    
//     for (int i=0;i<a.length ;i++ ){
//       for (int j=0;j<b.length ;j++ ){
//         if (a[i]==b[j]){
//           hs.add(a[i]);
//           break;
//         } 
//       } 
//     }
    
//     for(int no:hs){
//       System.out.println(no);
//     }
    
    
//   }
  
// }

// //this code will only work if the array does not have duplicae element in its own array

// // import java.util.HashSet;
// // class CommonElement{
// //   public static void main (String[] args) {
// //     int a[]={4,5,6,7,1,4};
    
// //     int b[]={4,8,9,0,1,1};
    
// //     HashSet<Integer> hs =new HashSet<>();
    
// //     for (int no:a){
// //       hs.add(no);
// //     } 
    
// //     for (int no:b ){
// //     boolean k= hs.add(no);
     
// //     if (k==false){
// //       System.out.println(no);
// //     } 
// //     } 
    
// //   }
// // }

// //if it has duplicate elements in its own array.

// import java.util.HashSet;
// class CommonElement{
//   public static void main (String[] args) {
//     int a[]={4,5,6,7,1,4,5};
    
//     int b[]={4,8,9,0,1,1};
    
//     HashSet<Integer> hs1 =new HashSet<>();
//     HashSet<Integer> hs2 =new HashSet<>();
    
//     for(int no:a){
//       hs1.add(no);
//     }
    
//     for (int no:b ){
//       hs2.add(no);
//     }
    
//     for(int no:hs2){
//      boolean k= hs1.add(no);
     
//      if (k==false) {
//        System.out.println(no);
//      }
//     }
    
//   }
// }


// FIND COMMON ELEMENT FROM 3 ARRAYS

// //all the arrays are sorted from which common elements have to find out.
// import java.util.ArrayList;
// class CommonElementOf3Array{
//   public static void main (String[] args) {
//     int a[]={1,3,4,6,7,9,10};
    
//     int b[]={1,2,3,10,14};
    
//     int c[]={1,3,10,40};
    
//     int x=0,y=0,z=0;
//     //start comparing from 0th element 
//     ArrayList<Integer> al =new ArrayList<>();
//     while(x<a.length && y<b.length && z<c.length){
//       if (a[x]==b[y] && b[y]==c[z]){
//         al.add(a[x]);
//         x++;
//         y++;
//         z++;
//       }
//       else if(a[x]<b[y]){
//         x++;
//       }
      
//       else if (b[y]<c[z]){
//         y++;
//       } 
//       else{
//         z++;
//       }
//     }
    
//     for (int no:al ){
//       System.out.println(no);
//     } 
//     }
// }


// LONGEST CONSECUTIVE SEQUENCE  IN AN ARRAY.

// //longest subsequence is 4, bcoz 1+2+3+4=4. other are only 9,10. and 20. 
// import java.util.HashSet;
// class LongestConsecutiveSeq{
//   public static void main (String[] args) {
//     int a[]={3,9,1,10,4,20,2};
    
//     HashSet<Integer> hs=new HashSet<>();
    
//     for (int no:a )//adding all the elements in hashset 
//     {
//       hs.add(no);
//     }
//     int long_length=0;
//     for (int i=0;i<a.length ;i++ )
//     {
//     if (!hs.contains(a[i]-1))//if 3-1=2 is present than dont start from 3 increment index by 1 and if 1-1=0 is present in hash which is not so start traverse array from there.   
//     {
//       int no=a[i];
//       while(hs.contains(no))
//       {
//        no++; 
//       }
      
//       if (long_length<no-a[i])//no-a[i] is written bcoz everytime we get an subsequence 1 no wil be more bcoz of while loop.
//       {
//         long_length=no-a[i];
//       } 
//      }   
//     } 
    
//     System.out.println(long_length);
//   }
// }






















// OOPS

















// ABSTRACT VS INTERFACE
 
// Abstract:when we don't want someone to create an object of our class then we declare our class as an abstract class. initialize and also declare the methods. Any class which extends abstract class it is compulsory to define the declared methods  

// Interface: it is the same as abstract,only few differences we can achieve multiple inheritance we can implement multiple interfaces. Only declare the methods in interface by default abstract method 

// COLLECTION FRAMEWORK 









