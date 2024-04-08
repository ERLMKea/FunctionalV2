package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class MainSoldier {

    public static void main(String[] args) {
        List<Soldier> soldiers = new ArrayList<>();
        soldiers.add(new Soldier(5, "Jens"));
        soldiers.add(new Soldier(3, "Jens2"));
        soldiers.add(new Soldier(5, "Viggo"));
        soldiers.add(new Soldier(2, "Anders"));
        soldiers.add(new Soldier(5, "Jens3"));

        soldiers.forEach(s -> System.out.println(s));

        Predicate<Soldier> isHighRanked = soldier -> soldier.getRank() > 3;

        List<Soldier> highList = soldiers.stream().filter(isHighRanked).toList();
        highList.forEach(s -> System.out.println(s));
        List<Soldier> highlambda = soldiers.stream().filter(s -> s.getRank()<3).toList();
        highlambda.forEach(s -> System.out.println(s));

        Predicate<Soldier> startsWithJ = s -> s.getName().startsWith("J");
        List<Soldier> startjAndHigh = soldiers.stream().filter(isHighRanked).filter(startsWithJ).toList();
        startjAndHigh.forEach(s -> System.out.println(s));

        //startjAndHigh.stream().filter(isHighRanked)
        List<Soldier> startj2 = soldiers.stream().filter(isHighRanked.and(startsWithJ)).toList();

        List<Soldier> highAndJList = soldiers.stream().toList();
        Function<Soldier, String> getNames = s -> s.getName();
        List<String> names = highAndJList.stream().map(getNames).toList();

        names.forEach(n -> System.out.println(n));

    }

}
