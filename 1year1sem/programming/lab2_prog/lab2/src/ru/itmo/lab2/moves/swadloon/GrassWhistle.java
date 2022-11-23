package ru.itmo.lab2.moves.swadloon;

import ru.ifmo.se.pokemon.*;

public class GrassWhistle extends StatusMove{
    public GrassWhistle(double pow, double acc) {
        super(Type.GRASS, pow, acc);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        Effect.sleep(p);

    }
    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "применил " + pieces[pieces.length-1];
    }
}
