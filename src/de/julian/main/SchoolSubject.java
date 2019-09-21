package de.julian.main;

public enum SchoolSubject {

    //TODO Adding School Subjects

    M("Mathematik", 0),
    E("Englisch", 0),
    D("Deutsch", 0),
    EK("Erdkunde", 0),
    GE("Geschichte", 0),
    IF("Informatik", 0),
    FREI("Freistunde", 0),
    KR("Religion", 0),
    PH("Physik", 0),
    SP("Sport", 0),
    PJK("Auschwitz", 0),
    KU("Kunst", 0);

    String name;
    int id;
    HomeWork homeWork;

    SchoolSubject(String name, int id) {
        setName(name);
        setId(id);
    }

    public void addHomeWork(String task) {
        homeWork = new HomeWork();
        this.homeWork.setTask(task);
    }

    public HomeWork getHomeWork() {
        return homeWork;
    }

    public boolean hasHomeWork() {
        if(getHomeWork()==null) {
            return false;
        } else {
            return true;
        }
    }

    public String getHomeWorkTask() {
        return this.homeWork.getTask();
    }

    public boolean isHomeWorkDone() {
        return this.homeWork.isDone();
    }

    public void finishHomeWork() {
        this.homeWork.setDone(true);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) { this.id = id; }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }


}