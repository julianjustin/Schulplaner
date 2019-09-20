package de.julian.main;

import java.util.LinkedList;
import java.util.Queue;

public class SchoolDay {

    // TODO Create new useful methods

    private Queue<SchoolSubject> subjectQueue;
    private int subjectsSize;

    public SchoolDay(String ... subjectsArr) {
        subjectQueue = new LinkedList<>();                      // TODO Look for an alternative

        if(subjectsArr.length > 6) {
            System.err.println("You can only have 6 courses!");
            return;
        }

        // TODO Maybe find a new solution
        int nr = 1;                         // Adding courses and setting nr for each course
        for (String e : subjectsArr) {
            SchoolSubject subject = SchoolSubject.valueOf(e);
            subjectQueue.add(subject);
            subject.setId(nr);
            nr++;
        }

        subjectsSize = subjectQueue.size();
    }

    public SchoolSubject getSubject(int id) {
        SchoolSubject solution = null;
        for (SchoolSubject e : subjectQueue) {
            if(e.getId() == id) {
                solution = e;
            }
        }
        return solution;
    }

    public int getSizeOfSubjects() {
        return subjectsSize;
    }
}
