package work;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamObject1 {


    public static void main(String[] args) {


        //stream collections ko support karti hai group of objects and aray

        //blank stream

//      Stream<Object> emptyStream=  Stream.empty();
//
//      emptyStream.forEach(e->{
//          System.out.println("e = " + e);
//      });

      String arr[]={"gaurav","gaurav","saurav","gutam"};
      //now perform stream to array
        Stream<String> arr1 = Stream.of(arr);
        arr1.forEach(e->{
            System.out.println("Names = " + e);
        });


        List<String> collect = Arrays.stream(arr).distinct().collect(Collectors.toList());
        System.out.println("collect = " + collect);

    }
}
