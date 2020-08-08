import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class out {
    public out(String add,String pathname){
        try {
            OutputStream os = new FileOutputStream(String.valueOf(pathname.charAt(pathname.length()-1)));
            OutputStreamWriter log = new  OutputStreamWriter(os);
            log.write(add);
            log.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
