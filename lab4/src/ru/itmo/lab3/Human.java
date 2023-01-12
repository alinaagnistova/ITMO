package ru.itmo.lab3;

import ru.itmo.lab3.enumClasses.BodyType;
import ru.itmo.lab3.enumClasses.LocationType;
import ru.itmo.lab3.enumClasses.RussianInserts;
import ru.itmo.lab3.error.BodyPartDuplicationException;
import ru.itmo.lab3.error.IncorrectBodyException;
import ru.itmo.lab3.interfaces.*;

import java.util.Arrays;
import java.util.Objects;

public class Human extends Entity implements Movable, Doable, Bendable, Able, Understandable, Speakable, Seeable {
    private BodyParts[] bodyParts = new BodyParts[5];
    private LocationType location;
    public Human() {
    }

    public Human(String name, String description, BodyParts[] bodyParts, LocationType location) {
        super(name, description);
        this.bodyParts = bodyParts;
        for (int i = 0; i < 4; i++){
            if (bodyParts[i].equals(bodyParts[i+1])){
                throw new BodyPartDuplicationException("У человека не может быть несколько одинаковых частей тела.");
            }
        }
        this.location = location;
    }

    public LocationType getLocation() {
        return location;
    }

    public void setLocation(LocationType location) {
        this.location = location;
    }

    public BodyParts[] getBodyParts() {
        return bodyParts;
    }

    public BodyParts findPartByType(BodyType type) {
        for (int i = 0; i < this.bodyParts.length; i++){
            if (this.bodyParts[i].getBodyType().equals(type)) {
                return this.bodyParts[i];
            }
        }
        return null;
    }

    public void setBodyParts(BodyParts[] bodyParts) {
        this.bodyParts = bodyParts;
    }

    @Override
    public void walk() {
        System.out.println(getName() + " " + "гуляла " + RussianInserts.IN.getName() + getLocation().toString());
    }

    @Override
    public void dive() {
        System.out.println("нырнуть");
    }

    @Override
    public void tilt() {
        System.out.print(" наклонить");
    }

    @Override
    public void pass() {
        System.out.println(getName() + " " + "пройти");
    }

    @Override
    public void bend() {
        System.out.println(getName() + " " + "гнуться");
    }
    @Override
    public void raise() {
        System.out.print("поднять ");
    }


    @Override
    public void surge() {
        System.out.println(getName() + " " + "вздыматься");

    }

    @Override
    public void wiggle() {
        System.out.print(" пошевелить ");

    }

    @Override
    public void gonna(){
        System.out.print(getName() + " " + "собиралась ");
    }
    @Override
    public void didIt(){
        System.out.println(getName() + " " + "сделала это");
    }

    @Override
    public void understand(){
        System.out.println(getName() + " " + "поняла");
    }

    @Override
    public void recoil() {
        System.out.println(getName() + " " + "отпрянуть");

    }

    @Override
    public void force() {
        System.out.println(getName() + " " + "заставить");

    }

    @Override
    public void may(){
        System.out.print("можно ");
    }
    @Override
    public void toTry(){
        System.out.print(getName()+ " " + "попробовать");
    }
    @Override
    public void turnOut(){
        System.out.print(" оказалось ");
    }

    @Override
    public void speak() {
        System.out.println("-Куда же они могли деваться?");
    }

    @Override
    public void shout() {
        System.out.println(getName() + " " + "громко спросила");
    }

    @Override
    public void ask() {
        System.out.println("-А это что за новое море, интересно! Ой, ручки мои дорогие, и вы пропали! Где вы, ау-у!");
    }

    @Override
    public void see() throws IncorrectBodyException {
        if (this.findPartByType(BodyType.EYES) == null){
            throw new IncorrectBodyException("Глаза не обнаружены");
        }
        System.out.println(getName() + " " + "глядела");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human human)) return false;
        if (!super.equals(o)) return false;
        return Arrays.equals(getBodyParts(), human.getBodyParts()) && getLocation() == human.getLocation();
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(super.hashCode(), getLocation());
        result = 31 * result + Arrays.hashCode(getBodyParts());
        return result;
    }

    @Override
    public String toString() {
        return super.toString() + ' ' + location.getName() + ' ' + location.getDescription();
    }

}
