package ru.itmo.lab3;


public class BodyParts extends Entity implements Movable {
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
    public void walk() {

    }

    @Override
    public void dive() {

    }

    @Override
    public void tilt() {
        String how = "плавным зигзагом ";
        System.out.print(" изогнув " + how);
    }

    @Override
    public void pass() {

    }

    @Override
    public void bend() {
        String direction = "в любом направлении";
        System.out.print(" гнётся " + direction + " ");
    }

    @Override
    public void raise() {

    }

}
