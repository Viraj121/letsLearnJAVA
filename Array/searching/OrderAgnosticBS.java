//to check the array is ascending or descending and working accordingly.
class OrderAgnosticBS{
	public static void main(String[] args) {
		int arr[]={9,7,5,3,2,1};

		int target=2;

		int ans=orderAgnosticBS(arr,target);

		System.out.println(ans);
	}

	static int orderAgnosticBS(int arr[],int target){

		int start=0;
		int end=arr.length-1;

		//find whether the array is sorted in ascending or descending order.
		boolean acs=arr[start]<arr[end];

		while(start<=end){
			int mid=(start+end)/2;

			if (arr[mid]==target) {
				return mid;
			}

			if(acs)
			{
				if(target>arr[mid])
				{
                start=mid+1;
                }else 
                {
                end=mid-1;
                }
            }
            else{
            	if(target<arr[mid]){
                start=mid+1;
            }else {
                end=mid-1;
            }
		}
	}

		return -1;

	}
}
