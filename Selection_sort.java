class SelectionSort
{
	static void selection_sort(int x[], int n)
	{
	 int i,j,min,t;
       for(i=0;i<n-1;i++)
	   {
		   min=i;
		   for(j=i+1;j<n;j++)
		   {
			   if(x[min]>x[j])
			   {
				   min=j;
			   }
		   }
		   if(i!=min)
		   {
			   t=x[i];
			   x[i]=x[min];
			   x[min]=t;
		   }
	   }		   
	}
	public static void main(String as[])
	{
	 
	 int x[]={7,4,5,9,8,2,1};
     selection_sort(x,7);   
	 for(int i=0;i<7;i++)
	 {
		System.out.println(x[i]);	  
	 }     
	}
}  