import java.util.*;
class Time
{
	public static void main(String a[])
	{
		/*long l=System.currentTimeMillis();
		System.out.println(l);
                            	l=(l/1000);
                            	String sec=l%60+"";
		l=l/60;
                            	String min=l%60+"";
		l=l/60;
                            	String hour=l%24+"";
		l=l/24;
                            	String day=l%365+"";
		String year=l/365+"";
		System.out.println("Seconds = "+sec);
		System.out.println("Minutes = "+min);
		System.out.println("Hours = "+hour);
		System.out.println("Days = "+day);
		System.out.println(year+":"+day+":"+hour+":"+min+":"+sec);*/
		Calendar c=Calendar.getInstance();
        		String dt=c.get(Calendar.DATE)+"/"+(c.get(Calendar.MONTH)+1)+"/"+c.get(Calendar.YEAR)+" "+c.get(Calendar.HOUR)+":"   				+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND);
		System.out.println(dt);
	}
}