package org.example;

import javax.sound.midi.Soundbank;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(2022,9,7);
        Stream<LocalDate> tendates = IntStream.range(1, 10).mapToObj(i -> birthday.plusYears(i));
        var obj = tendates.map(date -> "Year= " + date.getYear() + " ugedag=" + date.getDayOfWeek());
        obj.forEach(System.out::println);


    }

}
