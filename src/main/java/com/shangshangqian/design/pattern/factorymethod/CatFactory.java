package com.shangshangqian.design.pattern.factorymethod;

/**
 * Function:
 *
 * @author shangshangqian
 *         Date: 19/03/2018 15:21
 * @since JDK 1.8
 */
public class CatFactory implements AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Cat();
    }
}
