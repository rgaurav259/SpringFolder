package com.example.reactiveprogrammingtut.service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class FluxAndMonoServices {
    public Flux<String> fruitsFlux(){
        return Flux.fromIterable(List.of("Mango","Orange","Banana")).log();
    }
    public Flux<String> fruitsFluxmap(){
        return Flux.fromIterable(List.of("Mango","Orange","Banana"))
                .map(String::toUpperCase)
                .log();
    }

    //filter
    public Flux<String> fruitsFluxfilter(int num){
        return Flux.fromIterable(List.of("Mango","Orange","Banana"))
                .filter(x-> x.length() > num);
    }

//    filter and map as well
    public Flux<String> fruitsFluxfilterAndMap(int num){
        return Flux.fromIterable(List.of("Mango","Orange","Banana"))
                .filter(x-> x.length() > num)
                .map(String::toUpperCase);
    }
    //fruitsFluxFilterIterateSplit
    public Flux<String> fruitsFluxflateSplit(){
        return Flux.fromIterable(List.of("Mango","Orange","Banana"))
                .flatMap(x->Flux.just(x.split("")));

    }

    public Flux<String> fruitsFluxflateSplitAsync(){
        return Flux.fromIterable(List.of("Mango","Orange","Banana"))
                .flatMap(x->Flux.just(x.split("")))
                .delayElements(Duration.ofMillis(new Random().nextInt(1000)))
                .log();

    }


    public Mono<String> fruitMono(){
        return Mono.just("mango").log();//sigle elements that's why not use iterable
    }

    public Mono<List<String>> fruitMonoFlatMap(){
        return Mono.just("Mango")
                .flatMap(s -> Mono.just(List.of(s.split(""))))
                .log();
    }

    public static void main(String[] args) {
        FluxAndMonoServices fluxAndMonoServices = new FluxAndMonoServices();
        //to run we have to first subscribe4
        fluxAndMonoServices.fruitsFlux().subscribe(s -> {
            System.out.println("s = " + s);
        });

        fluxAndMonoServices.fruitMono().subscribe(s->{
            System.out.println("Mono->  = " + s);
        });

        fluxAndMonoServices.fruitsFluxmap().subscribe(s -> {
            System.out.println("fluxAndMonoServices = " + s);
        });

        fluxAndMonoServices.fruitsFluxflateSplit()
                .subscribe(s->{
                    System.out.print(" " + s);
                });
    }
}
