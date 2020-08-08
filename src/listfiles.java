import java.io.*;
import java.util.ArrayList;


public class listfiles {
    String[] files;
    public listfiles(String pathname) {
        File folder = new File(pathname);

        files = folder.list();

        ;
        for (String file : files)
        {
            System.out.println(file);
           //out e=new out(file.toString(),pathname);

        }

    }

    public String[] getnames(){
        return files;

    }
//    public listfiles() throws IOException {
//        String d;
//        try (
//                Stream<Path> paths = Files.walk(Paths.get("D:\\resize"))) {
//            paths
//                    .filter(Files::isRegularFile);
//
//                   //.forEach(System.out::println);
//
//           //return paths.toString();
//            OutputStream os = new FileOutputStream("log.txt");
//            OutputStreamWriter log = new  OutputStreamWriter(os);
//            log.write(paths.toString());
//            log.close();
//
//
//            }
//        }
//    public void out(String add){
//        try {
//            OutputStream os = new FileOutputStream("log.txt");
//            OutputStreamWriter log = new  OutputStreamWriter(os);
//            log.write(add);
//            log.close();
//        } catch (IOException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//    }
//        catch (IOException e) {
//            System.out.println(e.getMessage());
//
//
//        }

}

