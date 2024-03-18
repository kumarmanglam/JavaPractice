package org.javaCore.predicate;

import java.util.function.Predicate;

public class PredicateAndOperation {
    public static void main(String[] args) {
        String[] arr = {"sdfasd", "gasd", "sd", "sdfa"};

        Predicate<String> p = s -> s.charAt(0) == 's';
        Predicate<String> p2 = s -> s.length() > 3;

//        for(String s: arr){
//            if(p.and(p2).test(s)){
//                System.out.println(s);
//            }
//        }
//        System.out.println(p.or(p2).test("sdfasdf"));
//        System.out.println("hei");

        System.out.println(p.and(p2).test("sdfasdf"));  // and
        System.out.println(p.or(p2).test("sdfasdf"));   // or
        Predicate<String> pNegate = p.negate(); // this will return predicate // negate
        Predicate<String> pEqual = Predicate.isEqual("kumar");  //equal
        System.out.println(pNegate.test("ssdfasdf"));
    }
}
