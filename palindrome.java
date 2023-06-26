package javaday1;

public class palindrome {
  public static void main(String args[])
  {
	 int a=121;
	 int t=a;
	 int s=0;
	 while(a>0)
	 {
		 int r=a%10;
		 s=(s*10)+r;
		 a=a/10;
		 
	 }
	 if(t==s)
		 System.out.print("palindrome number");
	 else
		 System.out.print("not a palindrome number");
  }
}
