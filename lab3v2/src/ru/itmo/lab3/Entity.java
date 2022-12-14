package ru.itmo.lab3;

import java.util.Objects;

abstract class Entity {
    private String name;
    private String description;

    public Entity() {
    }

    public Entity(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Entity(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null)  return false;
        if (this == o) return true;
        if (!(o instanceof Entity entity)) return false;
        return Objects.equals(getName(), entity.getName()) && Objects.equals(getDescription(), entity.getDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getDescription());
    }

    @Override
    public String toString() {
        return name + ' ' + description;
    }
}
