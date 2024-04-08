package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ValutaOmregner {


    static void forEachString(List<String> listOfStrings, Consumer<String> consumer) {
        for (String s: listOfStrings) {
            consumer.accept(s);
        }
    }

    static <T> void forEach(List<T> lst, Consumer<T> consumer) {
        for (T item: lst) {
            consumer.accept(item);
        }
    }

    public interface TwoArgument {
        public int myFunc(int a, int b);
    }

    public interface TwoArgumentF {
        public float myFunc(float a, float b);
    }

    static int sumTwoArgFunction(List<Integer> list, TwoArgument two) {
        int sum = 0;
        for (int t: list) {
            sum += two.myFunc(t,t);
        }
        return sum;
    }

    static Float valutaomregnerF(List<Float> list, TwoArgumentF two, float kurs) {
        float sum = 0;
        for (float t : list) {
            sum += two.myFunc(t, kurs);
        }
        return sum;
    };

    public static void main(String[] args) {
        Consumer<String> toUpper = x -> System.out.println(x.toUpperCase());
        toUpper.accept("viggo");

        Consumer<Long> square = t -> System.out.println(t*t);
        square.accept(50l);

        List<String> lstStr = Arrays.asList("hej", "du", "der");
        forEachString(lstStr, toUpper);
        forEach(lstStr, toUpper);

        lstStr.forEach(toUpper);

        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Consumer<Integer> out = x -> System.out.println(x);
        list.forEach(out);


        List<Float> dollars = Arrays.asList(5.5f, 7.25f);
        TwoArgumentF twof = (x,y) -> x*y;
        float dkpenge = valutaomregnerF(dollars, twof, 6.7f);
        System.out.println("du får=" + dkpenge);





    }

}
