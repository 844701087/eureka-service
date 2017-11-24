package com.lkf.java8;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by likaifeng on 2017/11/23.
 */
public class ApplePredicateImpl implements ApplePredicate{

    public static List<Apple> filterApples(List<Apple> inventory,ApplePredicate p){
        List<Apple> result = new ArrayList<>();
        for(Apple apple: inventory){
            if(p.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }

    @Override
    public boolean test(Apple apple) {
        return "red".equals(apple.getColor()) && apple.getWeight() > 150;
    }
}
