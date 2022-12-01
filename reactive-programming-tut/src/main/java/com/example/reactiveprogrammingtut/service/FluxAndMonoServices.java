package com.example.reactiveprogrammingtut.service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

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

    public Mono<String> fruitMono(){
        return Mono.just("mango").log();//sigle elements that's why not use iterable
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
    }
}
