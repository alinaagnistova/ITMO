package ru.itmo.lab3;

import ru.itmo.lab3.enumClasses.CharacteristicType;

public class Characteristic extends Entity {
    private CharacteristicType characteristic;

    public Characteristic() {
    }

    public Characteristic(CharacteristicType characteristic) {
        this.characteristic = characteristic;
    }

    public CharacteristicType getCharacteristic() {
        return characteristic;
    }

    public void setCharacteristic(CharacteristicType characteristic) {
        this.characteristic = characteristic;
    }
}
