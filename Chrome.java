import java.util.*;
class Chrome
{
	public static void main(String a[])throws Exception
	{
		System.out.println("1. You Tube");
		System.out.println("2. Facebook");
		System.out.println("3. Yahoo");
		System.out.println("4. Google Drive");
		String s="";
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter choice ");
		int opt=sc.nextInt();
		switch(opt)
		{
			case 1:
			s="https://www.youtube.com/watch?v=kJQP7kiw5Fk";
			break;
			case 2:
			s="Facebook.com/login.php?email=bansalvipul.7@gmail.com&pass=123456789";
			break;
			case 3:
			s="Yahoo.com";
			break;
			case 4:
			s="\"Google Drive\"";
			break;
			default:
			System.out.println("Invalid choice");
			System.exit(0);
		}
		Runtime r=Runtime.getRuntime();
		r.exec("\"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe \""+s);
		//r.exec("\"C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe \""+s);
	}
}

