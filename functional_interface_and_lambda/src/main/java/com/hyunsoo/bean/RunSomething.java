package com.hyunsoo.bean;

/**
 * 1.추상메소드가 하나만 있어야, 함수형 인터페이스가 됩니다.
 *
 * 2. static method를 정의 할 수 있습니다.
 *
 * 3. default method를 정의하여 사용할 수 있습니다.
 */

@FunctionalInterface
public interface RunSomething {

    void doIt();

    static void printName(){
        System.out.println("RunSomething Function");
    }

    default void printAge(){
        System.out.println("29");
    }
}
