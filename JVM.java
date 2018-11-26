class JVM
{
	public static void main(String a[])
	{
		long l=Runtime.getRuntime().totalMemory();
		l=l/(1024*1024);
		System.out.println(l+" MB");
	}
}