import java.io.File;
import java.util.*;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args)  {
        listfiles li=new listfiles("D:\\New folder\\1");
        listfiles li2=new listfiles("D:\\New folder\\2");
        ArrayList<String> comp=new ArrayList<String>();

        for (int i=0;i<li.files.length;i++){
            for(int j=0;j<li2.files.length;j++){
                if (li.files[i].equals(li2.files[j])){
                    comp.add(li.files[i]);
                }
            }
        }
        System.out.println(comp);
        del d;
        for (String s : comp) {
            d = new del("D:\\New folder\\1", s);
        }


    }
}
