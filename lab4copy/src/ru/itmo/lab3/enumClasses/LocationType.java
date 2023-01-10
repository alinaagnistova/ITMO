package ru.itmo.lab3.enumClasses;

public enum LocationType {
    SEA("море", "зелёное"),
    PLAIN("обычный","только где-то там, далеко внизу"),
    GREEN("над целым морем зелени"),
    ANY("в любом направлении"),
    FOREST("лес", "Листва на верхушках деревьев казалась зелёным морем"),
    BASE;
    private String name;
    private String description;

    LocationType(){}

    LocationType(String description) {
        this.description = description;
    }

    LocationType(String name, String description) {
        this.name = name;
        this.description = description;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return getName() + " " + getDescription();
    }
}
