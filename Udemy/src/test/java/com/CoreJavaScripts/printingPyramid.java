package com.CoreJavaScripts;

/*Example:
	1 2 3 4
	5 6 7
	8 9 
	10
*/
public class printingPyramid {

	public static void main(String[] args) {

		int k=1;
		for(int i=0;i<=4;i++)
		{
			for(int j=1;j<=4-i;j++)
			{
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
			
			System.out.println("");		
		}
		
		/*
		 * String str="amma amm"; String str1=str.replaceAll("\\s+", "");
		 * System.out.println(str1); String str2="amm45%^&nhdk"; String
		 * str3=str2.replaceAll("[^a-zA-Z0-9]", ""); System.out.println(str3);
		 */

	}

}
