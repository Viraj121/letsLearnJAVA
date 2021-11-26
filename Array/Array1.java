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
class Array2d{
  public static void main (String[] args) {
    int[][] a={{1,2,3,4},{2,3,4},{6,7,8}};
  
    for (int i=0;i<a.length ;i++ ){
      for (int j=0;j<a[i].length ;j++ ){
        System.out.print(a[i][j]+" ");
      } 
      System.out.println();
    } 
    
  }
}

// //3D array
class Array3d{
  public static void main (String[] args) {
    int[][][] a={{{1,2,3,4},{2,3,4},{6,7,8}}};
  
    for (int i=0;i<a.length ;i++ )//outer array
    {
      for (int j=0;j<a[i].length ;j++ )//inner array
      {
      for (int k=0;k<a[i][j].length ;k++ ) //inner most array
      {
        System.out.print(a[i][j][k]+" ");
      } 
      System.out.println();
    } 
    
    }
    
  }
}

 //2d aaray using enhanced for loop.
class araay2d{
  public static void main (String[] args) {
    int [][] a ={{1,2,3},
                {1,2,3}
                };
                 
    for(int i[]:a){
      for(int j:i){
        System.out.print(j+" ");
      }
      System.out.println();
    }
      
  }
}

// anonymous array:
// array which has no name.they are used only once
// synax: new int[]{2,13,14};

class AnonArray{
  public static void main (String[] args) {
    AnonArray.fun(new int[][]{{12,1,2},{1,2,3}});
    
  }
  
  static void fun(int[][] i){
    int total=0;
    for(int var[]: i){
      for(int j:var){
      total=total+j; 
      }
      
    }
    System.out.println("sum of array is "+total);
    }
  }

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