package ru.itmo.lab3;


import java.util.Objects;

public class BodyParts extends Entity implements Bendable {
    private BodyType bodyPart;


    public BodyParts() {
    }

    public BodyParts(BodyType bodyPart) {
        this.bodyPart = bodyPart;
    }

    public BodyParts(String name, String description, BodyType bodyPart) {
        super(name, description);
        this.bodyPart = bodyPart;
    }

    public BodyType getBodyPart() {
        return bodyPart;
    }



    public void setBodyPart(BodyType bodyPart) {
        this.bodyPart = bodyPart;
    }

    @Override
    public void tilt() {
        String how = "плавным зигзагом ";
        System.out.print(" изогнув " + how);
    }

    @Override
    public void bend() {
        String direction = "в любом направлении";
        System.out.print(" гнётся " + direction + " ");
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BodyParts bodyParts)) return false;
        if (!super.equals(o)) return false;
        return getBodyPart() == bodyParts.getBodyPart();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getBodyPart());
    }
}
