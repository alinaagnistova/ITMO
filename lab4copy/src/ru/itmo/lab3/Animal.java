package ru.itmo.lab3;

import ru.itmo.lab3.enumClasses.AnimalBodyType;
import ru.itmo.lab3.enumClasses.BodyType;
import ru.itmo.lab3.enumClasses.CharacteristicType;
import ru.itmo.lab3.interfaces.Doable;
import ru.itmo.lab3.interfaces.Flyable;
import ru.itmo.lab3.interfaces.Hitable;
import ru.itmo.lab3.interfaces.Speakable;

public class Animal extends Entity implements Hitable, Flyable, Doable, Speakable {
    private AnimalBodyParts[] animalBodyParts = new AnimalBodyParts[1];
    private CharacteristicType characteristic;
    public Animal() {
    }
    public Animal(String name, String description, CharacteristicType characteristic) {
        super(name, description);
        this.characteristic = characteristic;
    }

    public CharacteristicType getCharacteristic() {
        return characteristic;
    }

    public void setCharacteristic(CharacteristicType characteristic) {
        this.characteristic = characteristic;
    }

    public Animal(AnimalBodyParts[] animalBodyParts, CharacteristicType characteristic) {
        this.animalBodyParts = animalBodyParts;
        this.characteristic = characteristic;
    }

    public Animal(String name, String description, AnimalBodyParts[] animalBodyParts, CharacteristicType characteristic) {
        super(name, description);
        this.animalBodyParts = animalBodyParts;
        this.characteristic = characteristic;
    }

    public Animal(String name, AnimalBodyParts[] animalBodyParts, CharacteristicType characteristic) {
        super(name);
        this.animalBodyParts = animalBodyParts;
        this.characteristic = characteristic;
    }

    public Animal(String name, String description, AnimalBodyParts[] animalBodyParts) {
        super(name, description);
        this.animalBodyParts = animalBodyParts;
    }

    public Animal(String name) {
        super(name);
    }

    @Override
    public void hit() {
        AnimalBodyParts wing = new AnimalBodyParts("крылом", "своим", AnimalBodyType.WING);
        System.out.println("ударить " + wing.toString());
    }
    @Override
    public void fly(){
        System.out.print(toString() + " " + "налетела");
    }

    @Override
    public void gonna() {
        System.out.println(getName() + " " + "собиралась");
    }

    @Override
    public void didIt() {
        System.out.println(getName() + " " + "сделала это");
    }

    @Override
    public void may() {
        System.out.println(getName() + " " + "могла");
    }

    @Override
    public void toTry() {
        System.out.print(" стараясь ");
    }

    @Override
    public void turnOut() {
        System.out.println(getName() + " " + "оказалась");

    }

    @Override
    public void speak() {
        System.out.println("-Змея! Ах ты Змея!");
    }

    @Override
    public void shout() {
        System.out.println(getName() + " " + getCharacteristic().getName() + " " + "кричала");
    }

    @Override
    public void ask() {
        System.out.println(getName() + " " + "спросила");
    }


    @Override
    public String toString() {
        return getName() + " " + getDescription() + " " +  getCharacteristic().getName();
    }
    private class AnimalBodyParts extends Entity{
        private AnimalBodyType animalBodyPart;


        public AnimalBodyParts() {
        }

        public AnimalBodyParts(BodyType bodyPart) {
            this.animalBodyPart = animalBodyPart;
        }

        public AnimalBodyParts(String name, String description, AnimalBodyType animalBodyPart) {
            super(name, description);
            this.animalBodyPart = animalBodyPart;
        }

        public AnimalBodyType getAnimalBodyPart() {
            return animalBodyPart;
        }

        public void setAnimalBodyPart(AnimalBodyType animalbodyPart) {
            this.animalBodyPart = animalBodyPart;
        }
    }
}
