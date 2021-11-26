// INSERTION SORT

// //assuming first element is sorted we will start comparing from second element then select 3 element and so on… 
//if previous element is bigger then current element then swapping takes place.
class InsertionSort{
  public static void main (String[] args) {
           
    int a[]={5,1,6,2,4,3};
    
 for (int i=1;i<a.length ;i++ ){
   int j=i;
   int temp=a[i];
   
     while(j>0 && a[j-1]>temp)
     {
       a[j]=a[j-1];
       j=j-1;
     }
     a[j]=temp;
  
    
  }
  for (int i=0;i<a.length ;i++ ){
    System.out.print(a[i]+" ");
  } 
  
  }
}