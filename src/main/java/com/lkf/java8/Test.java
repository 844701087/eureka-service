package com.lkf.java8;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by likaifeng on 2017/11/16.
 */
public class Test {

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<String> list = new ArrayList<>();
        list.add("abc1def");
        list.add("abcde");
        list.add("abc1defg");
        list1.addAll(list);
        
        list.removeIf(ele -> ele.length()>5);//从lis集合中删除长度大于5的元素
        System.out.println(list.contains(""));//查看list集合中是否包含
        list.stream().forEach(ele -> System.out.println(ele));
        System.out.println("--------------------");
        list.parallelStream().forEachOrdered(ele -> System.out.println(ele));


    }
}
