package org.cases.object_cases;


/**
 * Every object in Java inherits from the Object class,
 * which provides default methods such as equals(), hashCode(), toString(), etc.
 * Some classes override the equals() method to change the default behavior
 * from reference comparison to content comparison.
 */
public class Equals {

    /**
     * Java кэширует объекты Integer в диапазоне от -128 до 127
     **/
    public void checkEquality() {
        Integer obj1 = 100; // создаем с помощью автоупаковки
        Integer obj2 = 100;

        System.out.println(obj1 == obj2);
        // the output will be true because Integer obj in the range of -128 to 127 - so its the same object
        // if the value will 200 then false;
        //  == сравнивает ссылки.
        // Поэтому == даёт true для 100, но дало бы false для 200, даже если значения одинаковы.
    }

    public void sum() {
        Integer obj1 = new Integer(120);
        Integer obj2 = new Integer(120);

        System.out.println(obj1 + obj2); // Unpacking // sum primitive intValue, autoPacking
    }
}
