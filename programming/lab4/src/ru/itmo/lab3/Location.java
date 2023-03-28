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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Location location1)) return false;
        if (!super.equals(o)) return false;

        return getLocation() == location1.getLocation();
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + getLocation().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return super.toString() + ' ' + location.getName() + location.getDescription();
    }
    public static class Time{
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

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Time time1)) return false;

            return getTime() == time1.getTime();
        }

        @Override
        public int hashCode() {
            return getTime().hashCode();
        }

        @Override
        public String toString() {
            return "Time{" +
                    "time=" + time +
                    '}';
        }
    }
    }


