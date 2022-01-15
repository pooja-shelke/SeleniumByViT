package Problem_On_Number;

/*
Check whether alphabets are vowel or not.If Vowel Return true else return false. 
input -A
output- True

input -M
output- False
*/
import java.util.*;

class Convert
{
	boolean ChkVowel(char ch)
	{
		if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u')||(ch=='A')||(ch=='E')||                              (ch=='I')||(ch=='O')||(ch=='U') )
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static void main(String args[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter character");
		char ch=sobj.next().charAt(0);
		
		Convert obj=new Convert();
		
		
		boolean ret=obj.ChkVowel(ch);
		
		if(ret==true)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		
		sobj.close();
	
	}
}