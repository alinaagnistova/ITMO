package ru.itmo.lab3;


import ru.itmo.lab3.enumClasses.BodyType;
import ru.itmo.lab3.enumClasses.CharacteristicType;
import ru.itmo.lab3.enumClasses.LocationType;
import ru.itmo.lab3.interfaces.Bendable;

import java.util.Objects;

public class BodyParts extends Entity implements Bendable {
    private BodyType bodyType;
    private String additionalDescription;
    private CharacteristicType characteristic;
    private LocationType locationType;

    public BodyParts(String name, String description, String additionalDescription, BodyType bodyType, CharacteristicType characteristic, LocationType locationType) {
        super(name, description);
        this.bodyType = bodyType;
        this.additionalDescription = additionalDescription;
        this.characteristic = characteristic;
        this.locationType = locationType;
    }


    public BodyParts(String name, BodyType bodyType) {
        super(name);
        this.bodyType = bodyType;
    }


    public BodyParts() {
    }

    public BodyParts(String name, String description, BodyType bodyType) {
        super(name, description);
        this.bodyType = bodyType;
    }

    @Override
    public void tilt() {
        class Zigzag extends Entity {
            public Zigzag(String name, String description) {
                super(name, description);
            }
        }
        Zigzag zigzag = new Zigzag("зигзагом", "плавным");
        System.out.print("изогнув" + " " + getName() + " " + zigzag.toString() + " ");
    }

    @Override
    public void bend() {
        System.out.print(toString() + " " + "гнётся");
    }

    @Override
    public void surge() {
        System.out.print(getName() + " " + "вздымавшейся ");
    }

    public void setCharacteristicType(CharacteristicType characteristic) {
        this.characteristic = characteristic;
    }

    public CharacteristicType getCharacteristicType() {
        return characteristic;
    }

    public LocationType getLocationType() {
        return locationType;
    }

    public void setLocationType(LocationType locationType) {
        this.locationType = locationType;
    }

    public String getAdditionalDescription() {
        return additionalDescription;
    }

    public void setAdditionalDescription(String additionalDescription) {
        this.additionalDescription = additionalDescription;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BodyParts bodyParts)) return false;
        return getBodyType() == bodyParts.getBodyType();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getBodyType());
    }

}
