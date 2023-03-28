package ru.itmo.lab3;

import java.util.Objects;

public class Effect extends Entity {
    private LocationType location;
    public Effect() {
    }

    public Effect(String name, String description) {
        super(name, description);
    }

    public Effect(String name, String description, LocationType location) {
        super(name, description);
        this.location = location;
    }

    public void walked(){
        String where = "по зелени";
        System.out.println("прошёл" + " " + where);
    }
    public void forced(Human human){
        System.out.print(" заставил " + human.getName() + " ");
    }
    public void recoil(){
        System.out.println("отпрянуть");
    }

    @Override
    public String toString() {
        return super.toString() + ' ' + location.getDescription();
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
