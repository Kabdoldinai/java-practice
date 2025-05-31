package org.cases.object_cases;

import java.util.HashSet;
import java.util.Set;

public class HashCodeCase implements Cloneable{

    private String name;

    public HashCodeCase(String person) {
        this.name = person;
    }

    public String getPerson() {
        return name;
    }


    @Override
    public boolean equals(Object o) {
        if(o == this) return true;

        if(!(o instanceof HashCodeCase)) return false;

        HashCodeCase other = (HashCodeCase) o;
        return name.equals(other.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }



//    Set<Person> people = new HashSet<>();
//
//    Person p1 = new Person("Indi"); // hashCode 2283658
//    Person p2 = new Person("Indi"); // hashCode 2283658
//
//        people.add(p1);
//        System.out.println(p1.getPerson().hashCode());
//        System.out.println(p2.getPerson().hashCode());
//        System.out.println(people.contains(p2));
}
