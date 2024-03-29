package me.whiteship.chapter01.item04;

public class Foo extends AbstractFoo {
    public static void main(String[] args) {
        AbstractFoo abstractFoo = new AbstractFoo() {
        };

        abstractFoo.foo();

        System.out.println(abstractFoo);
    }
}
