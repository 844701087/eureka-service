package com.lkf.java8;

import java.util.*;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;

/**
 * Created by likaifeng on 2017/11/27.
 */
public class lambda {

    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.setColor("red");
        apple.setWeight(2);
        Apple apple1 = new Apple();
        apple1.setColor("blue");
        apple1.setWeight(5);
        Apple apple2 = new Apple();
        apple2.setColor("red");
        apple2.setWeight(4);
        List<Apple> list = new ArrayList<>();
        list.add(apple);
        list.add(apple1);
        list.add(apple2);

        //Map<Apple.Color,List<Apple>> map = list.stream().collect(groupingBy(Apple :: getColor));

        /*int sum = list.stream()
                .mapToInt(Apple::getWeight)
                .sum();
        System.out.println(sum);*/

        /*List<String> colorList = list.stream()
                .filter(apple3 -> {
                    System.out.println(apple3.getWeight());
                    return apple3.getWeight() > 3;
                })//选出重量大于某个值的
                .sorted(Comparator.comparing(Apple :: getWeight))//按照重量进项排序
                .map(apple4 -> {
                    System.out.println(apple4.getColor());
                    return apple4.getColor();
                })
                .limit(1)//取出颜色
                .collect(toList());*/


    }
}
