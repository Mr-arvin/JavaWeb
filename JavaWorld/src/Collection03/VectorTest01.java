package Collection03;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Vector 基本上不怎么用了
 */

public class VectorTest01 {
    public static void main(String[] args){
        Vector v = new Vector ();
        v.addElement ("a");
        v.addElement ("b");
        v.addElement ("c");
        v.addElement ("d");

        Enumeration e = v.elements ();

        while (e.hasMoreElements ()){
            System.out.println (e.nextElement ());
        }
    }
}
