package com.shangshangqian.synchronize;

/**
 * Function:Synchronize 演示
 *
 * @author shangshangqian
 *         Date: 02/01/2018 13:27
 * @since JDK 1.8
 */
public class Synchronize {

    public static void main(String[] args) {
        synchronized (Synchronize.class){
            System.out.println("Synchronize");
        }
    }
}
