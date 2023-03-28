package ru.itmo.lab2.moves.masquerain;

import ru.ifmo.se.pokemon.*;

public class StunSpore extends StatusMove {
    public StunSpore(double pow, double acc) {
        super(Type.GRASS, pow, acc);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        Effect.paralyze(p);
    }
    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "применил " + pieces[pieces.length-1];
    }
}
