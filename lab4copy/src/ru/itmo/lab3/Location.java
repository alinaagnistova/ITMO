package ru.itmo.lab3;

import ru.itmo.lab3.enumClasses.LocationType;
import ru.itmo.lab3.enumClasses.TimeType;

class Location extends Entity {

    private LocationType location;

    public Location(LocationType location) {
        this.location = location;
    }

    public Location(String name, String description) {
        super(name, description);
    }


    public Location(String name, String description, LocationType location) {
        super(name, description);
        this.location = location;
    }

    public Location() {
    }

    public LocationType getLocation() {
        return location;
    }

    public void setLocation(LocationType location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return super.toString() + ' ' + location.getName() + location.getDescription();
    }
    public static class Time extends Entity{
        private TimeType time;

        public TimeType getTime() {
            return time;
        }

        public void setTime(TimeType time) {
            this.time = time;
        }

        public Time(TimeType time) {
            this.time = time;
        }

        public Time(String name, String description, TimeType time) {
            super(name, description);
            this.time = time;
        }

        public Time(String name, TimeType time) {
            super(name);
            this.time = time;
        }

    }
    }


