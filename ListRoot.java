import java.io.*;
class ListRoot
{
	public static void main(String a[])
	{
		File f[]=File.listRoots();
		int len=f.length;
		for(int i=0;i<=len;i++)
			System.out.println(f[i].getPath());
	}
}