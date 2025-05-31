package org.cases.singleton;

import java.lang.reflect.Constructor;

public class ReflectionBreakDemo {

    public static void breakPrivateConstructionByReflection() {

        try {
            EnumSingleton instance1 = EnumSingleton.INSTANCE;

            Constructor<EnumSingleton> constructor = EnumSingleton.class.getDeclaredConstructor();
            constructor.setAccessible(true);

            EnumSingleton instance2 = constructor.newInstance(); // create new object

            System.out.println(instance1 == instance2);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
