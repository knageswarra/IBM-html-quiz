package javaday1;

public class Greatest {
	
		public static void main(String args[])
		{
			int a=50;
			int b=8;
			int c=4;
			int d=7;
			if(a>b && a>c && a>d)
				System.out.print("a is greatest");
			else if(b>c && b>d)
				System.out.println("b is greatest");
			else if(c>d)
				System.out.println("c is greatest");
			else
				System.out.println("d is greatest");
		}

	}


