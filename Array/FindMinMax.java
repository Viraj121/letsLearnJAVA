// Find min and max

// class MaxArray{
//   public static void main (String[] args) {
//     int a[]={1,4,6,8,10,22};
    
//     int max=a[0];
//     for(int i=1;i<a.length;i++){
      
//       if(max<a[i]){
//         max=a[i];
//       }
//     }
    
//     System.out.println("max:"+max);
// }
// }

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

// // Java program of above implementation
// public class GFG {
// /* Class Pair is used to return two values from getMinMax() */
// 	static class Pair {

// 		int min;
// 		int max;
// 	}

// 	static Pair getMinMax(int arr[], int n) {
// 		Pair minmax = new Pair();
// 		int i;

// 		/*If there is only one element then return it as min and max both*/
// 		if (n == 1) {
// 			minmax.max = arr[0];
// 			minmax.min = arr[0];
// 			return minmax;
// 		}

// 		/* If there are more than one elements, then initialize min
// 	and max*/
// 		if (arr[0] > arr[1]) {
// 			minmax.max = arr[0];
// 			minmax.min = arr[1];
// 		} else {
// 			minmax.max = arr[1];
// 			minmax.min = arr[0];
// 		}

// 		for (i = 2; i < n; i++) {
// 			if (arr[i] > minmax.max) {
// 				minmax.max = arr[i];
// 			} else if (arr[i] < minmax.min) {
// 				minmax.min = arr[i];
// 			}
// 		}

// 		return minmax;
// 	}

// 	/* Driver program to test above function */
// 	public static void main(String args[]) {
// 		int arr[] = {1000, 11, 445, 1, 330, 3000};
// 		int arr_size = 6;
// 		Pair minmax = getMinMax(arr, arr_size);
// 		System.out.printf("\nMinimum element is %d", minmax.min);
// 		System.out.printf("\nMaximum element is %d", minmax.max);

// 	}

// }


//class FindMinMax{
// 	public static void main(String[] args) {
// 		int[] arr={1,3,4,5,8,9};
//         int n=arr.length;
// 	int min,max;

// 	if (arr[0]>arr[1]) {
// 		max=arr[0];
// 		min=arr[1];
// 	}
// 	else {
// 		max=arr[1];
// 		min=arr[0];
// 	}

// 	for (int i=2;i<n ;i++ ) {
// 		if (arr[i]>max) {
// 			max=arr[i];
// 		}
// 		else if(arr[i]<min){
//              min=arr[i];
// 		}
// 	}
// 	System.out.println("max "+max);
// 	System.out.println("min "+min);
// 	}

// }


// same as camparison between first 2 elements min and max then at a time 2 comparison
// class FindMinMax
// {
// 	public static void main(String[] args) {
// 	     int[] a={90,3,4,5,8,9,2,58,7};
//          int n=a.length;
// 	     int min,max;
// 	     int i;

// 	if(n%2==0){

// 		if (a[0]>a[1]) {
// 		max=a[0];
// 		min=a[1];
// 	}
// 	else {
// 		max=a[1];
// 		min=a[0];
// 	}
// 	i=2;
// }
// else
// {
// 	max=a[0];
// 	min=a[0];
// 	i=1;
// }

// while(i<n-1){
// 	if(a[i]>a[i+1])
// 	{
// 		if(a[i]>max)
// 		{
// 			max=a[i];
// 		}
// 		else if(a[i+1]<min)
// 		{
//             min=a[i+1];
// 		}
// 	}
// 	else
// 	{
// 		if(a[i]<a[i+1])
// 		{
//           if(a[i+1]>max)
//           {
//           	max=a[i+1];
//           }
//           else if(a[i]<min)
//           {
//           	min=a[i];
//           }
// 		}
// 	}
// 	i+=2;
// }
// 	System.out.println("max "+max);
// 	System.out.println("min "+min);

// 	}
// }

// Java program of above implementation
public class FindMinMax {
/* Class Pair is used to return two values from getMinMax() */
	static class Pair {

		int min;
		int max;
	}

	static Pair getMinMax(int arr[], int low, int high) {
		Pair minmax = new Pair();
		Pair mml = new Pair();
		Pair mmr = new Pair();
		int mid;

		// If there is only one element
		if (low == high) {
			minmax.max = arr[low];
			minmax.min = arr[low];
			return minmax;
		}

		/* If there are two elements */
		if (high == low + 1) {
			if (arr[low] > arr[high]) {
				minmax.max = arr[low];
				minmax.min = arr[high];
			} else {
				minmax.max = arr[high];
				minmax.min = arr[low];
			}
			return minmax;
		}

		/* If there are more than 2 elements */
		mid = (low + high) / 2;
		mml = getMinMax(arr, low, mid);
		mmr = getMinMax(arr, mid + 1, high);

		/* compare minimums of two parts*/
		if (mml.min < mmr.min) {
			minmax.min = mml.min;
		} else {
			minmax.min = mmr.min;
		}

		/* compare maximums of two parts*/
		if (mml.max > mmr.max) {
			minmax.max = mml.max;
		} else {
			minmax.max = mmr.max;
		}

		return minmax;
	}

	/* Driver program to test above function */
	public static void main(String args[]) {
		int arr[] = {1000, 11, 445, 1, 330, 3000};
		int arr_size = 6;
		Pair minmax = getMinMax(arr, 0, arr_size - 1);
		System.out.printf("\nMinimum element is %d", minmax.min);
		System.out.printf("\nMaximum element is %d", minmax.max);

	}
}

