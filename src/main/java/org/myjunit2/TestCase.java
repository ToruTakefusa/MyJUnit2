package org.myjunit2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class TestCase {

    public TestResult run(Class clazz) {
        Object instance = null;
        String className = clazz.getName();

        try {
            instance = clazz.getDeclaredConstructor().newInstance();
            System.out.println("Constructor is ");
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            System.out.println("Cannot find constructor");
            e.printStackTrace();
        }

        List<Method> methods = Arrays.asList(clazz.getDeclaredMethods());
        for (Method method : methods) {
            if (!Objects.isNull(method.getAnnotation(Test.class))) {
                String name = null;
                try {
                    name = method.getName();
                    method.invoke(instance);
                    return new TestResult(className, name, true);
                } catch (AssertFailedException e) {
                    return new TestResult(className, name, false);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    System.out.println("Cannot execute test methods");
                    e.printStackTrace();
                }
            }
        }
        return null;
    }
}
