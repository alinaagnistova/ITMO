package ru.itmo.lab3;

public enum Characteristic {
    IMPOSSIBLE("невозможно"),
    FORTUNATELY("к счастью"),
    PERFECTLY("великолепно"),
    ELEGANT("изящно"),
    SUDDENLY("вдруг"),
    ;
    private String name;
    Characteristic(){}

    Characteristic(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
