package org.example;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamerNumbers {

    public static void main(String[] args) {
        Supplier<Double> ran = () -> Math.random();
        Stream<Double> randomNumbers = Stream.generate(ran);
        //randomNumbers.forEach(n -> System.out.println(n));
        Function<Double, Long> dblround = d -> Math.round(d*100);
        Predicate<Long> longEqual = rannum -> rannum % 2 == 0;

        var obj = randomNumbers.map(dblround).filter(longEqual).limit(12);
        obj.forEach(n-> System.out.println(n));


    }

}
