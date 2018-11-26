import java.io.*;
class List
{
	public static void main(String a[])
	{
		File f=new File("C:/");
		String s[]=f.list();
		int len=s.length;
		for(int i=0;i<=len;i++)
			System.out.println(s[i]);
	}
}