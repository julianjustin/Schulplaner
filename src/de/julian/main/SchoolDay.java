package de.julian.main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class SchoolDay {

    private SchoolSubject[] subjectsArray;
    private SchoolSubject currentSubject;

    private int current;

    public SchoolDay(String ... subjects) {
        this.subjectsArray = new SchoolSubject[subjects.length];
        this.current = 0;

        if(subjects.length > 6) {
            System.err.println("You can only have 6 courses!");
            return;
        }

        // Adding Subject instances to Array and initialize with ID
        for (int i = 0; i < subjectsArray.length; i++) {
            subjectsArray[i] = SchoolSubject.valueOf(subjects[i]);
            subjectsArray[i].setId(i+1);
        }

        setCurrentSubject(subjectsArray[current]);
    }

    public void nextSubject() {
        if(current == 5)
            return;

        current++;
        setCurrentSubject(subjectsArray[current]);
    }

    public ArrayList<String> getUnfinishedHomeWork() {
        ArrayList<String> solution = new ArrayList<>();

        for (SchoolSubject subject : subjectsArray) {
            if(subject.hasHomeWork()) {
                if(!subject.getHomeWork().isDone()) {
                    solution.add(subject.getName() + ": " + subject.getHomeWork().getTask());
                }
            }
        }

        return solution;
    }

    // Getters and Setters

    public SchoolSubject getCurrentSubject() {
        return currentSubject;
    }

    public void setCurrentSubject(SchoolSubject currentSubject) {
        this.currentSubject = currentSubject;
    }

    // Unnecessary
    public String[] getSubjects() {
        String[] solution = new String[subjectsArray.length];

        for (int i = 0; i < subjectsArray.length; i++) {
            solution[i] = subjectsArray[i].getId() + ": " + subjectsArray[i].getName();
        }

        return solution;
    }
}
