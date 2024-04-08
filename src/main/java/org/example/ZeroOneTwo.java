package org.example;

public class ZeroOneTwo {

    public interface ZeroArgument {
        public void myFunc();
    }

    public static void printZero(ZeroArgument z0) {
        z0.myFunc();
    }

    public interface OneArgument {
        public void myFunc(String str);
    }

    public interface TwoArgument {
        public int myFunc(int a, int b);
    }


    public static void main(String[] args) {
        ZeroArgument z = () -> System.out.println("I am a functional interface");
        printZero(z);
        OneArgument out = (str) -> System.out.println(str);
        out.myFunc("hej jeg er arg");

        TwoArgument two = (x,y) -> x+y;
        int i1 = two.myFunc(5,6);
        System.out.println("i1=" + i1);

        TwoArgument twoMult = (x,y) -> x*y;
        int i2 = twoMult.myFunc(4,5);
        System.out.println("i2= " + i2);

        //System.out.println("Hello world!");

    }

}
