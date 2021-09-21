package com.hyunsoo.bean;


public class PlayGround {

    public static void main(String[] args) {

        //1. Lambda로 넣어주는 방법
        RunSomething runSomething1 = ()->{
            System.out.println("HELLO LAMBDA");
        };

        //2. 익명 내부 클래스 anonymous inner class
        RunSomething runSomething2 = new RunSomething() {
            @Override
            public void doIt() {
                System.out.println("HELLO, INNER CLASS");
            }
        };

        runSomething1.doIt();
        runSomething2.doIt();
    }
}
