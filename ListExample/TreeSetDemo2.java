import java.util.TreeSet;

public class TreeSetDemo2 {
    public static void main(String[] args) {
        TreeSet t = new TreeSet();
//        t.add(new StringBuffer("A"));
//        t.add(new StringBuffer("B"));
//        System.out.println("t = " + t);
        //java 11 version allow us to add because StringBuffer implements the comparable interface
        //stringbuilder also implements comparable interface
        t.add(new StringBuilder("C"));
        t.add(new StringBuilder("Z"));
        System.out.println("t = " + t);

        // we cannot add both object builder and buffer at the same time


        //

    }
}
