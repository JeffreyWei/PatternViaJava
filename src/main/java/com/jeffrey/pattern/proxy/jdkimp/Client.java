package com.jeffrey.pattern.proxy.jdkimp;

import java.lang.reflect.Proxy;

/**
 * Created by wei on 15/5/5.
 */
public class Client {
    public static void main(String[] args) {
        final Person person = new Student();
        Person personProxy = (Person) Proxy.newProxyInstance(person.getClass().getClassLoader(), person.getClass().getInterfaces(), (o, method, objects) -> {
            Object result;
            System.out.println("before");
            result = method.invoke(person, objects);
            System.out.println("after");
            return result;
        });
//        new InvocationHandler() {
//
//                    @Override
//                    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
//                        Object result;
//                        System.out.println("before");
//                        result=method.invoke(person,objects);
//                        System.out.println("after");
//                        return result;
//                    }
//                });
        personProxy.say();
    }
}
