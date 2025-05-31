package org.cases;

import org.cases.object_cases.HashCodeCase;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Set<HashCodeCase> people = new HashSet<>();

        HashCodeCase p1 = new HashCodeCase("Indi");
        HashCodeCase p2 = new HashCodeCase("Indi");


        people.add(p1);

        System.out.println();



    }

}