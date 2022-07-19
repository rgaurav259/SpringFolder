import java.util.TreeSet;

public class TreesetDemo1 {
    public static void main(String[] args) {
        TreeSet t = new TreeSet();
        t.add("A");//65
        t.add("a");//97
        t.add("B");
        t.add("Z");
        t.add("L");
        //t.add(new Integer(10));//class cast exception
      //  t.add(null);//null pointer exception
//        t.add("a");
//        adding null values at first in treeset was possible until 1.6, but not from 1.7.
//
//                it was considered as defect and java fixed it. now we cannot add null value even at first.

        //emptry tree set we are able to adding null (only one ) because comparing value is not present any.
        System.out.println("t = " + t);//this will print according to default sorting order

//t = [A, B, L, Z, a]
    }
}
