package com.lkf.java8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

/**
 * Created by likaifeng on 2017/11/23.
 */
public class AppleTest {

    public static void main(String[] args) {
        List<Apple> inventory = new ArrayList<>();
        inventory.sort(Comparator.comparing(Apple :: getWeight));
        List<Apple> list = ApplePredicateImpl.filterApples(inventory, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return false;
            }
        });
        List<Apple> list1 = ApplePredicateImpl.filterApples(inventory,(Apple apple) -> "req".equals(apple.getColor()));


    }
}
