package com.shangshangqian.stream;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created by xiaojinlu1990@163.com on 2020/11/29 0029.
 */
public class TestCollectionStream {

    public static void main(String[] args) {
        forEachTest();
    }

    //forEachTest
    public static void forEachTest() {
       List list = getList();
        list.stream().filter(el ->el.equals(null)).forEach(System.out::println);


    }
    //mapTest
    public static void mapTest() {

    }
    //filterTest
    public static void filterTest() {

    }
    //limitTest
    public static void limitTest() {

    }
    //sortedTest
    public static void sortedTest() {

    }
    //parallelTest
    public static void parallelTest() {

    }
    //collectorsTest
    public static void collectorsTest() {

    }
    //listTest
    public static void listTest() {

    }
    //getList
    public static List getList() {
        List<Person> list = Lists.newArrayList();
        for (int i = 0; i < 11; i++) {
            Person person = new Person();
            person.setAge(i);
            person.setName("shangshangq"+i);
            list.add(person);

        }
        return list;


    }
    //getMap

}
