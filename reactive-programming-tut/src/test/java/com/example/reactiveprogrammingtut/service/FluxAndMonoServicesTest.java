package com.example.reactiveprogrammingtut.service;

import org.junit.jupiter.api.Test;
import reactor.test.StepVerifier;

class FluxAndMonoServicesTest {

    //plain java classes this is not spring boot project ,i just understand to how it works internally
    FluxAndMonoServices fluxAndMonoServices = new FluxAndMonoServices();

    @Test
    void fruitsFlux() {
//either we can use var or flux var automaically detects the type enference
//        Flux<String> fruitsFlux = fluxAndMonoServices.fruitsFlux();
        var fruitsFlux = fluxAndMonoServices.fruitsFlux();
        StepVerifier.create(fruitsFlux).expectNext("Mango","Orange","Banana")
                .verifyComplete();

    }

    @Test
    void fruitMono() {
        var fruitMono = fluxAndMonoServices.fruitMono();
        StepVerifier.create(fruitMono).expectNext("mango").verifyComplete();
    }

    @Test
    void fruitsFluxmap() {
        var fruitMono = fluxAndMonoServices.fruitsFluxmap();
        StepVerifier.create(fruitMono).expectNext("MANGO","ORANGE","BANANA").verifyComplete();
    }

    @Test
    void fruitsFluxfilter() {
        var fruitMono = fluxAndMonoServices.fruitsFluxfilter(5);
        StepVerifier.create(fruitMono).expectNext("Orange","Banana").verifyComplete();

    }

    @Test
    void fruitsFluxfilterAndMap() {
        var fruitMono = fluxAndMonoServices.fruitsFluxfilterAndMap(5);
        StepVerifier.create(fruitMono).expectNext("ORANGE","BANANA").verifyComplete();

    }

    @Test
    void fruitsFluxfilterSplit() {
        var fruitMono = fluxAndMonoServices.fruitsFluxflateSplit();
        StepVerifier.create(fruitMono).expectNextCount(17).verifyComplete();

    }

    @Test
    void fruitsFluxflateSplitAsync() {
        var fruitMono = fluxAndMonoServices.fruitsFluxflateSplitAsync();
        StepVerifier.create(fruitMono).expectNextCount(17).verifyComplete();

    }

    @Test
    void fruitMonoFlatMap() {
        var fruitMono = fluxAndMonoServices.fruitMonoFlatMap();
        StepVerifier.create(fruitMono).expectNextCount(1).verifyComplete();

    }
}