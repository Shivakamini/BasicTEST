package com.CoreJavaScripts;

/*Example:
	3 
	6 9
	12 15 18*/
	
public class PyramidAssigment {

	public static void main(String[] args) {
		
		int k=3;
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(k);
				System.out.print("\t");
				k+=3;
			}
			System.out.println("");
		}

	}

}
