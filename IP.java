import java.net.*;
class IP
{
	System.out.println("Hello");
	public static void main(String a[])throws Exception
	{
		System.out.println("Hello anand");
		InetAddress adr=InetAddress.getLocalHost();
 		String ip=adr.getHostAddress();
		System.out.println(ip);
	}
}