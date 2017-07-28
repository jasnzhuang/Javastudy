package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("cnmd!");
        Random generator=new Random();
        int value=generator.nextInt();
        int tryeqal=generator.nextInt();
        tryeqal=value;
        System.out.println(tryeqal);
        String searchKeywords="let's count me ! hahahahaahah";
        searchKeywords += " wtf?";
        System.out.println(searchKeywords);
        int nameLength=searchKeywords.length();
        System.out.println(nameLength);
        String letsUpper=searchKeywords.toUpperCase();
        System.out.println(letsUpper);
    }
}
