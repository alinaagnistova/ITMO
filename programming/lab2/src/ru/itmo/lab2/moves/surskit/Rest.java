
package ru.itmo.lab2.moves.surskit;
import ru.ifmo.se.pokemon.*;


public class Rest extends StatusMove {
    public Rest(double pow, double acc) { super(Type.PSYCHIC, pow, acc); }

    @Override
    protected void applySelfEffects(Pokemon p) {
        //эффект хп как работает???
        Effect effectHP = new Effect().turns(0).stat(Stat.HP, -9999);
        Effect effectCondition = new Effect().turns(2).condition(Status.SLEEP);
         p.addEffect(effectHP);
         p.addEffect(effectCondition);


    }
    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "применил " + pieces[pieces.length - 1];
    }
}





