package javaday1;

public class Vowels {
	public static void main(String args[])
	{
		String a="nageswar rao";
		System.out.println("the vowels of the string are");
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i)=='a'|| a.charAt(i)=='e' ||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u')
					System.out.println(a.charAt(i));
		}
	}
}
