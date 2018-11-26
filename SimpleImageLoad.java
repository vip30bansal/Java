import java.awt.*;
import java.applet.*;
public class SimpleImageLoad extends Applet
{
	Image img;
	public void init() 
	{
		img = getImage(getDocumentBase(), getParameter("images.jpg"));
	}
	public void paint(Graphics g)
	{
		g.drawImage(img, 100, 100, this);
	}
	public static void main(String a[])throws Exception{}
	{
		SimpleImageLoad s=new SimpleImageLoad();
		s.init();
		//s.paint(images.jpg);
	}
}