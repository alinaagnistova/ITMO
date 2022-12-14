package ru.itmo.lab3;

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
}
