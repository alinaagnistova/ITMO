package ru.itmo.lab3;

import ru.itmo.lab3.enumClasses.Direction;
import ru.itmo.lab3.enumClasses.LocationType;
import ru.itmo.lab3.interfaces.Able;
import ru.itmo.lab3.interfaces.Seeable;

import java.util.Objects;

public class Effect extends Entity implements Able, Seeable {
    private LocationType location;
    //private Direction direction;
/*
    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public Effect(String name, Direction direction) {
        super(name);
        this.direction = direction;
    }

    public Effect(LocationType location, Direction direction) {
        this.location = location;
        this.direction = direction;
    }

    public Effect(String name, String description, LocationType location, Direction direction) {
        super(name, description);
        this.location = location;
        this.direction = direction;
    }

    public Effect(String name, LocationType location, Direction direction) {
        super(name);
        this.location = location;
        this.direction = direction;
    }
    */

    public Effect() {
    }

    public Effect(String name) {
        super(name);
    }

    public Effect(String name, String description) {
        super(name, description);
    }

    public Effect(String name, String description, LocationType location) {
        super(name, description);
        this.location = location;
    }

    public void walked(){
        System.out.println(getLocation().getDescription() + " " + toString() + " " + "прошёл");
    }
    public void force(){
        System.out.print(toString() + " " + "заставил ");
    }


    public void recoil(){
        System.out.print("отпрянуть ");
    }


    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Effect effect)) return false;
        if (!super.equals(o)) return false;
        return location == effect.location;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), location);
    }

    @Override
    public void see() {
        System.out.println(getName() + " " + "смотреть");
    }

    public LocationType getLocation() {
        return location;
    }

    public void setLocation(LocationType location) {
        this.location = location;
    }
}
