package com.shangshangqian.actual;

import org.junit.Test;

public class LRUMapTest {

    @Test
    public void put() throws Exception {
        LRUMap<String,Integer> lruMap = new LRUMap(3) ;
        lruMap.put("1",1) ;
        lruMap.put("2",2) ;
        lruMap.put("3",3) ;

        System.out.println(lruMap.toString());

        lruMap.put("4",4) ;
        System.out.println(lruMap.toString());

        lruMap.put("5",5) ;
        System.out.println(lruMap.toString());
    }
    @Test
    public void put2() throws Exception {
        LRUMap<String,Integer> lruMap = new LRUMap(4) ;
        lruMap.put("1",1) ;
        lruMap.put("2",2) ;
        lruMap.put("3",3) ;

        System.out.println(lruMap.toString());

        lruMap.put("4",4) ;
        System.out.println(lruMap.toString());

        lruMap.put("5",5) ;
        System.out.println(lruMap.toString());
    }

    @Test
    public void put3() throws Exception {
        LRUMap<String,Integer> lruMap = new LRUMap(4) ;
        lruMap.put("1",1) ;
        lruMap.put("2",2) ;
        lruMap.put("3",3) ;
        lruMap.put("2",2) ;

        System.out.println(lruMap.toString());

        lruMap.put("4",4) ;
        System.out.println(lruMap.toString());

        lruMap.put("5",5) ;
        System.out.println(lruMap.toString());
    }

    @Test
    public void put4() throws Exception {
        LRUMap<String,Integer> lruMap = new LRUMap(3) ;
        lruMap.put("1",1) ;
        lruMap.put("2",2) ;
        lruMap.put("3",3) ;

        System.out.println(lruMap.toString());
        lruMap.put("2",2) ;

        System.out.println(lruMap.toString());

    }

    @Test
    public void get() throws Exception {
        LRUMap<String,Integer> lruMap = new LRUMap(3) ;
        lruMap.put("1",1) ;
        lruMap.put("2",2) ;
        lruMap.put("3",3) ;

        System.out.println(lruMap.toString());
        System.out.println("==============");

        Integer integer = lruMap.get("1");
        System.out.println(integer);
        System.out.println("==============");
        System.out.println(lruMap.toString());
    }

    @Test
    public void get2() throws Exception {
        LRUMap<String,Integer> lruMap = new LRUMap(3) ;
        lruMap.put("1",1) ;
        lruMap.put("2",2) ;
        lruMap.put("3",3) ;

        System.out.println(lruMap.toString());
        System.out.println("==============");

        Integer integer = lruMap.get("2");
        System.out.println(integer);
        System.out.println("==============");
        System.out.println(lruMap.toString());
    }

    @Test
    public void get3() throws Exception {
        LRUMap<String,Integer> lruMap = new LRUMap(3) ;
        lruMap.put("1",1) ;
        lruMap.put("2",2) ;
        lruMap.put("3",3) ;

        System.out.println(lruMap.toString());
        System.out.println("==============");

        Integer integer = lruMap.get("3");
        System.out.println(integer);
        System.out.println("==============");
        System.out.println(lruMap.toString());
    }

}