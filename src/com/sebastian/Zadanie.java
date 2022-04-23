package com.sebastian;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zadanie {
    public static void main(String[] args) {
        Pattern pattern = java.util.regex.Pattern.compile("(A-Z)(a-z)");
        Matcher matcher = pattern.matcher("Agnieszka");

        System.out.println(matcher.matches());


    }
}
