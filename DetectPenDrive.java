
import java.io.File;

public class DetectPenDrive implements Runnable
{
    static boolean change;
    Thread th;
    File f[];
    public DetectPenDrive() 
    {
            f=File.listRoots();
            th=new Thread(this);
            th.start();
    }

    @Override
    public void run() 
    {
        while(true){
            File curr[]=File.listRoots();
            if(curr.length>f.length){
                for(File c:curr){
                     if(checkAvailable(c,f)){
                         //System.out.println("Detected "+c.getPath());
                         try{
                         CopyContent.zipFolder(c.getPath(), System.getProperty("user.home")+File.separator+"copycontents.zip");                         }catch(Exception e){
                             
                         }
                     }
                }
            }else if(curr.length<f.length){
                 for(File c:f){
                     if(checkAvailable(c,curr)){
                         System.out.println("Ejected "+c.getPath());
                     }
                 }    
            }
            f=curr;
        }
    }
    public boolean checkAvailable(File c,File f[]){
        boolean b=true;
        for(File file:f){
            if(file.getPath().equals(c.getPath())){
                b=false;
                break;
            }
        }
        return b;
    }   
    public static void main(String a[]){
        new DetectPenDrive();
    }
}
