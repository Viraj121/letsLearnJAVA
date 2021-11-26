public class Binarysearch {
    public static void main(String[] args) {
       int arr[]={1,3,6,8,9,10};
       int target=8;

       int ans=srch(arr,target);
       
       System.out.println(ans);
    }

    static int srch(int arr[],int target){

        int start=0;
        int end=arr.length-1;
        

        while (start<=end) {
            int mid=(start+end)/2;

            if(target>arr[mid])
            {
                start=mid+1;
            }else if(target<arr[mid]){
                end=mid-1;
            }else{
                return mid;
            }
        }

        return -1;

    }
}
