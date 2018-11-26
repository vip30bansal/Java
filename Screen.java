import java.awt.*;
class Screen
{
	 public static void main(String a[])
	{
		Toolkit t=Toolkit.getDefaultToolkit();
		Dimension d=t.getScreenSize();
		int sw=(int)(d.getWidth());
		int sh=(int)(d.getHeight());
		System.out.println("width is "+sw);
		System.out.println("height is "+sh);	
	}
}