package com.shangshangqian.classloader;

/**
 * Function:
 *
 * @author shangshangqian
 *         Date: 05/03/2018 23:11
 * @since JDK 1.8
 */
public class ChildClass extends SuperClass {
    static {
        System.out.println("ChildClass init");
    }
}
