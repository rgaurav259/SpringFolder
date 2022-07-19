import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        LinkedList l=new LinkedList<>();
        l.add("balakrishna");
        l.add("venki");
        l.add("chiru");
        l.add("nag");
        System.out.println("l = " + l);

        ListIterator itr= l.listIterator();
        while (itr.hasNext()){
            String s = (String) itr.next();
            if (s.equals("venki")){
                itr.remove();
            } else if (s.equals("nag")) {
                itr.add("chaitu");
            } else if (s.equals("chiru")) {
                itr.set("charan");
            }
        }
        System.out.println(l);
        System.out.println(itr.getClass().getName());
    }
}
