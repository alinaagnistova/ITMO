package ru.itmo.lab3.enumClasses;

public enum Direction {
    BOTTOM(" внизу"),
    TOP("вверху"),
    STRAIGHT("прямо");
    private String name;

    Direction(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
