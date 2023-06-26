package javaday1;

public class Stringreverse {
    public static void main(String args[])
    {
    	String s="nagesh";
    	int l=s.length();
    	String s1="";
    	for(int i=l-1;i>=0;i--)
    	{
    		s1=s1+s.charAt(i);
    	}
    	System.out.println("the reverse of a string is "+s1);
    }
}
