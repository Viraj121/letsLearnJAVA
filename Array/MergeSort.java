// MERGE SORT
// Merge sort is a divide and conquer algorithm. 
public class MergeSort{
  
  int arr[],temp[],length;

  public static void main (String[] args) {
    int inputArr[]={ 46,31,27,52,84,14};
    MergeSort ms = new MergeSort();
    ms.sort(inputArr);
    
    for(int i:inputArr)
    {
      System.out.println(i+" ");
    }
  }
  
  public void sort(int inputArr[]){
    this.arr=inputArr;
    this.length=inputArr.length;
    this.temp=new int[length];
    divideArr(0,length-1);
  }
  
  public void divideArr(int l,int r){
    if(l<r){
      int mid=(l+r)/2;
      divideArr(l,mid);//To sort left half of the array
      divideArr(mid+1,r);//To sort right half of the array
      merge(l,mid,r);//to align left and right half into the main array. 
    }
  }
  
 void merge(int l,int mid,int r){
   for (int i=l;i<=r ;i++ ){
     temp[i]=arr[i];// copy values of original array into temporary array
   }
   
   int i=l, j=mid+1, k=l;
   while(i<=mid && j<=r){
     if(temp[i]<=temp[j]){
       arr[k]=temp[i];
       i++;
     }
     else{
      arr[k]=temp[j];
      j++;
     }
     k++;
   }
   while(i<=mid){
     arr[k]=temp[i];
     k++;
     i++;
} 
  
}
}
