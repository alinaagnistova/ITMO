package ru.itmo.lab3;

public class Main {
    public static void main(String[] args) {
        BodyParts[] tmp = new BodyParts[3];
        tmp[0] = new BodyParts("Голова", "алисы", BodyType.HEAD);
        tmp[1] = new BodyParts("Руки", "длинные", BodyType.ARMS);
        tmp[2] = new BodyParts("Шея", "новая", BodyType.NECK);
        Human alice = new Human("Алиса", "в", tmp, LocationType.SEA);
        Effect awe = new Effect("Трепет", "лёгкий", LocationType.PLAIN);
        Effect sound = new Effect("Звук", "громкий свистящий");
        System.out.println(awe.toString());
        awe.walked();
        alice.raise();
        BodyParts arms = alice.findPartByType(BodyType.ARMS);
        BodyParts head = alice.findPartByType(BodyType.HEAD);
        System.out.println(arms.getName() + " к " + head.getName() + " " + Characteristic.IMPOSSIBLE.getName());
        alice.may();
        alice.toTry();
        alice.tilt();
        System.out.println(" к " + arms.getName() + " " + head.getName());
        alice.didIt(alice.getName());
        System.out.print(Characteristic.FORTUNATELY.getName());
        alice.turnOut();
        BodyParts neck = alice.findPartByType(BodyType.NECK);
        System.out.print(neck.toString());
        neck.bend();
        System.out.println(Characteristic.PERFECTLY.getName());
        System.out.print(Characteristic.ELEGANT.getName());
        neck.tilt();
        System.out.println(neck.getName());
        System.out.print(alice.toString());
        alice.gonna();
        alice.dive();
        System.out.print(alice.getName());
        alice.understand();
        alice.setLocation(LocationType.FOREST);
        alice.walk();
        System.out.println(alice.toString());
        System.out.print(Characteristic.SUDDENLY.getName());
        System.out.print(" " + sound.getDescription() + " " + sound.getName());
        sound.forced(alice);
        sound.recoil();



    }
}