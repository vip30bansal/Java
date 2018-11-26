class  Captcha
{
	Captcha()
	{
		int i=0;
		String s="";
		while(i<6)
		{
				
				int a=(int)(123*Math.random());
				if((a>=48&&a<=57)||(a>=65&&a<=90)||(a>=97&&a<=122))
				{
					char x=(char)(a);
					//System.out.print(i+" "+a+" "+x);
					String s1=""+x;
					s=s+s1;
					i++;
				}
		}
		System.out.println(s);
	}
	public static void main(String ar[])
	{	
		new Captcha();		
	}

}