package ru.itmo.lab3.enumClasses;

public enum RussianInserts {
    BUT(" но "),
    AND("и"),
    WELL_THEN("ну что ж"),
    IF("если"),
    TO(" к "),
    WHAT("что"),
    IN(" в "),
    HOW("как"),
    EXCEPT("кроме"),
    ON("над");
    private String name;

    RussianInserts(String name) {
        this.name = name;
    }

    RussianInserts() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
