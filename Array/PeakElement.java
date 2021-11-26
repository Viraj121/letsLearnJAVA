//peak element is the elements which is greater than its neighbouring elements.
//3 corner cases-
//Ascending array:last element is peak element 
//desending array:first elements is peak element
//for all same element:each element is peak element.
//we have used binary search to find. 
class PeakElement{

	static int FindPeak(int arr[],int low,int high,int n){
		int mid=low+(high-low)/2;

		if ((mid==0 || arr[mid-1]<=arr[mid])  && (mid==n-1 || arr[mid+1]<=arr[mid])) 
		 {
			return mid;
		}

		else if(mid>0 && arr[mid-1]>arr[mid])
		{
           return FindPeak(arr,low,mid-1,n);
		}

		else{
			return FindPeak(arr,mid+1,high,n);
		}
	}
public static void main(String[] args) {
	int arr[]={0,6,8,5,7,9};
	int n=6;

	System.out.println("peak element index is  "+FindPeak(arr,0,n-1,n));
}
}



//geeksforgeeks question. in this program only one function is added and all is same as above.
// A Java program to find a peak
// element using divide and conquer
// import java.util.*;
// import java.lang.*;
// import java.io.*;

// class PeakElement {
//     // A binary search based function
//     // that returns index of a peak element
//     static int findPeakUtil(
//         int arr[], int low, int high, int n)
//     {
//         // Find index of middle element
//         // (low + high)/2
//         int mid = low + (high - low) / 2;

//         // Compare middle element with its
//         // neighbours (if neighbours exist)
//         if ((mid == 0 || arr[mid - 1] <= arr[mid])
//             && (mid == n - 1 || arr[mid + 1] <= arr[mid]))
//             return mid;

//         // If middle element is not peak
//         // and its left neighbor is
//         // greater than it, then left half
//         // must have a peak element
//         else if (mid > 0 && arr[mid - 1] > arr[mid])
//             return findPeakUtil(arr, low, (mid - 1), n);

//         // If middle element is not peak
//         // and its right neighbor
//         // is greater than it, then right
//         // half must have a peak
//         // element
//         else
//             return findPeakUtil(
//                 arr, (mid + 1), high, n);
//     }

//     // A wrapper over recursive function
//     // findPeakUtil()
//     static int findPeak(int arr[], int n)
//     {
//         return findPeakUtil(arr, 0, n - 1, n);
//     }

//     // Driver method
//     public static void main(String[] args)
//     {
//         int arr[] = { 1, 3, 20, 4, 1, 0 };
//         int n = arr.length;
//         System.out.println(
//             "Index of a peak point is " + findPeak(arr, n));
//     }
// }