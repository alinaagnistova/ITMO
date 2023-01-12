package ru.itmo.lab3;

import ru.itmo.lab3.enumClasses.LocationType;
import ru.itmo.lab3.interfaces.Able;
import ru.itmo.lab3.interfaces.Seeable;

import java.util.Objects;

public class Effect extends Entity implements Able {
    private LocationType location;

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

    public void walked() {
        System.out.println(getLocation().getDescription() + " " + toString() + " " + "прошёл");
    }

    public void force() {
        System.out.print(toString() + " " + "заставил ");
    }


    public void recoil() {
        System.out.print("отпрянуть ");
    }

    public LocationType getLocation() {
        return location;
    }

    public void setLocation(LocationType location) {
        this.location = location;
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

}
