package ru.itmo.lab3.enumClasses;

public enum TimeType {
    WHEN("когда"),
    JUST_NOW("только что"),
    NOW;
    private String name;

    TimeType() {
    }

    TimeType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
