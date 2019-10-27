package dev.group2.presentation;


import com.sun.prism.shader.Solid_TextureYV12_AlphaTest_Loader;

import java.io.IOException;

public class Zad32 {

    public static void main(String[] args) {

        Zad32 obj = new Zad32();
        try {
            obj.foo();
        } catch (MyException e) {
            System.out.println(e.a);
        } catch (MyException2 e) {
            System.out.println(e);
        }

        try {
            obj.foo();
        } catch (MyException|MyException2 e) {

        }

        try {
            obj.foo2();
        } catch (Exception e) {

        }

        Zad32 o = new OZad32();

        try {
            o.foo();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("finally");
        }
    }




    void foo() throws MyException, MyException2 {
        MyException m2 = new MyException(10);
        MyException m1 = new MyException(20);
        throw m2;
    }

    void foo2() throws Exception {
        MyException m2 = new MyException(10);
        MyException m1 = new MyException(20);
        throw m2;
    }

}

class OZad32 extends Zad32 {

    void foo() throws MyException2B {
        System.out.println("OZad32");
        throw new MyException2B();
    }

}

class MyException2B extends MyException2 {

}

class MyException2 extends Exception {

}

class MyException extends Exception {

    final int a;

    MyException(int a) {
        this.a = a;
    }
}
