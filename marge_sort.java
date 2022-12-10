class MargeSort
{
	static void merging_array(int x[],int first[],int last[],int m1,int m2)
    {
		int i=0,j=0,k=0;
		for(;i<m1&&j<m2;)
		{
			if(first[i]<last[j])
		    {
				x[k++]=first[i++];
			}
			else
			{
				x[k++]=last[j++];
			}
		}
		while(i<m1){ x[k++]=first[i++];}
		while(j<m2){ x[k++]=last[j++];}
		
	}
	static void breaking_array(int x[],int n)
	{
	   if(n==1)return;
	   int i=0;
	   int m1=n/2;
	   int m2=n-m1;
	   int first[]=new int[m1];
	   int last[]=new int[m2];
	   for(i=0;i<m1;i++)
	   {
		   first[i]=x[i];
	   }
	   for(i=0;i<m2;i++)
	   {
		   last[i]=x[m1+i];
	   }
	   breaking_array(first,m1);
	   breaking_array(last,m2);
	   merging_array(x,first,last,m1,m2);
	}
	public static void main(String as[])
	{
	 
	 int x[]={7,3,2,16,24,4,11,9};
     breaking_array(x,8);   
	 for(int i=0;i<8;i++)
	 {
		System.out.println(x[i]);	  
	 }     
	}
}  