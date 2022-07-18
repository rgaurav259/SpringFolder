import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.RandomAccess;

public class ArrayListExample {

    public static void main(String[] args) {
        ArrayList al = new ArrayList<>();
        al.add("A");
        al.add(10);
        al.add("A");
        al.add(null);
        System.out.println("al = " + al);
        al.remove(2);
        System.out.println("al = " + al);
        al.add(2,"M");
        al.add("N");
        System.out.println("al = " + al);
//implements arraylist and linkedlist serializaable or not
        ArrayList list1=new ArrayList();
        LinkedList ll2= new LinkedList<>();
        System.out.println(list1 instanceof Serializable);//true
        System.out.println(ll2 instanceof Serializable);//true

        System.out.println(ll2 instanceof Cloneable); //true
        System.out.println(list1 instanceof Cloneable);//true

        System.out.println(list1 instanceof RandomAccess) ;//true
        System.out.println(ll2 instanceof RandomAccess);//false


        
    }
}
