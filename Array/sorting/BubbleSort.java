package sorting;
// (Use of sorting technique is that if we are applying binary search technique but for that we need all the elements to be sorted,
// if they are not then we can use any sorting technique to sort them).

// BUBBLE SORT

//no. of rounds = n-1 i.e 5-1=4 rounds are total required for sorting array.

class BubbleSort1{
  public static void main (String[] args) {
    int a[]={ 90,20,70,40,10 };
    int temp;
    for (int i=0;i<a.length;i++ )//no. of rounds, if i write a.length-1 it will work same.
    {
      int flag=0; //if the comparison is not happeing then it will break the outer loop
      for (int j=0;j<a.length-1-i ;j++ )//comparison, i is used for not comparing the element with sorted array
                                        // i.e from last,second last and so on.
                                         //a.length-1 is written bcoz it takes n-1 comparison + (-i) for next round 3 comparison,then 2 and so on.
      {  
          if (a[j]>a[j+1]){
          temp=a[j+1];
          a[j+1]=a[j];
          a[j]=temp;
          flag=1;
          }
          
      }
      if (flag==0)//if all the elements are sorted.
      {
        break;
      } 
    }
    
    for(int i=0;i<a.length;i++){
      System.out.print(a[i]+" ");
    } 
  }
}



// //no. of rounds = n-1 i.e 5-1=4 rounds are total required for sorting array.
// //if the values are String then use compareTo method ehich compares each Character in the String

class BubbleSort2{
  public static void main (String[] args) {
    String a[]={"cat","angel","babyy","pinkyish","catvilla"};
    String temp;
    for (int i=0;i<a.length;i++ )//no. of rounds
    {
      int flag=0; //if the comparison is happeing then it will break the outer loop
      for (int j=0;j<a.length-1-i ;j++ )//comparison, i is used for not comparing the element with sorted array i.e from last,second last and so on.
      {  
          if (a[j].compareTo(a[j+1]) > 0)//if string 1>string2 then 1 else -1
          {
          temp=a[j+1];
          a[j+1]=a[j];
          a[j]=temp;
          flag=1;
          }
          
      }
      if (flag==0){
        break;
      } 
    }
    
    for(int i=0;i<a.length;i++){
      System.out.println(a[i]);
    } 
  }
}
