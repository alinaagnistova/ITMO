package ru.itmo.lab2.moves.togedemaru;
import ru.itmo.lab2.utils.CustomUtils;
import ru.ifmo.se.pokemon.*;


public class FocusBlast extends SpecialMove {
    public FocusBlast(double pow, double acc) {
        super(Type.FIGHTING, pow, acc);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        Effect EffectObject = new Effect();
        if (CustomUtils.chance(0.1)){
           EffectObject.stat(Stat.SPECIAL_DEFENSE, -1);
      }
    }
    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "применил " + pieces[pieces.length-1];
    }
}


