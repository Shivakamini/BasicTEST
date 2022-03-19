package com.CoreJavaScripts;

/*Example:
	2 4 5
	3 4 7
	1 2 9*/
	
public class ArraysAssignment {

	public static void main(String[] args) {

		int a[][]= {{6,4,5},{10,8,7},{2,3,9}};
		int min=a[0][0];
		int minColumn=0;
		/*
		 * for(int x[]:a) for(int e:x) { System.out.println(e); if(e<min) { min=e; } }
		 */
		
		
		  for(int i=0;i<a.length;i++) 
		  { 
			  for(int j=0;j<a.length;j++) 
			  {
		  System.out.println(a[i][j]);
		  
		  if(a[i][j]<min) {
			  min=a[i][j];
			  System.out.println(a[i][j]+" "+i+" "+j);
			  minColumn=j;
		  }
		  } }
	
		System.out.println("min column"+minColumn);
		System.out.println("min is: "+min);
		
		
		/*
		 * if(a[0][minColumn]>a[1][minColumn]&&a[0][minColumn]>a[2][minColumn]) {
		 * System.out.println("max is: "+a[0][minColumn]); } else {
		 * if(a[1][minColumn]>a[0][minColumn]&&a[1][minColumn]>a[2][minColumn]) {
		 * System.out.println("max is: "+a[1][minColumn]); } else {
		 * System.out.println("max is: "+a[2][minColumn]); } }
		 */
		
		int max=a[0][minColumn];
		int k=0;
		while(k<3)
		{
			if(a[k][minColumn]>max)
			{
				max=a[k][minColumn];
			}
			k++;
		}
		
		System.out.println("max is "+max);
	}

}
