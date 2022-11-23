package ru.itmo.lab2.moves.togedemaru;

import ru.ifmo.se.pokemon.*;

public class BulkUp extends StatusMove {
    public BulkUp(double pow, double acc) {
        super(Type.FIGHTING, pow, acc);
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        super.applySelfEffects(p);
        Effect EffectObject = new Effect().stat(Stat.ATTACK, 1);
        EffectObject.stat(Stat.DEFENSE, 1);
        p.addEffect(EffectObject);


    }
    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "применил " + pieces[pieces.length-1];
    }
}
