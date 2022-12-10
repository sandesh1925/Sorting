class InsertionSort
{
	static void insertion_sort(int x[], int n)
	{
		int value;
		int i,j;
		for(i=1;i<n;i++)
		{
			value=x[i];
			for(j=i-1;j>=0;j--)
			{
			 	if(value<x[j])
				{
					x[j+1]=x[j];
				}
				else
				{
					break;
				}
			}
				x[j+1]=value;
		}
	}
	public static void main(String as[])
	{
	 
	 int x[]={4,3,2,10,12,1,5,6};
     insertion_sort(x,8);   
	 for(int i=0;i<8;i++)
	 {
		System.out.println(x[i]);	  
	 }     
	}
}  