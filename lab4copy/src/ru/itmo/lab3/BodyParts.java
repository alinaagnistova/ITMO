package ru.itmo.lab3;


import ru.itmo.lab3.enumClasses.BodyType;
import ru.itmo.lab3.enumClasses.CharacteristicType;
import ru.itmo.lab3.enumClasses.LocationType;
import ru.itmo.lab3.interfaces.Bendable;

import java.util.Objects;

public class BodyParts extends Entity implements Bendable{
    private BodyType bodyPart;
    private String additionalDescription;
    private CharacteristicType characteristic;
    private LocationType locationType;

    public CharacteristicType getCharacteristicType() {
        return characteristic;
    }

    public LocationType getLocationType() {
        return locationType;
    }

    public void setLocationType(LocationType locationType) {
        this.locationType = locationType;
    }

    public BodyParts(BodyType bodyPart, String additionalDescription, CharacteristicType characteristic, LocationType locationType) {
        this.bodyPart = bodyPart;
        this.additionalDescription = additionalDescription;
        this.characteristic = characteristic;
        this.locationType = locationType;
    }

    public BodyParts(String name, String description, String additionalDescription, BodyType bodyPart, CharacteristicType characteristic, LocationType locationType) {
        super(name, description);
        this.bodyPart = bodyPart;
        this.additionalDescription = additionalDescription;
        this.characteristic = characteristic;
        this.locationType = locationType;
    }

    public BodyParts(String name, BodyType bodyPart, String additionalDescription, CharacteristicType characteristic, LocationType locationType) {
        super(name);
        this.bodyPart = bodyPart;
        this.additionalDescription = additionalDescription;
        this.characteristic = characteristic;
        this.locationType = locationType;
    }

    public void setCharacteristicType(CharacteristicType characteristic) {
        this.characteristic = characteristic;
    }

    public BodyParts(BodyType bodyPart, String additionalDescription, CharacteristicType characteristic) {
        this.bodyPart = bodyPart;
        this.additionalDescription = additionalDescription;
        this.characteristic = characteristic;
    }

    public BodyParts(String name, String description, String additionalDescription,BodyType bodyPart,  CharacteristicType characteristic) {
        super(name, description);
        this.bodyPart = bodyPart;
        this.additionalDescription = additionalDescription;
        this.characteristic = characteristic;
    }

    public BodyParts(String name, BodyType bodyPart, String additionalDescription, CharacteristicType characteristic) {
        super(name);
        this.bodyPart = bodyPart;
        this.additionalDescription = additionalDescription;
        this.characteristic = characteristic;
    }

    public BodyParts(String name, BodyType bodyPart) {
        super(name);
        this.bodyPart = bodyPart;
    }


    public String getAdditionalDescription() {
        return additionalDescription;
    }

    public void setAdditionalDescription(String additionalDescription) {
        this.additionalDescription = additionalDescription;
    }

    public BodyParts() {
    }

    public BodyParts(BodyType bodyPart, String additionalDescription) {
        this.bodyPart = bodyPart;
        this.additionalDescription = additionalDescription;
    }

    public BodyParts(String name, String description, String additionalDescription, BodyType bodyPart) {
        super(name, description);
        this.bodyPart = bodyPart;
        this.additionalDescription = additionalDescription;
    }

    public BodyParts(String name, BodyType bodyPart, String additionalDescription) {
        super(name);
        this.bodyPart = bodyPart;
        this.additionalDescription = additionalDescription;
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
        class Zigzag extends Entity{
            public Zigzag(String name, String description) {
                super(name, description);
            }
        }
        Zigzag tmp = new Zigzag("зигзагом", "плавным");
        System.out.print("изогнув" + " " + getName() + " " + tmp.toString() + " ");
    }

    @Override
    public void bend() {
        System.out.print(toString() + " " + "гнётся");
    }

    @Override
    public void surge() {
        System.out.print(getName() + " " + "вздымавшейся ");
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
