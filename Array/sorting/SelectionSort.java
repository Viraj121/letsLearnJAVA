package sorting;
// SELECTION SORT

//selecton sort is a combination of searching and sorting. it sorts an array by repeatedly finding the minimum element(consider ascending order)
// from unsorted part and putting it at the beginning.
//In  every iteration of selection sort, the minimum element from the unsorted subarray is picked and moved to the sorted subarray

//selection sort selects the first element and compares it with all other elements if its smaller than swap 
//then select next element and same process go on..

class SelectionSort{
  public static void main (String[] args) {
    int[] a={35,54,17,15,1,71,21};
    int temp=0,min;
    for (int i=0;i<a.length ;i++ )//selecting first element
    {
      min=i;
      for (int j=i+1;j<a.length ;j++ )//comparing with other element until it gets smallest in array. min will be 17 then 15 then 1,so 
      //1 is the smallest element then swap with 35.
      {
        if (a[j]<a[min])
        {
          min=j;
        } 
      }
      temp=a[i];
      a[i]=a[min];
      a[min]=temp;
    }
    for (int i=0;i<a.length;i++ ){
      System.out.print(a[i]+" ");
    } 
  }
}

class SelectionSort1{
  public static void main (String[] args) {
    String[] a={"viraj","abby","dhoni","baby"};
    String temp;
    int min;
    for (int i=0;i<a.length ;i++ )//selecting first element
    {
      min=i;
      for (int j=i+1;j<a.length ;j++ )//comparing with other element
      {
        if (a[j].compareTo(a[min]) < 0){
          min=j;
        } 
      }
      temp=a[i];
      a[i]=a[min];
      a[min]=temp;
    }
    for (int i=0;i<a.length;i++ ){
      System.out.println(a[i]);
    } 
  }
    
}

