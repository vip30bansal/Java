import java.util.*;
class Game
{
	public static void main(String a[])
	{
		int ms=21;
		Scanner sc=new Scanner(System.in);
		System.out.print("User Name: ");
		String s=sc.nextLine();
		System.out.println(ms+" match sticks left");
		while(ms>1)
		{
			System.out.println(s+" Choice: ");
			int n=sc.nextInt();
			if(!(n>=1&&n<=4))
			{
				System.out.println("Invalid Case,,Please try Again...!!!");
				continue;
			}
			System.out.println("Computer picked: "+(5-n));
			ms=ms-5;
			System.out.println(ms+" match sticks left");
		}
		System.out.println("You Lost !!!!");
	}
}

