
package ru.itmo.lab2.moves.surskit;

import ru.ifmo.se.pokemon.*;

public class QuickAttack extends PhysicalMove {

    public QuickAttack(double pow, double acc, int priority, int hits) {
        super(Type.NORMAL, pow, acc, priority, hits);
    }


    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "применил " + pieces[pieces.length - 1];
    }
}


