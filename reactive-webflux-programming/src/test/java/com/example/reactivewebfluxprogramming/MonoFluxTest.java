package com.example.reactivewebfluxprogramming;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class MonoFluxTest {


    @Test
    public void testMono(){
        //create mono object
        Mono<String> monoString = Mono.just("gaurav").log();
        monoString.subscribe(System.out::println);

    }

    @Test
    public void testMono1(){
        //create mono object
        Mono<?> monoString = Mono.just("gaurav")
                .then(Mono.error(new RuntimeException("exception occuredd.."))).log();
        monoString.subscribe(System.out::println,(e)->System.out.println(e.getMessage()));

    }

    @Test
    public void testFlux(){
        //passing n numners of request

        Flux<String> stringFlux = Flux.just("spring","springboot","hibernate")
                .concatWithValues("AWS").log();
        stringFlux.subscribe(System.out::println);

    }
}
