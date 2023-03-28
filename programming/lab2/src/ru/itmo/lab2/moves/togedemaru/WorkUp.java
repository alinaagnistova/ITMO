package ru.itmo.lab2.moves.togedemaru;

import ru.ifmo.se.pokemon.*;


public class WorkUp extends StatusMove{
    public WorkUp(double pow, double acc) { super(Type.NORMAL, pow, acc); }

    @Override
    protected void applySelfEffects(Pokemon p){
        super.applySelfEffects(p);
        Effect EffectObject = new Effect().stat(Stat.ATTACK, 1);
        EffectObject.stat(Stat.SPECIAL_ATTACK, 1);
        p.addEffect(EffectObject);

    }
    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "применил " + pieces[pieces.length-1];
    }
}
