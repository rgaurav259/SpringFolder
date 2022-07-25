package com.java.lambdaExprssion;

import java.util.function.Consumer;

class Movie{
    String movieName;

    //constructor
    Movie(String movieName){
        this.movieName=movieName;
    }

}


public class ConsumerDemo {

    public static void main(String[] args) {

        Consumer<Movie> c1 = m-> System.out.println(m.movieName+" ready to release");
        Consumer<Movie> c2 = m-> System.out.println(m.movieName+" BIggest Flop movie");
        Consumer<Movie> c3 = m-> System.out.println(m.movieName+" store the information of DB...");

        Consumer<Movie> cc = c1.andThen(c2).andThen(c3);

        Movie m = new Movie("Spider");
        Movie m1 = new Movie("JOHN WICK");
        cc.accept(m1);
        cc.accept(m);
    }


}
