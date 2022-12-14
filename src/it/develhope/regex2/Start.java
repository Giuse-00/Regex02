package it.develhope.regex2;

public class Start {

    public static void main(String[] args) {

        String c = "tup tuup tuuup tuuuup";

        String b = c.replaceAll("[u]{2,3}", "x");

        System.out.println(b);
    }
}
