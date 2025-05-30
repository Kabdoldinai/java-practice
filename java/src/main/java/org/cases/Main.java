package org.cases;

import org.cases.objects.JumboEnumSet;
import org.cases.objects.RegularEnumSet;

import java.util.EnumSet;

public class Main {


    public static void main(String[] args) {

        EnumSet<RegularEnumSet> smallSet = EnumSet.allOf(RegularEnumSet.class);
        EnumSet<JumboEnumSet> largeSet = EnumSet.allOf(JumboEnumSet.class);

        System.out.println("small set: {}" +  smallSet.getClass().getName());
        System.out.println("large set: {}" + largeSet.getClass().getName());

    }

}