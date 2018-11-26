import sun.audio.*;
import java.io.*;
class SoundDemo
{
	public static void main(String a[])throws Exception
	{	
		FileInputStream fin=new FileInputStream("sound.au");
		AudioStream stream=new AudioStream(fin);
		AudioPlayer.player.start(stream);
	}
}