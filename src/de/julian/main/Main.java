package de.julian.main;

import java.util.Collection;

public class Main {

    /*
    * Rules:
    * only one task can be commit as homework( addHomeWork() -> creates HomeWork() instance )
    * Todo:
    *  remove nextSubject() common usage
    *  create User Interface Program
    *   -> low level
    *   -> GUI
    *  solo rule for Freistunde
    *  look for error -> fix: create error system easy to replace
    *
    * FIXME:
    *  you can't have to subjects at same time -> problems with freistunde
    *   solution: remove enum -> new subjects system required
    * */

    public static void main(String[] args) {
        SchoolDay monday = new SchoolDay("KR", "PH", "FREI", "IF", "KdU", "E");  // School Day

        for (String subject : monday.getSubjects()) {
            System.out.println(subject);
        }
    }
}
