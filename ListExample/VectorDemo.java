import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {

        Vector v = new Vector<>();
//        Integer i=v.capacity();
        //System.out.println("i = " + i);
        System.out.println("initial capacity is : " +v.capacity());
        for (int i=1;i<=10;i++){
            v.addElement(i);
        }
        System.out.println("Now capacity is : " +v.capacity());
        v.addElement("A");
        System.out.println("Now after reaches it's max capacity is : " +v.capacity());

    }
}
