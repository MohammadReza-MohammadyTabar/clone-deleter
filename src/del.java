import java.io.File;

public class del {
    public del(String filepath,String filename) {
        try
        {
            File f= new File(filepath+"\\"+filename);           //file to be delete
            if(f.delete())                      //returns Boolean value
            {
                System.out.println(f.getName() + " deleted");   //getting and printing the file name
            }
            else
            {
                System.out.println("failed");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
