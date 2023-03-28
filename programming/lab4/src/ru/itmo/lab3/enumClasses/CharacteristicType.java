package ru.itmo.lab3.enumClasses;

public enum CharacteristicType {
    IMPOSSIBLE("невозможно"),
    FORTUNATELY("к счастью"),
    PERFECTLY(" великолепно "),
    ELEGANT("изящно"),
    SUDDENLY("вдруг"),
    FIERCELY("яростно"),
    ALMOST("почти "),
    VAIN("безрезультатно"),
    LIKE_A_MAST("словно мачта"),
    DESPERATELY("отчаянно"),
    BASE
    ;
    private String name;
    CharacteristicType(){}

    CharacteristicType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
