import java.util.Arrays;

//kunal kushwaha search for element in 2d array and find max in 2d array
class Twoarray
{
	public static void main(String[] args)
	 {
		int a[][]=
		{
			{12,14,16},
			{18,29,188},
			{65,98,833}
		};

		System.out.println(max(a));



		int target=18;

		int ans[]=search(a,target);

		System.out.println(Arrays.toString(ans));
	}

	static int[] search(int a[][],int target)
	{
		for (int i=0;i<a.length ; i++)
		 {
			for (int j=0;j<a[i].length ;j++ ) 
			{
				if (a[i][j]==target)
				 {
					return  new int[] {i,j};
				}
				
			}
		}

		return new int[]{-1,-1};
     
	}

	static int max(int a[][])
	{
		int max=Integer.MIN_VALUE;

		for (int i[]:a)
		 {
			for (int j:i) 
			{
				if (j>max)
				 {
					max=j;
				}
				
			}
		}

		return max;
    
	}
}