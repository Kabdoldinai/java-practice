package org.cases.enums;

/**
 *
 * returns the instance of RegularEnumSet if elements < 64
**/
public enum RegularEnumSet {

    A("letter A"),
    B("letter B"),
    C("letter C"),
    D("letter D");

    private final String letter;

    private RegularEnumSet(String letter) {
        this.letter = letter;
    }

    public String getLetter() {
        return letter;
    }

}
