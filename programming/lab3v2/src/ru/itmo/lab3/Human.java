package ru.itmo.lab3;

import java.util.Arrays;
import java.util.Objects;

public class Human extends Entity implements Movable, Doable, Bendable {
    private BodyParts[] bodyParts = new BodyParts[5];
    private LocationType location;
    public Human() {
    }

    public Human(String name, BodyParts[] bodyParts, LocationType location) {
        super(name);
        this.bodyParts = bodyParts;
        this.location = location;
    }

    public Human(String name, String description, BodyParts[] bodyParts, LocationType location) {
        super(name, description);
        this.bodyParts = bodyParts;
        this.location = location;
    }

    public Human(String name, String description) {
        super(name, description);
    }

    public Human(String name, String description, BodyParts[] bodyParts) {
        super(name, description);
        this.bodyParts = bodyParts;
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
            if (this.bodyParts[i].getBodyPart().equals(type)) {
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
        String when = "когда";
        System.out.print(when + " гуляла ");
    }

    @Override
    public void dive() {
        System.out.println("нырнуть");
    }

    @Override
    public void tilt() {
        System.out.print("наклонить");
    }

    @Override
    public void pass() {
        System.out.println("пройти");
    }

    @Override
    public void bend() {
        System.out.println("гнуться");
    }
    @Override
    public void raise() {
        System.out.print("поднять ");
    }
    @Override
    public void gonna(){
        System.out.print(" собиралась ");
    }
    @Override
    public void didIt(String var2){
        System.out.println(var2 + " сделала это");
    }
    @Override
    public void understand(){
        System.out.println(" поняла");
    }
    @Override
    public void may(){
        System.out.print("можно");
    }
    @Override
    public void toTry(){
        System.out.print(" попробовать ");
    }
    @Override
    public void turnOut(){
        System.out.println(" оказалось");
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
