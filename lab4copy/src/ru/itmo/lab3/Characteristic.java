package ru.itmo.lab3;

import ru.itmo.lab3.enumClasses.CharacteristicType;

public class Characteristic extends Entity{
    private CharacteristicType characteristic;
    public Characteristic() {
    }

    public Characteristic(CharacteristicType characteristic) {
        this.characteristic = characteristic;
    }

    public Characteristic(String name, String description, CharacteristicType characteristic) {
        super(name, description);
        this.characteristic = characteristic;
    }

    public Characteristic(String name, CharacteristicType characteristic) {
        super(name);
        this.characteristic = characteristic;
    }

    public Characteristic(String name, String description) {
        super(name, description);
    }

    public Characteristic(String name) {
        super(name);
    }

    public CharacteristicType getCharacteristic() {
        return characteristic;
    }

    public void setCharacteristic(CharacteristicType characteristic) {
        this.characteristic = characteristic;
    }
}
