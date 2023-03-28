package ru.itmo.lab3;

import ru.itmo.lab3.enumClasses.*;
import ru.itmo.lab3.error.IncorrectBodyException;

public class Main {
    public static void main(String[] args) {
        BodyParts[] bodyParts = new BodyParts[5];
        bodyParts[0] = new BodyParts("Голова", BodyType.HEAD);
        bodyParts[1] = new BodyParts("Руки", "длинные", BodyType.ARMS);
        bodyParts[2] = new BodyParts("Шея", "новая", "бесконечно длинная", BodyType.NECK, CharacteristicType.LIKE_A_MAST, LocationType.ANY);
        bodyParts[3] = new BodyParts("Лицо", BodyType.FACE);
        bodyParts[4] = new BodyParts("Глаза", "во все", BodyType.EYES);
        Human alice = new Human("Алиса", "в", bodyParts, LocationType.SEA);
        Effect awe = new Effect("Трепет", "лёгкий", LocationType.PLAIN);
        Effect sound = new Effect("Звук", "громкий свистящий");
        Animal dove = new Animal("Голубка", "большая", CharacteristicType.FIERCELY);
        Location.Time currentTime = new Location.Time(TimeType.NOW);
        Characteristic abstractCharacteristic = new Characteristic(CharacteristicType.BASE);
        try {
            BodyParts eyes = alice.findPartByType(BodyType.EYES);
            System.out.println(eyes.getDescription() + " " + eyes.getName());
            alice.see();
        } catch (IncorrectBodyException e) {
            System.err.println(e.getMessage());
        }
        System.out.print(RussianInserts.BUT.getName());
        interface Visible {
            void beVisible();
        }
        Visible nothing = new Visible() {
            @Override
            public void beVisible() {
                System.out.println(Direction.BOTTOM.getName() + " " + "ничего не было видно");
            }
        };
        nothing.beVisible();
        System.out.println(RussianInserts.EXCEPT.getName());
        BodyParts neck = alice.findPartByType(BodyType.NECK);
        neck.surge();
        System.out.println(neck.getCharacteristicType().getName() + " " + neck.getLocationType().getDescription());
        alice.speak();
        alice.shout();
        alice.ask();
        alice.toTry();
        alice.wiggle();
        BodyParts arms = alice.findPartByType(BodyType.ARMS);
        System.out.print(arms.getName());
        System.out.print(RussianInserts.BUT.getName());
        abstractCharacteristic.setCharacteristic(CharacteristicType.ALMOST);
        System.out.print(abstractCharacteristic.getCharacteristic().getName());
        abstractCharacteristic.setCharacteristic(CharacteristicType.VAIN);
        System.out.println(abstractCharacteristic.getCharacteristic().getName());
        awe.walked();
        System.out.println(RussianInserts.WELL_THEN.getName() + " " + RussianInserts.IF.getName());
        alice.raise();
        BodyParts head = alice.findPartByType(BodyType.HEAD);
        System.out.println(arms.getName() + RussianInserts.TO.getName() + head.getName() + " " + CharacteristicType.IMPOSSIBLE.getName());
        alice.may();
        alice.toTry();
        alice.tilt();
        System.out.println(RussianInserts.TO.getName() + arms.getName() + " " + head.getName());
        alice.didIt();
        abstractCharacteristic.setCharacteristic(CharacteristicType.FORTUNATELY);
        System.out.print(abstractCharacteristic.getCharacteristic().getName());
        alice.turnOut();
        System.out.println(RussianInserts.WHAT.getName());
        neck.bend();
        abstractCharacteristic.setCharacteristic(CharacteristicType.PERFECTLY);
        System.out.println(abstractCharacteristic.getCharacteristic().getName() + neck.getLocationType().getDescription());
        abstractCharacteristic.setCharacteristic(CharacteristicType.ELEGANT);
        System.out.println(abstractCharacteristic.getCharacteristic().getName());
        neck.tilt();
        alice.gonna();
        alice.dive();
        System.out.println(RussianInserts.IN.getName() + " " + alice.getLocation().toString());
        alice.understand();
        currentTime.setTime(TimeType.WHEN);
        System.out.println(currentTime.getTime().getName());
        alice.setLocation(LocationType.FOREST);
        alice.walk();
        abstractCharacteristic.setCharacteristic(CharacteristicType.SUDDENLY);
        System.out.println(abstractCharacteristic.getCharacteristic().getName());
        sound.force();
        sound.recoil();
        System.out.println(alice.getName());
        dove.fly();
        dove.toTry();
        dove.hit();
        BodyParts face = alice.findPartByType(BodyType.FACE);
        System.out.println(alice.getName() + " " + Direction.STRAIGHT.getName() + RussianInserts.IN.getName() + face.getName());
        dove.speak();
        dove.setCharacteristic(CharacteristicType.DESPERATELY);
        dove.shout();


    }
}