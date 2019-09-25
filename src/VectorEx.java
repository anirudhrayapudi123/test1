import java.util.*;
public class VectorEx {
    public static void main(String[] args){
        Vector<Integer> v=new Vector<>();
        System.out.println(v.size());
        System.out.println(v.capacity());
        v.add(10);
        v.add(10);
        v.add(10);
        v.add(10);
        v.add(10);
        v.add(10);v.add(10);
        v.add(10);
        v.add(10);
        v.add(10);
        //System.out.println(v.size());
        v.add(10);
        //v.ensureCapacity(50);
        System.out.println(v.size());
        System.out.println(v.capacity());
        System.out.println();


    }
}
